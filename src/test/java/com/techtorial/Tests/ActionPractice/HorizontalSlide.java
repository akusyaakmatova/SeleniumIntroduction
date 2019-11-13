package com.techtorial.Tests.ActionPractice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlide {


   WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


    @Test
    public void horizontalSlide() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/");
        Actions actions = new Actions(driver);

        WebElement horizontalSlider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizontalSlider.click();


        WebElement slideButton = driver.findElement(By.xpath("//input[@type='range']"));
        Thread.sleep(1000);
       actions.clickAndHold(slideButton).moveByOffset(40,50).build().perform();
       //we can also use drag and drop method with this

    }

   }