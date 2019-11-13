package com.techtorial.pages;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EtsyHomePage {

    WebDriver driver;

    public EtsyHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        //this line is initializing the current instance, current driver
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchField;

    @FindBy(id = "register")
   public WebElement register;

    @FindBy(xpath = "/a[@href='https://www.etsy.com/cart?ref=hdr-cart']")
    public WebElement cart;

    @FindBy(xpath = "//li[@data-node-id='10855']//a[@href='/c/jewelry-and-accessories?ref=catnav-10855']")
    public WebElement jewelPage;




}
