package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgorPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));

        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement emailBox = driver.findElement(By.cssSelector("input[type='text']"));

        WebElement retrivePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));






        /*
        1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible

         */

        System.out.println("homeLink = " + homeLink.isDisplayed());
        System.out.println("forgorPasswordHeader = " + forgorPasswordHeader.isDisplayed());
        System.out.println("emailText = " + emailText.isDisplayed());
        System.out.println("emailBox = " + emailBox.isDisplayed());
        System.out.println("retrivePasswordButton = " + retrivePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText = " + poweredByCydeoText.isDisplayed());

        driver.close();


    }
}
