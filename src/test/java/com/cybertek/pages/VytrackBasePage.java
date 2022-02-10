package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class VytrackBasePage {

    public  VytrackBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
