package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4T5_Scroll {

    @Test
    public void method1() {

        Driver.getDriver().get("https://practice.cydeo.com/ ");

        WebElement cydeo = Driver.getDriver().findElement(By.xpath("//a[@href='https://cydeo.com/']"));


        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);

        actions.moveToElement(cydeo).perform();

        WebElement home = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));

        BrowserUtils.sleep(2);

        actions.moveToElement(home).perform();

        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Driver.getDriver().close();



    }

}





