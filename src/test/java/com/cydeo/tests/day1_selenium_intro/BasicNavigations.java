package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // set up the browser driver
        WebDriverManager.chromedriver().setup();

        //Create instance of the chrome driver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //this line will maximaze the browser size
        driver.manage().window().maximize();

         driver.manage().window().fullscreen();

        //go to tesla.com
        driver.get("https://www.tesla.com");

        //stop code execution for 3 sec
        Thread.sleep(3000);

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //use selenium to navigate back
        driver.navigate().back();
        //driver.navigate().wait();

        //stop code execution for 3 sec
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().forward();

        //stop code execution for 3 sec
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        // use navigate().to();
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        //System.out.println("driver = " + driver.getTitle());

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // get the current url using selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //this will close currently opened window
        driver.close();

        //this will close all the opened window
        driver.quit();





    }
}
