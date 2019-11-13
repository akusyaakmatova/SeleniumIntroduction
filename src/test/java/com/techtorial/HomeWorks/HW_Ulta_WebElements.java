package com.techtorial.HomeWorks;

import com.techtorial.utils.driversSetUpWithSwitchCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.TreeSet;

public class HW_Ulta_WebElements {


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driversSetUpWithSwitchCase.driversSetUp("Chrome");
    }


    @Test
    public void findElements() throws InterruptedException {
        driver.get("http://ulta.com");

        Actions actions=new Actions(driver);

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("face serums");
        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        searchButton.click();

        //prodeuct selction
        Thread.sleep(7000);
        WebElement product = driver.findElement(By.xpath("//h4[@class='prod-title']//a[@href='/advanced-genifique-youth-activating-serum?productId=xlsImpprod5350063']"));
        product.click();

        //product size selection
        WebElement productOz = driver.findElement(By.xpath("//div[@class='ProductSwatches__Cell']//span[text()='0.67 oz']"));
        productOz.click();

        //product quantity selection
        WebElement productQuantity = driver.findElement(By.xpath("//select[@name='selectedQuantity']"));
        productQuantity.click();

        Select select = new Select(productQuantity);
        select.selectByVisibleText("3");

        //clicking on add to bag button
        WebElement addToBagBtn1 = driver.findElement(By.xpath("//button[@aria-label='Add To Bag']"));
        addToBagBtn1.click();

        //clicking on X button
        Thread.sleep(4000);
        WebElement xButton = driver.findElement(By.xpath("//div[@aria-label='Add To Bag Modal']//button[@class='Button Button__icon']"));
        xButton.click();


        //I scrolled down to the "Ask Question" button
        Thread.sleep(3000);
       WebElement askQuestion = driver.findElement(By.xpath("//button[@type='button']//span[text()='Ask a Question']"));
       askQuestion.click();

        //I entered my questions and name, location, and submitted
        Thread.sleep(3000);
        WebElement option1 = driver.findElement(By.xpath("//div[@aria-label='Choose one How to use']"));
        option1.click();

        Thread.sleep(3000);
        WebElement option2 = driver.findElement(By.xpath("//textarea[@id='questionText-input']"));
        option2.sendKeys("Is it Day time serum or night time serum?");

        Thread.sleep(3000);
        WebElement option3 = driver.findElement(By.xpath("//input[@id='authorEmail-input']"));
        option3.sendKeys("gdzhorobekova@gmail.com");

        WebElement option4 = driver.findElement(By.xpath("//input[@id='authorName-input']"));
        option4.sendKeys("Gulaiym");

        Thread.sleep(3000);
        WebElement option5 = driver.findElement(By.xpath("//input[@id='authorLocation-input']"));
        option5.sendKeys("Chicago, IL");

        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//div[@type='submit']"));
        submit.click();

        //I pressed continue shopping link
        Thread.sleep(2000);
        WebElement continueShopping = driver.findElement(By.xpath("//a[@href='https://www.ulta.com/']"));
        continueShopping.click();

        //second search Lipstick
        WebElement searchInput1 = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput1.sendKeys("Lipstick");
        WebElement searchButton1 = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        searchButton1.click();

        // horizontal slide price range
        Thread.sleep(4000);
        WebElement priceRange = driver.findElement(By.xpath("//div[@id='slider-range']//span[@aria-label='Minimum amount']"));
        actions.clickAndHold(priceRange).moveByOffset(70,0).build().perform();

        //check box filters
        Thread.sleep(4000);
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@aria-label='Gloss']"));
        checkbox1.click();

        Thread.sleep(4000);
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@aria-label='High Shine']"));
        checkbox2.click();

        Thread.sleep(4000);
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@aria-label='Vegan']"));
        checkbox3.click();

        Thread.sleep(4000);
        WebElement checkbox4 = driver.findElement(By.xpath("//input[@aria-label='Tarte']"));
        checkbox4.click();

        //lipstick color selection
        Thread.sleep(4000);
        WebElement colorChoice = driver.findElement(By.xpath("//img[@src='https://images.ulta.com/is/image/Ulta/pdp-color-palet-pink']"));
        colorChoice.click();

        //clicking on that specific product
        Thread.sleep(4000);
        WebElement product2 = driver.findElement(By.xpath("//p[@class='prod-desc']//a[@href='/double-duty-beauty-lip-sculptor-double-ended-lipstick-gloss?productId=xlsImpprod13762563']"));
        product2.click();
        String window1 = driver.getWindowHandle();

        //clicking on add to bag button
        WebElement addToBagBtn = driver.findElement(By.xpath("//button[@aria-label='Add To Bag']"));
        addToBagBtn.click();

        //clicking on checkout button
        Thread.sleep(4000);
        WebElement checkOutBtn = driver.findElement(By.xpath("//div[@class='AddToBagSummary']//a[@href='//www.ulta.com/bag']"));
        checkOutBtn.click();

        //pressed on sing in button on the buttom
        Thread.sleep(4000);
        WebElement signInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));
        signInBtn.click();

        //entered my username
        Thread.sleep(4000);
        WebElement usernameInput = driver.findElement(By.xpath("//div[@aria-label='Please sign in to save items for later dialog box is open']//input[@name='username']"));
        usernameInput.sendKeys("gdzhorobekova@gmail.com");

        //entered my password
        Thread.sleep(4000);
        WebElement passwordInput = driver.findElement(By.xpath("//div[@aria-label='Please sign in to save items for later dialog box is open']//input[@name='password']"));
        passwordInput.sendKeys("Guarnuguarnu!09");

        //clicked sign in
        Thread.sleep(4000);
        WebElement signIn = driver.findElement(By.xpath("//div[@aria-label='Please sign in to save items for later dialog box is open']//button[text()='Sign In']"));
        signIn.click();





        Set<String> setOfWindowHandles=driver.getWindowHandles();
        int count=setOfWindowHandles.size();
        System.out.println("window size is "+count);

        String window2="";
        for(String windows: setOfWindowHandles){
                if(!windows.equalsIgnoreCase((window1))){
                    window2=windows;
                    driver.close();
                }
            }

           // driver.switchTo().window(window2);



    }
}
