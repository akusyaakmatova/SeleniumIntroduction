package com.techtorial.pages;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_page {

    public OrangeHRM_page(WebDriver driver){
        PageFactory.initElements(driver,this);
        //without pagefactory.initELEMENTS METHOD, YOU WILL NOT BE INITIALIZED
        //IT MEANS YOU CAN USE YOUR ELEMENTS
    }

    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(className = "page-title")
    public  WebElement pageTitle;

    @FindBy(id = "user-dropdown")
    public WebElement dropDownBtn;

    @FindBy(id ="logoutLink")
    public WebElement logOutLink;

    @FindBy(className ="dashboardCard-title-for-card")
    public WebElement retryText;
}
