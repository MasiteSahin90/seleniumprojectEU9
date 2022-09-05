package com.cydeo.tests.day6_aalerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_homework {
    /*
    . Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void method(){
        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsConfirm.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement clickedOkButton = driver.findElement(By.xpath("//p[@style='color:green']"));
        Assert.assertTrue(clickedOkButton.isDisplayed());

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }







}
