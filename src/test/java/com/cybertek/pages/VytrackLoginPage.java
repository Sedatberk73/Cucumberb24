package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VytrackLoginPage extends VytrackBasePage {


   @FindBy(name = "_username")
    public WebElement _username;

    @FindBy(name = "_password")
    public WebElement _password;

    @FindBy(id ="_submit" )
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement nameAndLastName;




    public void setLoginBtn(String username,String password) {
        _username.sendKeys(username);
        _password.sendKeys(password);
        loginBtn.click();

    }




}
