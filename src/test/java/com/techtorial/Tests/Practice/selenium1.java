package com.techtorial.Tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/chromedriver");
      //  WebDriver driver= new ChromeDriver(); //webDriver is interface, chromedriver is regular class

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//     driver.get("https://www.amazon.com");
//     WebElement input=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//     input.sendKeys("Iphone 11");
//
//           WebElement click=driver.findElement(By.xpath("//input[@class='nav-input']"));
//          click.click();
//
//       WebElement checkBox=driver.findElement(By.xpath("//div[@id='deliveryRefinements']]"));
//       checkBox.sendKeys("Get It Today");
//       checkBox.click();
      //                                                                                     /cars.com //search for the car by make model, etc
      driver.get("https://www.cars.com");

      WebElement zipCode=driver.findElement(By.xpath("//input[@aria-label='Enter a Zip Code']"));
      zipCode.clear();
      Thread.sleep(1000);
      zipCode.sendKeys("60656");

       WebElement priceRange=driver.findElement(By.xpath("//select[@aria-label='Select a maximum price']"));
       priceRange.click();
        Thread.sleep(1000);
        priceRange.sendKeys("$50,000");

        WebElement selectMake = driver.findElement(By.xpath("//select[@aria-label='Select a make']"));
        selectMake.click();
        Thread.sleep(1000);
        selectMake.sendKeys("Lexus");

        WebElement selectModel = driver.findElement(By.xpath("//select[@aria-label='Select a model']"));
        selectModel.click();
        Thread.sleep(1000);
        selectModel.sendKeys(" - LX 570");

       WebElement distance = driver.findElement(By.xpath("//select[@aria-label='Select a maximum distance']"));
       distance.click();
        Thread.sleep(1000);
        distance.sendKeys("50 Miles From");

        WebElement selectCar=driver.findElement(By.xpath("//select[@aria-label='Select a stock type']"));
        selectCar.click();
        Thread.sleep(1000);
        selectCar.sendKeys("New Cars");

        WebElement search=driver.findElement(By.xpath("//input[@class='NZE2g']"));
        search.click();


           //expedia.com/ search flight
         //driver.get("https://www.expedia.com");

        // WebElement flightTab1 = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']"));
//        flightTab1.click();
//        WebElement flightTab2 = driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']"));
//        flightTab2.click();
//
//        WebElement flightTab3 = driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']"));
//        flightTab3.click();
//
//        WebElement flightTab4 = driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));
//        flightTab4.click();
//
//        WebElement flightTab5 = driver.findElement(By.xpath("//button[@id='tab-cruise-tab-hp']"));
//        flightTab5.click();
//
//        WebElement flightTab6 = driver.findElement(By.xpath("//button[@id='tab-activity-tab-hp']"));
//        flightTab6.click();

//        WebElement flyingFrom = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
//        flyingFrom.click();//we don not really have to click on it
//        flyingFrom.sendKeys("Chicago");
//        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
//        flyingTo.sendKeys("Connecticut");
//
//
//         WebElement returning = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
//         returning.sendKeys("12/11/2019");
//
//         WebElement departing = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
//        departing.sendKeys("11/09/2019");
//                      returning.click();
//
//        WebElement search = driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']"));
//        search.click();

              
              
              
              
              
              
              
              
              
              
              
    }         
              
}             
              