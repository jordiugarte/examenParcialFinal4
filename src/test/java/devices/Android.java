package devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevices {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "HUAWEI P10");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("appPackage", "com.android.deskclock");
        desiredCapabilities.setCapability("appActivity", ".AlarmsMainActivity");
        desiredCapabilities.setCapability("platformName", "Android");

        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return appiumDriver;
    }
}
