package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void method(){

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']"));

        String bobExpected = "Bob Martin";
        String bobActual = bobMartinCell.getText();

        Assert.assertEquals(bobActual,bobExpected);
        /*
        2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”*/

WebElement bobOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']/following-sibling::td[3]"));

String actual = bobOrderDate.getText();
String ex = "12/31/2021";

Assert.assertEquals(actual,ex);
        /*
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/2021
         */

    }

    @Test
    public void metho2(){
        String custOrdDate = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("custOrdDate = " + custOrdDate);
    }

    @Test
    public void metdod3(){
        WebTableUtils.orderVerify(driver,"Bart Fisher","01/16/2021");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }








}
