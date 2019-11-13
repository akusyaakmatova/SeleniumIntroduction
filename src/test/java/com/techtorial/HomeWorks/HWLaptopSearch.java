package com.techtorial.HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWLaptopSearch {

    @Test
    public void getLaptopPriceList() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("macbook pro" + Keys.ENTER);

    List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));

        for (WebElement cprice : prices) {
        String strPrices = cprice.getText().substring(1).replace("\n",".");
        System.out.println(strPrices);
    }
}

    @Test
            public void laptopPriceSum(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("macbook pro" + Keys.ENTER);
////span[@class='a-price-whole']
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));

        double sum=0.0;
        for(WebElement p:prices){
            String text=p.getText().substring(1).replace("\n",".");
            text=text.replace(",","");
            double price=0.0;
            if(text.length()>0){
                price=Double.parseDouble(text);
                sum=sum+price;
            }
        }
        System.out.println("Sum of the prices is -$"+sum);
        System.out.println("Total quantity of laptops - "+prices.size());

    }

    @Test
    public void findHighestThree(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("macbook pro" + Keys.ENTER);

        List<WebElement> prices1 = driver.findElements(By.xpath("//span[text()='New Apple MacBook Pro (15-inch, 16GB RAM, 256GB Storage) - Space Gray']"));
        List<WebElement> prices2 = driver.findElements(By.xpath("//span[text()='New Apple MacBook Pro (13-inch, 8GB RAM, 128GB Storage) - Silver']"));
        List<WebElement> prices3 = driver.findElements(By.xpath("//span[text()='Apple MacBook Pro 15in Laptop Intel Quad Core i7 2.7GHz (ME665LL/A) Retina Display, 16GB Memory, 512GB Solid State Drive, (Renewed)']"));
//for(int i = 0; i < n; i++)
//        {
//            a[i] = s.nextInt();
//        }
//        max = a[0];
//        for(int i = 0; i < n; i++)
//        {
//            if(max < a[i])
//            {
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum value:"+max);
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));











    }


}
