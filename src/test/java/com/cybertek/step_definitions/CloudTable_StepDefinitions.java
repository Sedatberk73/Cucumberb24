//package com.cybertek.step_definitions;
//
//import com.cybertek.pages.CloudTablePages;
//import com.cybertek.utilities.BrowserUtils;
//import com.cybertek.utilities.ConfigurationReader;
//import com.cybertek.utilities.Driver;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//
//public class CloudTable_StepDefinitions {
//    WebDriver driver;
//    CloudTablePages tablePages=new CloudTablePages();
//
//    @Before
//    public void setUp(){
//        driver= Driver.getDriver();
//    }
//
//
//
//    @Given("User is on cloudtables homepage")
//    public void user_is_on_cloudtables_homepage() {
//        driver.get(ConfigurationReader.getProperty("cloudTable.url"));
//
//
//    }
//
//    @When("User  clicks on New button")
//    public void userClicksOnNewButton() {
//        tablePages.NewButton.click();
//        Assert.assertEquals("Editor | Editing for DataTables",driver.getTitle());
//    }
//
//
//
//    @When("User enters {string} to firstname field")
//    public void user_enters_to_firstname_field(String firstname) {
//        tablePages.firstName.sendKeys(firstname);
//        BrowserUtils.sleep(2);
//
//
//    }
//    @When("User enter {string} to lastname field")
//    public void user_enter_to_lastname_field(String lastname) {
//        tablePages.lastName.sendKeys(lastname);
//
//
//    }
//    @When("User enter {string} to position field")
//    public void user_enter_to_position_field(String position) {
//
//        tablePages.positions.sendKeys(position);
//
//    }
//    @When("User enter {string} to salary field")
//    public void user_enter_to_salary_field(String salary) {
//        tablePages.salary.sendKeys(salary);
//        BrowserUtils.sleep(2);
//
//
//    }
//    @When("User clicks on create button")
//    public void user_clicks_on_create_button() {
//        tablePages.createButton.click();
//
//
//    }
//
//
//
//}
