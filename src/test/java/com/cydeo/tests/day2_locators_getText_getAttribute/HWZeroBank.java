package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWZeroBank {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html ");

        WebElement header = driver.findElement(By.className("page-header"));

        String eheader = "Log in to ZeroBank";
        String aheader = header.getText();

        if (eheader.equals(aheader)){
            System.out.println("verification PASS!");
        }else {
            System.out.println("verification FAILED!!!");
        }





    }
}
