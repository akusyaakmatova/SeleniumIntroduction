package com.techtorial.Tests.WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.junit.Before;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class multiWindowHandling {


    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver =driverSetUp();
    }


    @Test
    public void thirdAlert() {

        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().fullscreen();
        WebElement multiWindow = driver.findElement(By.xpath("//a[@href='/windows']"));
        multiWindow.click();//

        String originalWindowHandle = driver.getWindowHandle();

        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click(); //

        Set<String> setOfWindowHandles=driver.getWindowHandles();
        String secondWindowHandle="";

        for(String dh: setOfWindowHandles){
            if(!dh.equalsIgnoreCase((originalWindowHandle))){
                secondWindowHandle=dh;
            }
        }

        driver.switchTo().window(secondWindowHandle);


        WebElement text = driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println(text.getText());

     //third window
     driver.switchTo().window(originalWindowHandle);
     clickHere.click();

        Set<String> threeOfWindowHandles=driver.getWindowHandles();

        String thirdWindowHandle="";
        for(String dh: threeOfWindowHandles){
            if(!dh.equalsIgnoreCase(originalWindowHandle) &&  !dh.equalsIgnoreCase(secondWindowHandle)){
              thirdWindowHandle=dh;
            }
        }
        driver.switchTo().window(thirdWindowHandle);
     }

       @AfterClass
       public void tearDown(){
        driver.quit();
       }


    public static WebDriver driverSetUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();


        return driver;
    }
}