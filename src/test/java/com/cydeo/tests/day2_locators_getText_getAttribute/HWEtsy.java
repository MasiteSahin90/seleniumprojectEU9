package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWEtsy {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement cookiesButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookiesButton.click();

        WebElement search = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        search.sendKeys("Wooden Spoon" + Keys.ENTER);

        //driver.findElement(By.name())
        //driver.close();
    }
}
