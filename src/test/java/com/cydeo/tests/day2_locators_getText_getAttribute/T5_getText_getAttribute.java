package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";

        String aHeaderText = headerText.getText();

        if (expectedHeaderText.equals(aHeaderText)){
            System.out.println("verification PASS!");
        }else {
            System.out.println("verification FAILED!!!");
        }

        WebElement firstNameInput = driver.findElement(By.name("first name"));

        String expectedPlaceHolder = "first name";
        String aPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (expectedPlaceHolder.equals(aPlaceHolder)){
            System.out.println(" verification PASS!");
        }else {
            System.out.println(" verification FAILED!!!");
        }


    }
}
