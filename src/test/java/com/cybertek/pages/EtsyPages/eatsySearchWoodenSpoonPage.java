package com.cybertek.pages.EtsyPages;

import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eatsySearchWoodenSpoonPage {
    public eatsySearchWoodenSpoonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "search_query")
    public WebElement searchBox;




    public void homepageTitle(){
        Assert.assertEquals(Driver.getDriver().getTitle(),"Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
    }


}
