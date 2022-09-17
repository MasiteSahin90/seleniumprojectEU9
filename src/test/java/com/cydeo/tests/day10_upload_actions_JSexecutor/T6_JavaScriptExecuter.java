package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavaScriptExecuter {

    @Test
    public void method1(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll ");

        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();

        //((JavascriptExecutor).Driver.getDriver()).executer;

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");
        }


    }
}
