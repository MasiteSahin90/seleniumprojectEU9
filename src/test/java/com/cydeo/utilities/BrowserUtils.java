package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second){
        second *=1000;
        try {
          Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowsVerify(WebDriver driver , String expectedInUrl,String expectedInTitle){


        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);
            System.out.println("current url=" + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(WebDriver driver,String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }


}
