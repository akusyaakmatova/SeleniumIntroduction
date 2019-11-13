package com.techtorial.Tests.SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownIntro {

//    @Test
//    public void dropDown() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.com");
//
//        WebElement dropAll= driver.findElement(By.id("searchDropdownBox"));
//        Select amazonSelect=new Select(dropAll);
//        amazonSelect.selectByVisibleText("Electronics");
//        amazonSelect.selectByIndex(16);
//        amazonSelect.selectByValue("search-alias=fashion");
//    }
//
//    @Test
//    public void dropDown2(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://the-internet.herokuapp.com");
//        WebElement dropOption= driver.findElement(By.xpath("//a[text()='Dropdown']"));
//        dropOption.click();
//
//        WebElement dropAll= driver.findElement(By.id("dropdown"));
//        Select optionSelect=new Select(dropAll);
//        optionSelect.selectByValue("2");
//        //amazonSelect.selectByVisibleText("Electronics");
//    }

//    @Test
//    public void amazonDropDown(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.com");
//
//        WebElement options = driver.findElement(By.id("searchDropdownBox"));
//        Select amazonSelect=new Select(options);
//        List<WebElement>webElementList=amazonSelect.getOptions();
//        int i=0;
//        for (WebElement option:webElementList) {
//            String strOption = option.getText();
//            System.out.println(++i + " : " + strOption);
//
//        }
//    }

//    @Test
//    public void dropDown2() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://the-internet.herokuapp.com");
//        WebElement checkBox = driver.findElement(By.xpath("//a[text()='Checkboxes']"));
//        checkBox.click();
//
//        WebElement checkOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//        checkOne.click();

//        if(checkOne.isSelected()==false){
//            checkOne.click();
//            System.out.println("SELECTED");
//        }else{
//            System.out.println("not selected");
//        }

//        WebElement checkTwo = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//        checkTwo.click();
//        Assert.assertTrue(checkOne.isSelected());
//        Select optionSelect=new Select(checkOne);
//        optionSelect.selectByValue("2");
  //  }

    @Test
    public void isSelected(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        WebElement checkBox = driver.findElement(By.xpath("//a[text()='Checkboxes']"));
      checkBox.click();

       List <WebElement> checkOne = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox: checkOne){
            if(!checkbox.isSelected()){
                checkbox.click();
                System.out.println("Selected");
            }
        }
    }

    public static class homeWork {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","src/chromedriver");

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            System.out.println(driver.getTitle());

    //1 amazon.com
    //      WebElement input=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    //        input.sendKeys("selenium books");
    //        WebElement search=driver.findElement(By.xpath("//input[contains(@class, 'nav-input')] "));
    //       search.click();

    //2 ebay.com
            driver.get("https://www.ebay.com");
            System.out.println(driver.getTitle());

    //        WebElement click1=driver.findElement(By.xpath("//button[contains(@class,'gh-control')]"));
    //        click1.click();

    //3 wikipedia.com
            driver.get("https://www.wikipedia.org");
            System.out.println(driver.getTitle());
    //        WebElement click2=driver.findElement(By.xpath("//input[contains(@id,'searchInput')] "));
    //        click2.sendKeys("selenium");

    //4 apple.com
            driver.get("https://www.apple.com");
            System.out.println(driver.getTitle());
            WebElement click1=driver.findElement(By.xpath("//a[text()='Find an Apple Store']"));
            click1.click();

        }
    }
}