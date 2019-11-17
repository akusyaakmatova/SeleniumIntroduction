package com.techtorial.iFrameIntro;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class iFrame1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void iFrame() throws InterruptedException {
        driver.get("https://www.amazon.com");
        String originalWindowHandle = driver.getWindowHandle();

        WebElement addvert = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_desktop-ad-center-1_desktop_iframe']"));
        addvert.click();
        Thread.sleep(4000);

        Set<String> setOfWindowHandles=driver.getWindowHandles();
        String secondWindowHandle="";

        for(String dh: setOfWindowHandles){
            if(!dh.equalsIgnoreCase((originalWindowHandle))){
                secondWindowHandle=dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        driver.close();
        driver.switchTo().window(originalWindowHandle);

        //img[@src='https://images-na.ssl-images-amazon.com/images/G/01/ape/static/fallback/US_CENTER_PROMO_BACKUP._CB1529701382_.jpg']

        WebElement checkImg = driver.findElement(By.xpath("//img[@alt='Amazon Gift Cards']"));
        String expected="Amazon Gift Cards";
       Assert.assertTrue(expected.contains(checkImg.getText()));
        System.out.println("The right img is selected");

    }
}