package com.cydeo.tests.day5_testNG_intro_dropdows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_homework {

    /*
    Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
     */
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    //select[@id='state'] //option[@value='IL']
    @Test
    public void metthod(){
        WebElement dropdown = driver.findElement(By.id("state"));
        Select select = new Select(dropdown);

        select.selectByValue("IL");
        select.selectByValue("VA");
        //select.selectByValue("CA");
        select.selectByIndex(5);

        String e = "California";
        String a = select.getFirstSelectedOption().getText();

        Assert.assertEquals(a,e);
        /*if (e.equals(a)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }*/
   }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }














}
