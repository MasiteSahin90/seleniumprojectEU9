package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CydeoTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement cookies = driver.findElement(By.cssSelector("button[id='L2AGLb']"));

        cookies.click();

        WebElement searchBox = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));

        searchBox.sendKeys("cydeo" + Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.cssSelector("a[href=\"https://cydeo.com/\"]>h3"));

        String ac= cydeoText.getText();
        String ec = "Cydeo";

        if (ac.equals(ec)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }







    }
}
