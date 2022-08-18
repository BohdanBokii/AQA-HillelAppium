package appium.pages;

import appium.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutomationQaPage {
    RemoteWebDriver driver;

    private void CookieButton() {
        driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class," +
                "'cookie-ntf_agreement')]")).click();
    }

    public AutomationQaPage(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);

        this.driver = driver;
    }

    public void CoachesElement() {
        By ListOfCoaches = By.id("swiper-coaches");
        Util.scrollToElementVisibilityOf(driver, ListOfCoaches);
        CookieButton();
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'swiper-slider_pagination')"
                + "and contains(@class, 'swiper-pagination-clickable')"
                + "and contains(@class, 'swiper-pagination-bullets')]"));

        List<WebElement> List = element.findElements(By.tagName("span"));

        for (int i = 0; i < List.size(); i++) {
            try {
                List<WebElement> webElementList = driver.findElements(By.className("coach-card_group"));

                for (WebElement t : webElementList) {
                    String str = t.findElement(By.tagName("span")).getText();

                    if (!str.equals("")) {
                        System.out.println(str);
                        if (i + 1 < List.size())
                            List.get(i + 1).click();
                        break;
                    }
                }
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}