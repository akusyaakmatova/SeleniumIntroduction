package com.techtorial.HomeWorks;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HW_jsExecutor {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void twentyElements() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //1
        js.executeScript("window.location='https://www.ulta.com'");
        //2
        String title=js.executeScript("return document.title").toString();
        System.out.println("My page's title is: "+title);
        //3
        //WebElement searchInput = driver.findElement(By.cssSelector("#searchInput"));
        //searchInput.sendKeys("face serum");
        js.executeScript("document.getElementById('searchInput').value='face serum';");

        Thread.sleep(3000);
        WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search']"));
        js.executeScript("arguments[0].click()",searchButton);
       // WebElement element = (WebElement) js.executeScript("document.('twotabsearchtextbox').value='iphone';");
       // searchButton.click();

        Thread.sleep(3000);
        WebElement productChoose = driver.findElement(By.cssSelector("img[alt='Advanced Génifique Youth Activating Serum']"));
        js.executeScript("arguments[0].click()",productChoose);
        //productChoose.click();

        Thread.sleep(3000);
        WebElement productQuantity = driver.findElement(By.cssSelector("select[name='selectedQuantity']"));
        js.executeScript("arguments[0].click()",productQuantity);
        //productQuantity.click();

        Select select = new Select(productQuantity);
        select.selectByVisibleText("3");

        WebElement addToBagBtn1 = driver.findElement(By.cssSelector("button[aria-label='Add To Bag']"));
        js.executeScript("arguments[0].click()",addToBagBtn1);
       // addToBagBtn1.click();

        Thread.sleep(4000);
        WebElement xButton = driver.findElement(By.xpath("//div[@aria-label='Add To Bag Modal']//button[@class='Button Button__icon']"));
        xButton.click();

//        Thread.sleep(4000);
//        js.executeScript("window.scroll(0,1500)");

//        Thread.sleep(3000);
//        WebElement askQuestion = driver.findElement(By.xpath("//button[@type='button']//span[text()='Ask a Question']"));
//        askQuestion.click();


    }
}
