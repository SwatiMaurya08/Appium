package com.softhinkers.tests;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.tests
 * @date 3/15/2021
 */
public class BaseClass {
    AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() {

        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            // desiredCapabilities.setCapability("platformName", "Android");
            // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N609ZKJX");
            desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
//            driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
            driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
            //      driver = new IOSDriver<MobileElement>(url, desiredCapabilities);


        } catch (Exception exp) {
            System.out.println("The cause is : " + exp.getCause());
            System.out.println("Message is :" + exp.getMessage());
            exp.getStackTrace();

        }

    }

    @Test
    public void SampleTest() {
        System.out.println("I am inside the Sample Test");
    }


    @AfterSuite
    public void tearDown() {
        driver.close();
        driver.quit();


    }

}
