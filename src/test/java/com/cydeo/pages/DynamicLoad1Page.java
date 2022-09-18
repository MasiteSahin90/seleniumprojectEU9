package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//img[@src='/img/ajax-loader.gif']") //css=div#loading
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@id='username']")    //css=#username
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@type='password']")    //css=#pwd
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='flash error']")
    public WebElement errorMessage;






}
