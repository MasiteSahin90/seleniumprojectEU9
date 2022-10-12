package com.cydeo.tests.day13_rewiew_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitlyWaitPractice {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls" );
    }



    @Test
    public void method(){
        DynamicControlPage dynamicControlPage = new DynamicControlPage();
        dynamicControlPage.removeButton.click();

        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

        BrowserUtils.waitForInvisibility(dynamicControlPage.loadingBar);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try{
            Assert.assertTrue(!(dynamicControlPage.checkbox.isDisplayed()));
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's gone!"));

    }

    @Test
    public void method2(){

        DynamicControlPage dynamicControlPage = new DynamicControlPage();
        dynamicControlPage.enableButton.click();

        BrowserUtils.waitForInvisibility(dynamicControlPage.enableLoadingBar);
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Assert.assertTrue(dynamicControlPage.enableMessage.isDisplayed());
        System.out.println("dynamicControlPage.enableMessage.isDisplayed() = " + dynamicControlPage.enableMessage.isDisplayed());
        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled());
        System.out.println("dynamicControlPage.inputBox.isEnabled() = " + dynamicControlPage.inputBox.isEnabled());
        Assert.assertTrue(dynamicControlPage.enableMessage.getText().equals("It's enabled!"));

    }

}
