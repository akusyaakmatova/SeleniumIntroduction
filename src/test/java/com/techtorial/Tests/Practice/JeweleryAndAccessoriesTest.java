package com.techtorial.Tests.Practice;

import com.techtorial.pages.EtsyHomePage;
import com.techtorial.pages.JeweleryAndAccessoriesPage;
import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class JeweleryAndAccessoriesTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void jewlery() throws InterruptedException {

        driver.get("https://www.etsy.com/");
        JeweleryAndAccessoriesPage jewel = new JeweleryAndAccessoriesPage(driver);
        EtsyHomePage homePage = new EtsyHomePage(driver);

        String firstTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(firstTitle, driver.getTitle());
        System.out.println(firstTitle);

        homePage.jewelPage.click();
        String secondTitle = "Jewelry & Accessories | Etsy";
        Assert.assertEquals(secondTitle, driver.getTitle());
        System.out.println(secondTitle);
        jewel.underTwentyFive.click();

        Thread.sleep(2000);
        Select select = new Select(jewel.shipment);
        select.selectByVisibleText("Germany");

        WebDriverWait wait=new WebDriverWait(driver,4);


//        List<WebElement> allCountry = select.getOptions();
//        int size = allCountry.size();

//        for (int i = 0; i < size; i++) {
//            String country = select.getOptions().get(i).getText();
//            if (country.equals("Germany")) {
//                select.selectByIndex(i);
//            }
//
//        }
//        System.out.println(true+" Germany is veryfied");

   Wait<WebDriver> fluentWait= new FluentWait<>(driver)
           .withTimeout(Duration.ofSeconds(30))//max wait time
           .pollingEvery(Duration.ofSeconds(2)) //frequency
           .ignoring(NoSuchElementException.class);//which exception to ignore











    }





    @AfterTest
    public void tearDown(ITestResult result) throws IOException {//ITestResult --> it gives as a test resukt
        if(result.getStatus() == ITestResult.FAILURE){

            long timestamp = System.currentTimeMillis();
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new java.io.File("src/test/screenshot/" + timestamp+ " .jpg"));

        }
        driver.close();
    }






}