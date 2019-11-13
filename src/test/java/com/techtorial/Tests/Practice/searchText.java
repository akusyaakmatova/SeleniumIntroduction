package com.techtorial.Tests.Practice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class searchText {

//@Test
//    public void iphoneSearchTest(){
//
//        System.setProperty("webdriver.chrome.driver","src/chromedriver");
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.com");
//        WebElement input=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//if the element has id we can find by id
//        input.sendKeys("Iphone"); //short cut to use click button
//
//        WebElement click=driver.findElement(By.xpath("//input[@class='nav-input']"));
//        click.click();
//
//        WebElement productTitle=driver.findElement(By.xpath("//span[contains(@class, 'a-size-medium a-color-base a-text-normal')]"));
//        //productTitle.click();
//       String productName=productTitle.getText(); //returns us a string value
//
//        Assert.assertTrue(productName.toLowerCase().contains("iphone"));
//    }
 @Test
    public void priceSearch(){
     System.setProperty("webdriver.chrome.driver","src/chromedriver");

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();

     driver.get("https://www.amazon.com");
     WebElement input=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//if the element has id we can find by id
     input.sendKeys("Iphone" + Keys.ENTER); //short cut to use click button

//     WebElement click=driver.findElement(By.xpath("//input[@class='nav-input']"));
//     click.click();

     List<WebElement> price = driver.findElements(By.xpath("//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']"));
    System.out.println(price.size());


     for (WebElement prices:price) {
         String strPrice=prices.getText();
         System.out.println(strPrice);

     }



 }

}
