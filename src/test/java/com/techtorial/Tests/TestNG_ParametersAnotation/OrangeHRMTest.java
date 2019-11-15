package com.techtorial.Tests.TestNG_ParametersAnotation;

import com.techtorial.pages.OrangeHRM_page;
import org.testng.annotations.Test;

public class OrangeHRMTest extends TestBase {



    @Test
    public void loginTest() throws InterruptedException {

        OrangeHRM_page orange =new OrangeHRM_page(driver);

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
        Thread.sleep(3000);
        orange.userName.clear();
        orange.userName.sendKeys("admin");
        Thread.sleep(3000);
        orange.password.clear();
        orange.password.sendKeys("admin123");

        orange.loginButton.click();

        String actual=orange.pageTitle.getText();
        String expected="Dashboard";
        //expected value is coming from the requirement.

      //  Assert.assertEquals(expected,actual);


    }

}
