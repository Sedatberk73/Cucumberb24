package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReRunDemoStepDefs {

    @Given("User adds two numbers")
    public void user_adds_two_numbers() {

        System.out.println("result should be expexted");
    }


    @Then("Result should be as expected")
    public void result_should_be_as_expected() {

        Assert.assertEquals(5,10);
    }




    @Given("User adds three numbers")
    public void user_adds_three_numbers() {
        System.out.println("result should be sum");

    }

    @Then("Result should be sum of three")
    public void result_should_be_sum_of_three() {
        System.out.println("result should be expected");
    }



    @Given("User divides two numbers")
    public void user_divides_two_numbers() {
        System.out.println("result should be divided");
    }

    @Then("Result should be division")
    public void result_should_be_division() {

        Assert.assertEquals(20,24);
    }


}
