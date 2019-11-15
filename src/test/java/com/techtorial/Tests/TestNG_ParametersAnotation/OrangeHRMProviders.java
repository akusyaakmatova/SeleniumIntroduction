package com.techtorial.Tests.TestNG_ParametersAnotation;

import com.techtorial.pages.OrangeHRM_page;
import org.testng.annotations.Test;

public class OrangeHRMProviders extends TestBase {

    @Test(dataProvider = "credentials")
    public void loginPageTest(String orangeUserName, String orangePassword){
        OrangeHRM_page orange = new OrangeHRM_page(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

        orange.userName.clear();
        orange.userName.sendKeys(orangeUserName);

        orange.password.clear();
        orange.password.sendKeys(orangePassword);

        orange.loginButton.click();
    }
}
