package appium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
    public static void waitVisibilityOfElement(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitVisibilityOfElement(WebDriver driver, WebElement element, int seconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToElementVisibilityOf(WebDriver d, By by) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        boolean bool = true;
        while (bool) {
            try {
                d.findElement(by);
                bool = false;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,50)");
            }
        }
    }
}
