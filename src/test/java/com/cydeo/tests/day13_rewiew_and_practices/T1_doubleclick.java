package com.cydeo.tests.day13_rewiew_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_doubleclick {

    @Test
    public void method(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli\n" +
                "ck2 ");
        DoubleClickPage doubleClickPage = new DoubleClickPage();

        doubleClickPage.cookies.click();

        Driver.getDriver().switchTo().frame("iframeResult");


        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick(doubleClickPage.textToDouble).perform();

        System.out.println("doubleClickPage.textToDouble.getAttribute(\"style\") = " +
                doubleClickPage.textToDouble.getAttribute("style"));

        String e = "color: red;";
        String a = doubleClickPage.textToDouble.getAttribute("style");

        Assert.assertEquals(a,e);

        Driver.closeDriver();

    }
}
