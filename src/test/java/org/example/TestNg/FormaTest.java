package org.example.TestNg;

import demoqua.FormaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.SeleniumDriver;


public class FormaTest extends Basic {
    public static WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
       
        driver= SeleniumDriver.getRemoteDriver();
    }

    @Test
    public void FormaTest() throws InterruptedException {

        logger.info("Start test");

        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage form = new FormaPage(driver);
        logger.info("Set User: Name - " + FIRST_NAME);
        Thread.sleep(1000);
        form.setFirstNameElement(Basic.FIRST_NAME);
        Thread.sleep(1000);
        form.setLastNameElement(Basic.LAST_NAME);
        Thread.sleep(1000);
        form.setEmailElement(Basic.EMAIL);
        Thread.sleep(1000);
        form.setGenderElement();
        Thread.sleep(1000);
        form.setMobileElement(Basic.Mobile);
        Thread.sleep(1000);
        form.setDateCalendarElement(Basic.DATE_OF_BIRTH);
        Thread.sleep(3000);
        form.setTextAreaElement(Basic.TEXTAREA);
        Thread.sleep(3000);

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
