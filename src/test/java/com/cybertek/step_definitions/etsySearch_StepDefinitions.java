package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyPages.EtsyAllCategoriesPage;
import com.cybertek.pages.EtsyPages.eatsySearchWoodenSpoonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class etsySearch_StepDefinitions {



    @Given("User is on the etsy Title")
    public void user_is_on_the_etsy_title() {

       Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

        System.out.println(Driver.getDriver().getTitle());

    }
    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {
        eatsySearchWoodenSpoonPage page=new eatsySearchWoodenSpoonPage();
        page.homepageTitle();

    }
    @When("User searches for Wooden Spoon")
    public void user_searches_for_wooden_spoon() {
        eatsySearchWoodenSpoonPage page=new eatsySearchWoodenSpoonPage();
        page.searchBox.sendKeys("Wooden Spoon"+ Keys.ENTER);


    }
    @Then("Page title should start with wooden spoon")
    public void page_title_should_start_with_wooden_spoon() {


        BrowserUtils.sleep(3);//explisit wait is better
        Assert.assertTrue("Eatsy title doesnt star with Wooden Spoon",Driver.getDriver().getTitle().startsWith("Wooden spoon"));//this is j unit if is testNg message it is ganna go last after conditions

    }


    @When("User serches for empty value")
    public void userSerchesForEmptyValue() {
        eatsySearchWoodenSpoonPage page=new eatsySearchWoodenSpoonPage();
        page.searchBox.sendKeys(""+ Keys.ENTER);

    }

    @Then("All catagories shuld be displayed")
    public void allCatagoriesShuldBeDisplayed() {
        Assert.assertEquals("All categories | Etsy",Driver.getDriver().getTitle());
        EtsyAllCategoriesPage allCategoriesPage=new EtsyAllCategoriesPage();
        Assert.assertTrue(allCategoriesPage.allCategoriesheader.isDisplayed());




    }
}
