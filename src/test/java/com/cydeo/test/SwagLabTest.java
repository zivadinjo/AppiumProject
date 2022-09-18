package com.cydeo.test;

import com.cydeo.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;

public class SwagLabTest {


    @Test
    public void logInTest() throws InterruptedException {

        AppiumDriver<MobileElement> driver = Driver.getDriver();
        System.out.println("driver.getPlatformName() = " + driver.getPlatformName());
        System.out.println("driver.getDeviceTime() = " + driver.getDeviceTime());

        Thread.sleep(3000);

        Driver.closeDriver();


    }

}
