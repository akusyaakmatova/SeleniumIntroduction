package com.techtorial.Tests.Practice;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotTest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }

    @Test
    public void screenShot(){
      driver.get("http://google.com");
        WebElement element=driver.findElement(By.id("asdlfkajfy"));
        System.out.println(element.getText());
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE){
            long timestamp=System.currentTimeMillis();
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//this line makes it job to take a svreenshot
            FileUtils.copyFile(srcFile, new File( "src/test/screenshot/" + timestamp+ " .jpg"));
        }
       driver.close();
    }
}
