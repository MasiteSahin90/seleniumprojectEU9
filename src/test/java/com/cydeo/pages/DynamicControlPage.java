package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {


    public DynamicControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    public WebElement removeButton;

    @FindBy(xpath = "//img[@src='/img/ajax-loader.gif']")
    public WebElement loadingBar;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//div[@id='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@onclick='swapInput()']")
    public WebElement enableButton;

    @FindBy(xpath = "//img[@src='/img/ajax-loader.gif']")
    public WebElement enableLoadingBar;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement enableMessage;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputBox;







}
