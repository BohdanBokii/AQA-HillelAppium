package appium.util;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Scroll {

    public static void ScrollNum(MobileElement element, int i) {
        try {
            element.findElement(MobileBy.AndroidUIAutomator
                    ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(" + i + ")"));
        } catch (Exception ignore) {
        }
    }

    public static void ScrollByText(MobileElement element, String string) {
        try {
            element.findElement(MobileBy.AndroidUIAutomator
                    ("new UiScrollable(new UiSelector().scrollable(true))"
                            + ".scrollIntoView(new UiSelector().textContains(" + string + "))"));
        } catch (Exception ignore) {
        }
    }
}
