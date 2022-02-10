package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePages {
    public CloudTablePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//button[.='New']")
    public WebElement NewButton;



    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastName;


    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positions;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;


    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;






}
