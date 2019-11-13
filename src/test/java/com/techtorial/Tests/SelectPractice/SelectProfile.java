package com.techtorial.Tests.SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProfile {
    JavascriptExecutor js;

    @Test
            public void SelectProfile() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.toolsqa.com/automation-practice-form/");
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Gulaiym");

        WebElement lastName= driver.findElement(By.id("lastname"));
        lastName.sendKeys("Dzhorobekova");

        WebElement gender= driver.findElement(By.id("sex-1"));
       gender.click();

       js=(JavascriptExecutor)driver;
       js.executeAsyncScript("window.scrollTo(0,500);");

       driver.switchTo().alert().accept();

        WebElement experience= driver.findElement(By.id("exp-4"));
        experience.click();

        WebElement data= driver.findElement(By.xpath("//input[@id='datepicker']"));
        data.sendKeys("/11/02/2019");//profession-1

        WebElement prof= driver.findElement(By.id("profession-1"));
        prof.click();

        WebElement job= driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
        job.click();

        WebElement continents= driver.findElement(By.id("continents"));
       Select contSelect=new Select(continents);
        contSelect.selectByVisibleText("Africa");

        WebElement commands= driver.findElement(By.id("selenium_commands"));
        Select selectCommands=new Select(commands);
        selectCommands.selectByVisibleText("Browser Commands");

        WebElement button= driver.findElement(By.id("submit3"));
        button.click();

    }
}
