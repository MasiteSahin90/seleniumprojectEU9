package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement remember = driver.findElement(By.className("login-item-checkbox-label"));

        String aRem = remember.getText();
        String eRem = "Remember me on this computer";

        if (aRem.equals(eRem)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String eForgotPasswordLink = "FORGOT YOUR PASSWORD?";

        String aForgotPasswordLink = forgotPasswordLink.getText();

        if (eForgotPasswordLink.equals(aForgotPasswordLink)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }

        System.out.println("aForgotPasswordLink = " + aForgotPasswordLink);
        System.out.println("eForgotPasswordLink = " + eForgotPasswordLink);

        String eInHref = "forgot_password=yes";
        String aInHref = forgotPasswordLink.getAttribute("href");

        System.out.println("aInHref = " + aInHref);

        if (aInHref.contains(eInHref)){
            System.out.println("successful");
        }else {
            System.out.println("not successful");
        }


        //driver.close();

        //a.ff58
        //a#bb22








    }




}
