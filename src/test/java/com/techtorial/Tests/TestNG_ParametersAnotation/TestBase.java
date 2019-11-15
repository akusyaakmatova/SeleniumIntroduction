package com.techtorial.Tests.TestNG_ParametersAnotation;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    @Parameters("driverName")
    @BeforeClass(alwaysRun = true)
    public void setUp(String driverName) {
        driver = driversSetUpWithSwitchCase.driversSetUp(driverName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}

