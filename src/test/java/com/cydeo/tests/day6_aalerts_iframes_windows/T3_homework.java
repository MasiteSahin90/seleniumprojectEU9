package com.cydeo.tests.day6_aalerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_homework {
    /*
    Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
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
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        jsPrompt.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();

        WebElement hello = driver.findElement(By.xpath("//p[@style='color:green']"));

        Assert.assertTrue(hello.isDisplayed());

    }
}
