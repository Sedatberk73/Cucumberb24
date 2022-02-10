package com.cybertek.step_definitions;

import com.cybertek.pages.percentageCalculatepage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class percentage_stepdefinitions {
WebDriver driver= Driver.getDriver();

    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
        driver.get(ConfigurationReader.getProperty("percentage.url"));


    }
    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer,Integer> valuesMap) {

        System.out.println("values map="+valuesMap);
        percentageCalculatepage calculatepage=new percentageCalculatepage();
        calculatepage.percent.sendKeys("5"+Keys.ENTER);

        for (Integer inputkey : valuesMap.keySet()) {
            BrowserUtils.sleep(2);
            calculatepage.input.clear();
            calculatepage.percent.clear();
          calculatepage.percent.sendKeys(valuesMap.get(inputkey)+"");
            calculatepage.input.sendKeys(inputkey+""+ Keys.ENTER);

            System.out.println("input value="+inputkey);
            System.out.println("Expected value "+valuesMap.get(inputkey));
            System.out.println("actual result="+calculatepage.ActualResult.getAttribute("value"));

        }






    }



}
