package com.techtorial.Tests.ActionPractice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import java.util.Set;

public class HowerOver {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


    @Test
    public void hoverOver() throws InterruptedException {


//String firstHandle=driver.getWindowHandle();
//        Set<String> setOfHandles=driver.getWindowHandles();
//        String secondHandle="";
//
//        for(String handle: setOfHandles){
//            if(!handle.equalsIgnoreCase(firstHandle))
//                secondHandle=handle;
//            else
//                System.out.println("");
//        }
//        driver.switchTo().window(secondHandle);
//       Assert.assertFalse(firstHandle.equals(secondHandle));

        driver.get("http://the-internet.herokuapp.com/");

        WebElement hovers = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hovers.click();

        Actions actions = new Actions(driver);

        WebElement hoverText = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers", hoverText.getText());
//user2 hover and assertion of the name
        WebElement user2 = driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        Thread.sleep(1000);
        actions.moveToElement(user2).build().perform();


        WebElement username = driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertTrue(username.getText().contains("user2"));
        System.out.println("I saw user2");

//user2 assertio of viewprofile
        WebElement userViewProfile = driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        Thread.sleep(1000);
        actions.moveToElement(userViewProfile).build().perform();


        WebElement viewProf = driver.findElement(By.xpath("//a[@href='/users/2']"));
        Assert.assertTrue(viewProf.getText().contains("View profile"));
        // Assert.assertTrue(viewProf.isDisplayed());
        System.out.println("I saw view profile");

//1. HomeWork, verify that if user doesnot hover over the avatars, no username or"view profile are not displayed"
        //2. veryfy that if user  hovers over the middle avatar then other two avatars still do not display any info

    }

    //user1
        @Test
        public void HWHowerOver() throws InterruptedException {
                driver.get("http://the-internet.herokuapp.com/");

    WebElement hovers = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hovers.click();

    Actions actions = new Actions(driver);

    WebElement hoverText = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers", hoverText.getText());
    //user2 hover and assertion of the name
    WebElement user2 = driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        Thread.sleep(1000);
        actions.moveToElement(user2).build().perform();

        WebElement user1ViewProfile = driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        Thread.sleep(1000);
        actions.moveToElement(user1ViewProfile).build().perform();

        }


}