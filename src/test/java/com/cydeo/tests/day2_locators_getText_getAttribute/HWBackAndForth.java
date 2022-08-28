package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWBackAndForth {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement cookiesButton = driver.findElement(By.id("L2AGLb"));
        cookiesButton.click();

        driver.navigate().to("https://mail.google.com/mail/&ogbl");

        String eTitle = "Gmail";
        String aTitle = driver.getTitle();

        if (aTitle.contains(eTitle)){
            System.out.println("successful");
        }else{
            System.out.println("not successful");
        }

        driver.navigate().back();

        eTitle = "Google";
        aTitle = driver.getTitle();

        if (aTitle.equals(eTitle)){
            System.out.println("successful");
        }else{
            System.out.println("not successful");
        }










    }
}
