package com.cydeo.tests.day10_upload_actions_JSexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_registirationForm {

    @Test
    public void method(){

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker = new Faker();


        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String username = faker.bothify("helpdesk###");
        //inputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        inputUserName.sendKeys(username);

        WebElement inpuEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inpuEmail.sendKeys(username+ "@email.com");

        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        //faker.internet().password();

        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        //inputPhone.sendKeys(faker.phoneNumber().cellPhone());
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        inputBirthday.sendKeys("03/08/2000");

        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        WebElement progLang = Driver.getDriver().findElement(By.xpath("//input[@value='cplusplus']"));
        progLang.click();

        WebElement signup = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signup.click();

        WebElement text = Driver.getDriver().findElement(By.xpath("//div//p"));
        String e = "You've successfully completed registration!";
        String a = text.getText();

        Assert.assertEquals(a,e);





    }

}
