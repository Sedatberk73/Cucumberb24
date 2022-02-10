package com.cybertek.pages.EtsyPages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class ser {
    public ser(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "inputEmail")
    public String inputEmail;

}

