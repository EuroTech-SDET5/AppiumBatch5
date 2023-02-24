package com.eurotech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class day2 {
    AppiumDriver<MobileElement> driver;
    @Test
    public void amazon() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        desiredCapabilities.setCapability("appPackage","com.amazon.mShop.android.shopping");


        desiredCapabilities.setCapability("appActivity","com.amazon.windowshop.home.HomeLauncherActivity");


        driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(2000);

        driver.closeApp();

    }
}
