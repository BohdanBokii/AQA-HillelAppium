package appium.steps;

import appium.pages.AutomationQaPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static appium.steps.BaseAppiumSteps.driver;

public class QaAutomationAppiumSteps {
    AutomationQaPage automationQaPage;

    public QaAutomationAppiumSteps() {

    }

    @When("^Open site \"([^\"]*)\"$")
    public void openSite(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(2000);
        this.automationQaPage = new AutomationQaPage(driver);
    }

    @Then("^Print list of coaches$")
    public void printListOfCoaches() {
        automationQaPage.CoachesElement();
    }
}
