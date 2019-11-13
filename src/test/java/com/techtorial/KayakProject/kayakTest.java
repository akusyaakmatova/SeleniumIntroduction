package com.techtorial.KayakProject;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class kayakTest {

    WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

@Test
    public void k01(){

        driver.get("https://www.kayak.com");
    Actions actions=new Actions(driver);

//        WebElement flightTab = driver.findElement(By.xpath("//input[@name='From?']"));
//        flightTab.click();

        WebElement fromWhere = driver.findElement(By.xpath("//div[@class='_ia1 _iam']/div/div/div[3]//input[@name='origin']"));

        fromWhere.sendKeys("Chicago");
       fromWhere.click();//destination

        WebElement toWhere = driver.findElement(By.xpath("//input[@name='destination']"));
        toWhere.sendKeys("New York");
        toWhere.click();

//span[@id='c0Jor-depart-clear']
        WebElement DataFrom= driver.findElement(By.xpath("//span[@id='c0Jor-depart-clear']\n"));
        toWhere.click();
        toWhere.sendKeys("11/10/2019");

    }

}

