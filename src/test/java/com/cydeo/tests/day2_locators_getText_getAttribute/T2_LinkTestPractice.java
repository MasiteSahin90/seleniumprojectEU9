package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTestPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));

        abTestLink.click();

        String eTitle = "No A/B Test";
        String aTitle = driver.getTitle();

        if (eTitle.equals(aTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

            driver.navigate().back();

        eTitle = "Practice";
        aTitle = driver.getTitle();

        if (eTitle.equals(aTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();

    }
}
