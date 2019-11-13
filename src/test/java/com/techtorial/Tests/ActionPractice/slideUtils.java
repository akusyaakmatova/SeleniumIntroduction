package com.techtorial.Tests.ActionPractice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class slideUtils {

public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    public static void horizontalSlide(int num)  {
        driver.get("http://the-internet.herokuapp.com/");
        Actions actions = new Actions(driver);

        WebElement horizontalSlider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizontalSlider.click();

        WebElement slideButton = driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slideButton).moveByOffset(num, 0).build().perform();

        WebElement assertion = driver.findElement(By.xpath("//span[@id='range']"));
        actions.moveToElement(assertion).build().perform();

//        if (num == 1) {
//            actions.clickAndHold(assertion).moveByOffset(1, 0).perform();
//        } else if (num == 2) {
//            actions.clickAndHold(assertion).moveByOffset(5, 0).perform();
//        } else if (num == 3) {
//            actions.clickAndHold(assertion).moveByOffset(15, 0).perform();
//        } else if (num == 4) {
//            actions.clickAndHold(assertion).moveByOffset(35, 0).perform();
//        } else if (num == 5) {
//            actions.clickAndHold(assertion).moveByOffset(55, 0).perform();
//        }else{
//            throw  new Exception("Incorrect value");
//        }

        Assert.assertEquals("4",assertion.getText());

    }

    @Test
    public void testSlide() {

        horizontalSlide(35);


    }



}
