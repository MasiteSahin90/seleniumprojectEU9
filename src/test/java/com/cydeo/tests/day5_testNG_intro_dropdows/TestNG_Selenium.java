package com.cydeo.tests.day5_testNG_intro_dropdows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



    @Test
    public void selenium_test(){

        driver.get("https://google.com");

        //WebElement googleTittle = driver.findElement(By.xpath());

        String actual = driver.getTitle();
        String expected = "Google";
        Assert.assertEquals(actual,expected,"Title is not matching");
    }


}
