package appium.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class MainAppiumSteps extends BaseAppiumSteps {

    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(2000);
    }

    @And("^Get title$")
    public void getTitle() {
        System.out.println(driver.getTitle());
    }
}
