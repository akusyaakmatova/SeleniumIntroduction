package com.techtorial.Tests.Practice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class SeleniumCheatSheet {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


}
