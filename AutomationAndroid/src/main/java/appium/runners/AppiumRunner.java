package appium.runners;

import appium.steps.BaseAppiumSteps;
import appium.config.AppiumDriverConfig;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/appium/features",
        glue = "appium.steps",
        tags = "@QaAutomation",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE)

public class AppiumRunner {

    @BeforeClass
    public static void start() {
        BaseAppiumSteps.driver = AppiumDriverConfig.initAndroidChrome();
    }

    @AfterClass
    public static void end() {
        BaseAppiumSteps.driver.quit();
    }
}

