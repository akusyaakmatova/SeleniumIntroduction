package com.techtorial.Tests.AlertPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertIntro {

    @Test
    public void alertPractice() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();

        WebElement jsAlertLink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        jsAlertLink.click();//

        WebElement jsAlertBox = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertBox.click();

        driver.switchTo().alert().accept();

        WebElement jsAlertCancel = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsAlertCancel.click();

        driver.switchTo().alert().dismiss();
    }

    @Test
    public void thirdAlert() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();

        WebElement jsAlertLink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        jsAlertLink.click();//

        WebElement jsAlertType = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsAlertType.click();
        Thread.sleep(5000);

        driver.switchTo().alert().sendKeys("Gulaiymmmm");
        driver.switchTo().alert().accept();







    }
}