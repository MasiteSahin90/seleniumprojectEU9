package com.cydeo.tests.day5_testNG_intro_dropdows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_homework {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void method(){

        Select s1 = new Select(driver.findElement(By.id("year")));
        s1.selectByVisibleText("1923");

        Select s2 = new Select(driver.findElement(By.id("month")));
        s2.selectByValue("11");

        Select s3 = new Select(driver.findElement(By.id("day")));
        s3.selectByIndex(0);

        String e1 = "1923";
        String a1 = s1.getFirstSelectedOption().getText();
        Assert.assertEquals(e1,a1);

        String e2 = "December";
        String a2 = s2.getFirstSelectedOption().getText();
        Assert.assertEquals(e2,a2);

        String e3 =  "1";
        String a3 = s3.getFirstSelectedOption().getText();
        Assert.assertEquals(e3,a3);

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }


}
