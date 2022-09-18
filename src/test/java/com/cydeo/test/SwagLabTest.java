package com.cydeo.test;

import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabTest {


    @Test
    public void logInTest() throws InterruptedException {

        AppiumDriver<MobileElement> driver = Driver.getDriver();
        System.out.println("driver.getPlatformName() = " + driver.getPlatformName());
        System.out.println("driver.getDeviceTime() = " + driver.getDeviceTime());

        Thread.sleep(3000);

        WebElement username = driver.findElementByAccessibilityId("test-Username");
        username.sendKeys(ConfigurationReader.getProperty("swagUser"));
        WebElement password = driver.findElementByAccessibilityId("test-Password");
        password.sendKeys(ConfigurationReader.getProperty("swagPass"));
        WebElement login = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView");
        login.click();

        Thread.sleep(2000);

        MobileElement products = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup"));

        Assertions.assertTrue(products.isDisplayed());




        Driver.closeDriver();


    }

}
