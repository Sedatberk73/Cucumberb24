package com.cybertek.step_definitions;

import com.cybertek.pages.CalculatorPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class colculaterStepDefinetions {
    CalculatorPage calculatorPage=new CalculatorPage();
    WebDriver driver=Driver.getDriver();

    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
        driver.get(ConfigurationReader.getProperty("calculator.url"));




    }
    @Given("User clicks on {string} on calculator")
    public void user_clicks_on_on_calculator(String button) {
        calculatorPage.clickOn(button);

    }
    @Then("result {string} should be displayed")
    public void result_should_be_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string,calculatorPage.actualresult.getText().trim());


    }























}
