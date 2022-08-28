package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;


public class T4_getText {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");


        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset Password']"));

        String actualResetPassword = resetPasswordButton.getText();
        String expectedResetPassword = "Reset Password";

        if (expectedResetPassword.equals(actualResetPassword)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }







    }
}
