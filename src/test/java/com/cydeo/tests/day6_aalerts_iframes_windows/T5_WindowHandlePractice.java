package com.cydeo.tests.day6_aalerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_WindowHandlePractice {

    /*

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
     */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void method(){
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        String e ="Windows";
        String a = driver.getTitle();
        Assert.assertEquals(a,e);

        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        Set<String > allTheWindowsHandles = driver.getWindowHandles();

        for(String each: allTheWindowsHandles){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        a = driver.getTitle();
        e = "New Window";
        Assert.assertEquals(a,e);

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
