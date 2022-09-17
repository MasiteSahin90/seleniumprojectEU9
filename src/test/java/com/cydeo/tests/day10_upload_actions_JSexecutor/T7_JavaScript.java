package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T7_JavaScript {

    @Test
    public void method(){
        Driver.getDriver().get("https://practice.cydeo.com/large ");
    }
}
