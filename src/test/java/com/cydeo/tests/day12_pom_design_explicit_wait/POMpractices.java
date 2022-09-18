package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMpractices {

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://library1.cydeo.com ");

    }

    @Test
    public void required_field_error_message_test(){


        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        //Driver.closeDriver();


    }

    @Test
    public void test(){


        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        Faker faker = new Faker();

        libraryLoginPage.inputUserName.sendKeys(faker.name().username());
        //libraryLoginPage.inputPassword.sendKeys(faker.numerify("#####"));

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

       // Driver.closeDriver();

    }

    @Test
    public void test2(){



        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUserName.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("1234567");
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

        //Driver.closeDriver();

    }

    @AfterMethod
    public void close(){
        Driver.closeDriver();
    }
}
