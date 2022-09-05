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

public class T1_AlertPractice {
    /*
    . Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void method() {

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[@class = 'btn btn-primary'][1]"));
        informationAlertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Assert.assertTrue(resultText.isDisplayed(),"result is not displayed");

        String eresult = "You successfully clicked an alert";
        String aresult = resultText.getText();
        Assert.assertEquals(eresult,aresult);
        /*if (eresult.equals(aresult)) {
        System.out.println("pass");
        } else {
            System.out.println("fail");


        }*/

    }



    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }





}
