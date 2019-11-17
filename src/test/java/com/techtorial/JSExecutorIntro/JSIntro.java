package com.techtorial.JSExecutorIntro;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSIntro {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void jsTest() throws InterruptedException {
        //driver.get("https://www.ulta.com");
        //first way of opening a new window

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");
        //second way of opening a web browser,

        //driver.navigate().to() --> it navigates to the existing page

        //returns title:
//        String title=js.executeScript("return document.title").toString();
//        System.out.println("My page's title is: "+title);
//
//        //gets url with tenstNG:
//        driver.getCurrentUrl();
//
//        String url=js.executeScript("return document.URL").toString();
//        System.out.println("My page's url is : "+url);
//
//        //driver.navigate().to("https://www.ulta.com");
//        //scrolling web page
//        js.executeScript("window.scroll(0,500)");
//        Thread.sleep(4000);
//        js.executeScript("window.scroll(0,-500)");//it will go back scroll up
//
//        js.executeScript("alert('My custom alert')"); //it will generate extra customized alert

//        WebElement button = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));
//        js.executeScript("arguments[0].click()",button); //click

        driver.navigate().to("https://amazon.com");
        WebElement element = (WebElement) js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");

    }

}
