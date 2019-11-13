package com.techtorial.Tests.Practice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class LernLetsKodeIt {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void radioButton() {

        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement radioBtn = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        radioBtn.click();
    }

    @Test
    public void selectItem() {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement select = driver.findElement(By.id("carselect"));
        Select carSelect = new Select(select);
        carSelect.selectByVisibleText("Benz");
    }

    @Test
    public void multiSelect() {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement select = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));

//        driver.get("");
//        Select dropDown=new Select(driver.findElement(By.id("multiple-select-example")));


        Select itemSelect = new Select(select);
        itemSelect.selectByVisibleText("Apple");
        itemSelect.selectByVisibleText("Peach");
        //itemSelect.deselectByValue("Peach");
        itemSelect.selectByVisibleText("Orange");

    }

    @Test
    public void checkButton() {

        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement checkBtn = driver.findElement(By.id("bmwcheck"));
        checkBtn.click();

        WebElement checkBtn1 = driver.findElement(By.id("benzcheck"));
        checkBtn1.click();
    }

    @Test
    public void openWindow(){
        ////button[@id='openwindow']
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement openWindow = driver.findElement(By.id("openwindow"));
        String first=driver.getTitle();

        String firstHandle=driver.getWindowHandle();
        openWindow.click();

        Set<String> setofHandles=driver.getWindowHandles();
        String secondHandle="";

        for(String handle: setofHandles){
            if(!handle.equalsIgnoreCase(firstHandle))
                secondHandle=handle;
            else
                System.out.println("");
            }
        driver.switchTo().window(secondHandle);
        String second = driver.getTitle();

       Assert.assertFalse(first.equals(second));
       Assert.assertFalse(firstHandle.equals(secondHandle));

        System.out.println("First window handle--> "+first);
        System.out.println("Second window handle --> "+second);

    }
}