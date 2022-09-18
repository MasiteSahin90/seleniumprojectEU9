package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavaScript {

    @Test
    public void method(){
        Driver.getDriver().get("https://practice.cydeo.com/large ");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);
    }
}
