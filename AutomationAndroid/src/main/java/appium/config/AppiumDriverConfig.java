package appium.config;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class AppiumDriverConfig {
    public static RemoteWebDriver initAndroidChrome() {
        RemoteWebDriver driver=null;
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability("chromedriverExecutable","C:\\Users\\stan_\\WebDrivers\\chromedriver\\chromedriver.exe");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");//указываем версию Android
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Имя OS
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1800);
        caps.setCapability("--no-reset", true);
        try {
            driver= new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}
