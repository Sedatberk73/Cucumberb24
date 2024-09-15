package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class diceJobSerach_StepDefinitions {


    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        Driver.getDriver().get("https://www.dice.com");


    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() throws InterruptedException {
        WebElement keyword=Driver.getDriver().findElement(By.id("typeaheadInput"));
        WebElement zipcode=Driver.getDriver().findElement(By.id("google-location-search"));
        keyword.sendKeys("java");
        zipcode.sendKeys("75034"+ Keys.ENTER);

    }
    @Then("User should see search results")
    public void user_should_see_search_results() {

        System.out.println("ser");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // wait up to 10 seconds

        // Wait until the element is present
        WebElement testResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("totalJobCount")));
        System.out.println(testResult.getText());

    }







}
