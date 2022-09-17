package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_upload {

    @Test
    public void upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "/Users/masitesahin/Desktop/HTML Class/sunny day.jpeg";

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        BrowserUtils.sleep(2);
        chooseFile.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();

        WebElement fileuploadheader = Driver.getDriver().findElement(By.xpath("//div//h3"));
        Assert.assertTrue(fileuploadheader.isDisplayed());


    }
}
