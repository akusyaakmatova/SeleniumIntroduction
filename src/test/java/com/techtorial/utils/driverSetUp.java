package com.techtorial.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetUp {

    WebDriver driver;

    @Before
    public void setup(){
        driver = driverSetUp();
    }

    public static WebDriver driverSetUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        return driver;

    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
