package com.techtorial.iFrameIntro;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrame2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void iFrame() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement input = driver.findElement(By.id("tinymce"));

        input.clear();
        Thread.sleep(4000);
        String expectedTxt="Hello, Techtorial class!!!";
        input.sendKeys(expectedTxt);
        Thread.sleep(4000);
        Assert.assertEquals("Hello, Techtorial class!!!",input.getText());
    }


}