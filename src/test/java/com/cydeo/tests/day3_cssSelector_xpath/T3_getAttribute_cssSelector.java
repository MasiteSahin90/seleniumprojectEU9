package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

       // WebElement signInButton = driver.findElement(By.className("login-btn"));
        //LOCATED USING TYPE ATTRIBUTE
       // WebElement sign = driver.findElement(By.cssSelector("input[type='submit]"));
        //LOCATED USING CLASS ATTRIBUTE
       // WebElement signInB = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //LOCATED USING VALUE ATTRIBUTE
        WebElement signIn = driver.findElement(By.cssSelector("input[value='Log In"));

        String eButtonText = "Log In";
        String aButtonText = signIn.getAttribute("value");

        if (aButtonText.equals(eButtonText)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }

        // input[type='submit']

        driver.close();


    }
}
