package com.cydeo.tests.day5_testNG_intro_dropdows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void simpleDropdownMethod(){
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelected = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText =currentlySelected.getText();
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String ac = stateDropdown.getFirstSelectedOption().getText();

        String ex = "Select a State";

        Assert.assertEquals(ac,ex);









    }
}
