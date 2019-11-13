package com.techtorial.Tests.Practice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

public class KeyboardCommands {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

@Test
    public void keyboardShortCuts() {

    driver.get("https://www.google.com");

    WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
    search.sendKeys("selenium");

    WebElement searchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
    searchBtn.click();


    Actions actions = new Actions(driver);
    actions.keyDown(Keys.COMMAND).perform();

    WebElement secondLink = driver.findElement(By.xpath("//h3[text()='Selenium - Web Browser Automation']"));
    secondLink.click();

}

@Test
    public void selectAll(){
    driver.get("https://www.google.com");
    WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
    search.sendKeys("selenium");


    WebElement searchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
    searchBtn.click();


    Actions actions = new Actions(driver);
    actions.keyDown(Keys.COMMAND).sendKeys("a").perform();
}

}
