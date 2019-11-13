package com.techtorial.Tests.ActionPractice;

import  com.techtorial.utils.driversSetUpWithSwitchCase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouthAction {

   WebDriver driver;

    @Before
    public void setUp(){
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }
    //driver initialized first time in this line

    @Test
    public void test1(){
        driver=driversSetUpWithSwitchCase.driversSetUp("chrome");
        //since we initalized it before, it will not init in this line becase of the singleton pattern
        driver=driversSetUpWithSwitchCase.driversSetUp("ff");
    }

    @Test
    public void mouseActionsIntro(){

        Actions actions=new Actions(driver);
        WebElement webElement=driver.findElement(By.id(""));
        //for double click
        actions.doubleClick(webElement).perform();
        //right click
        actions.contextClick(webElement).perform();
        //hover over
        actions.moveToElement(webElement).perform();
        //drug and drop
        WebElement sourceElement=driver.findElement(By.id(""));
        WebElement targetElement=driver.findElement(By.xpath(""));
        actions.dragAndDrop(sourceElement,targetElement);
    }

    @Test
    public void mouseActionIntro1(){
        driver.get("http://the-internet.herokuapp.com");
        Actions actions=new Actions(driver);

        WebElement webElement = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
        webElement.click();

        WebElement sourceElement=driver.findElement(By.id("column-a"));
        WebElement targetElement=driver.findElement(By.id("column-b"));

        actions.dragAndDrop(sourceElement, targetElement).build().perform();


    }
}
