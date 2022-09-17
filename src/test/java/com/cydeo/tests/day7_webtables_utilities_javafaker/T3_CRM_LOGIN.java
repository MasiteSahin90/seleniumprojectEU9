package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {
    /*
    TC #3: Login scenario
 1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal





USERNAME  PASSWORD
helpdesk1@cybertekschool.com  UserUser
Helpdesk2@cybertekschool.com  UserUser

     */



    @Test
    public void method(){
        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputBox.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"Portal");


 }

    public void method2(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver,"Portal");


    }

    public void method3(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        BrowserUtils.verifyTitle(driver,"Portal");


    }





}
