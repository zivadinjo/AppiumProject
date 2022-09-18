package com.cydeo.test;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EtsyWebTestBase extends WebTestBase {

    @Test
    public void Test1() throws InterruptedException {
        driver.get("https://etsy.com");
        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("heart necklace" + Keys.ENTER);

        WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        String firstResultText = firstResult.getText();
        Assertions.assertTrue(firstResultText.contains("Heart"));
    }
}
