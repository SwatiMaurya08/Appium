package com.softhinkers.tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.tests
 * @date 3/15/2021
 */
public class TestClass extends BaseClass {
    @Test
    public void testOne() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(2000);

        MobileElement mobileElement = driver.findElementByXPath("//input[@name='q']");
        mobileElement.sendKeys("Automation test");
        mobileElement.sendKeys(Keys.ENTER);

        System.out.println("Completed test one...");
    }

}
