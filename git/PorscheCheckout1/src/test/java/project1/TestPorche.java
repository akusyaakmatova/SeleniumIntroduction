package project1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestPorche {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver","src/chromedriver");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.porsche.com/usa/modelstart/");
        //3. Select model 718
        WebElement selectCar=driver.findElement(By.xpath("//div[@class='b-teaser-caption']"));
        selectCar.click();

        System.out.println(driver.getTitle());
        WebElement comparison=driver.findElement(By.xpath("//div[@id='m982120']//div[contains(text(),'From')]"));
        String price=comparison.getText();
        //From $ 56,900.00*
        int index=price.indexOf('$');
        String finalPrice=price.substring(index,price.length()-2).trim();

        WebElement selectModel=driver.findElement(By.xpath("//div[@class='m-14-model-price']"));
        selectModel.click();



        WebElement priceCar=driver.findElement(By.xpath("//section[@id='s_iccCca']/div/div[1]/div[2]"));
        String price2=priceCar.getText();







        Set windows=driver.getWindowHandles();
        System.out.println("windows !!!!!!!!!!!!!!!!!!!!!!!"+windows.toString());
        String window=driver.getWindowHandle();
        driver.switchTo().window(window);





    }

    @Test
    public void checkSum(){

    }



//        WebElement click=driver.findElement(By.xpath("//input[@class='nav-input']"));
//        click.click();
//
//        WebElement productTitle=driver.findElement(By.xpath("//span[contains(@class, 'a-size-medium a-color-base a-text-normal')]"));
//        //productTitle.click();
//        String productName=productTitle.getText(); //returns us a string value
//
//        Assert.assertTrue(productName.toLowerCase().contains("iphone"));

    }

