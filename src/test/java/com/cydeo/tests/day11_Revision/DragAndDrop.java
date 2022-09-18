package com.cydeo.tests.day11_Revision;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {


    @Test
    public void method(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");

        WebElement cookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookiesButton.click();

        WebElement small  = Driver.getDriver().findElement(By.id("draggable"));
        WebElement big  = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(small,big).perform();
        actions.clickAndHold(small).moveToElement(big).release().perform();


        String etext = "You did great!";
        String atext = big.getText();

        Assert.assertEquals(atext,etext);

        Driver.closeDriver();


    }
}
