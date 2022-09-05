package com.cydeo.tests.day5_testNG_intro_dropdows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_homework {
    /*
    Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
     */
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
        WebElement dropdown = driver.findElement(By.id("dropdownMenuLink"));
        dropdown.click();

        WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebook.click();

        String a = driver.getTitle();
        String e = "Facebook – log in or sign up";
        //System.out.println(driver.getTitle());
        if (e.equals(a)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
