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
    public void FormaTest(){

        logger.info("Start test");

        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage form = new FormaPage(driver);
        logger.info("Set User: Name - " + FIRST_NAME);
        form.setFirstNameElement(Basic.FIRST_NAME);
        form.setLastNameElement(Basic.LAST_NAME);
        form.setEmailElement(Basic.EMAIL);
        form.setGenderElement();
        form.setMobileElement(Basic.Mobile);
        form.setDateCalendarElement(Basic.DATE_OF_BIRTH);
        form.setSubjectElement(Basic.SUBJECTS);
        form.setTextAreaElement(Basic.TEXTAREA);

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
