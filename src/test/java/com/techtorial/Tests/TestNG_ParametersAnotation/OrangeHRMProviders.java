package com.techtorial.Tests.TestNG_ParametersAnotation;

import com.techtorial.pages.OrangeHRM_page;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMProviders extends TestBase {

    @DataProvider(name="credentials")
    public static Object [][] credential(){
        return  new Object[][] {{"admin","admin123"},{"testUserName","testPassword"}};
    }

    @Test(dataProvider = "credentials")
    public void loginPageTest(String orangeUserName, String orangePassword) {
        OrangeHRM_page orange = new OrangeHRM_page(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

        orange.userName.clear();
        orange.userName.sendKeys(orangeUserName);

        orange.password.clear();
        orange.password.sendKeys(orangePassword);

        orange.loginButton.click();

        if (orangeUserName.equalsIgnoreCase("admin") & orangePassword.equalsIgnoreCase("admin123")) {

            String actual = orange.pageTitle.getText();
            String expected = "Dashboard";
            Assert.assertEquals(expected, actual);

            orange.dropDownBtn.click();
            orange.logOutLink.click();
        }else{
            String actual=orange.retryText.getText();
            String expected="Retry Login";
            Assert.assertEquals(expected, actual);

            driver.navigate().back();
        }


    }
}