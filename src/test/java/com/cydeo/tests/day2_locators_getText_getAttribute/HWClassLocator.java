package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClassLocator {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        WebElement homeLink = driver.findElement(By.className("nav-link"));

        homeLink.click();

        String eTitle = "Practice";
        String aTitle = driver.getTitle();

        if (eTitle.equals(aTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();


    }
}
