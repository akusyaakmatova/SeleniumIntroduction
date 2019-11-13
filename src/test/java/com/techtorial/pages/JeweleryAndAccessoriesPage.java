package com.techtorial.pages;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class JeweleryAndAccessoriesPage {

    WebDriver driver;

    public JeweleryAndAccessoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        //this line is initializing the current instance, current driver
    }

    @FindBy(xpath = "//input[@aria-label='Any price']")
    public WebElement anyPrice;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=25&price_bucket=1']")
    public WebElement underTwentyFive;

    @FindBy(xpath = "//input[@value='25_50']")
    public WebElement underFifty;

    @FindBy(xpath = "//input[@value='50_100']")
    public WebElement underHundred;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?ship_to=DE&explicit=1&min=100&max=&price_bucket=1']")
   public  WebElement overHundred;

    @FindBy(xpath = "//select[@id='ship_to_select']")
   public  WebElement shipment;






}

