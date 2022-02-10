package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class percentageCalculatepage {
    public percentageCalculatepage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@size='3']")
    public WebElement percent;

    @FindBy(xpath = "//input[@size='7']")
    public WebElement input;

    @FindBy(xpath = "//form[@id='f1']//input[@size='6']")
    public WebElement ActualResult;

////div[contains(@class,'a3I')]

}
