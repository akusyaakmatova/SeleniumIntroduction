package com.techtorial.HomeWorks;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HWGuru99DD {


    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


    @Test
    public void dragAndDrop() {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions actions = new Actions(driver);

//        driver.switchTo().alert();
//        WebElement closeAlert = driver.findElement(By.xpath("//div[@id='videoContainerDiv"));
 //      js=(JavascriptExecutor)driver;
   //    js.executeAsyncScript("window.scrollTo(0,1500);");

        WebElement sourceElement = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement targetElement = driver.findElement(By.xpath("//*[@id='bank']/li"));

        actions.dragAndDrop(sourceElement,targetElement).build().perform();

        WebElement sourceElement1 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
        WebElement targetElement1 = driver.findElement(By.xpath("//*[@id='amt7']/li"));

        actions.dragAndDrop(sourceElement1,targetElement1).build().perform();

        WebElement sourceElement2 = driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement targetElement2 = driver.findElement(By.xpath("//*[@id='loan']/li"));

        actions.dragAndDrop(sourceElement2,targetElement2).build().perform();

        WebElement sourceElement3 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
        WebElement targetElement3 = driver.findElement(By.xpath("//*[@id='amt8']/li"));

        actions.dragAndDrop(sourceElement3,targetElement3).build().perform();



//        actions.dragAndDrop(sourceElement1,targetElement1).build().perform();
//        actions.clickAndHold(driver.findElement(By.xpath("//li[@id='fourth'][1]"))).moveToElement(driver.findElement(By.xpath("//ol[@id='amt7']"))).release().perform();
///
    }


}