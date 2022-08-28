package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();

        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUserName = driver.findElement(By.className("login-inp"));

        inputUserName.sendKeys("incorrect");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));

        inputPassword.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));

        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String exErrorMessage = "Incorrect login or password";

        String acErrorMessage = errorMessage.getText();

        if (exErrorMessage.equals(acErrorMessage)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }

        //driver.close();
















    }


}
