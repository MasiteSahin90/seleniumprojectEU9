package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        // other way to call the website = driver.navigate().to("https://practice.cydeo.com");

       String eUrl = "cydeo";
       String url =  driver.getCurrentUrl();
       String eTitle = "Practice";
       String title = driver.getTitle();

       if (url.contains(eUrl)){
           System.out.println("successful");
       }else{
           System.out.println("not successful");
       }
       if (title.equals(eTitle)){
           System.out.println("successful");
       }else{
           System.out.println("not successful");
       }



    driver.close();


    }
}
