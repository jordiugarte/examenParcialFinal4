package devices;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDevices {
    public AppiumDriver create() throws MalformedURLException;
}
