package com.techtorial.HomeWorks;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HWClicks {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


    @Test
    public void rightClick() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//edit
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick).perform();

        WebElement quitButton = driver.findElement(By.xpath("//span[text()='Edit']"));
        Thread.sleep(1000);
        quitButton.click();

        driver.switchTo().alert().accept();
        Thread.sleep(1000);
//quit
        WebElement rightClick1= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick1).perform();

        WebElement editButton = driver.findElement(By.xpath("//span[text()='Quit']"));
        Thread.sleep(1000);
        editButton.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
//cut
        WebElement rightClick2 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick2).perform();

        WebElement cutButton= driver.findElement(By.xpath("//span[text()='Cut']"));
        Thread.sleep(1000);
        cutButton.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
//copy
        WebElement rightClick3 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick3).perform();

        WebElement copyButton = driver.findElement(By.xpath("//span[text()='Copy']"));
        Thread.sleep(1000);
        copyButton.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
//paste
        WebElement rightClick4 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick4).perform();

        WebElement pasteButton = driver.findElement(By.xpath("//span[text()='Paste']"));
        Thread.sleep(1000);
        pasteButton.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
//delete
        WebElement rightClick5 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(rightClick5).perform();

        WebElement deleteButton = driver.findElement(By.xpath("//span[text()='Delete']"));
        Thread.sleep(1000);
        deleteButton.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    @Test
    public void doubleClick() {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClick).perform();

        driver.switchTo().alert().accept();
    }
}

