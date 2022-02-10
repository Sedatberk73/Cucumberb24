package com.cybertek.step_definitions;
import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {
@Before
public void setup(){
    System.out.println("BEFORE -setUp method is running before the scenario");


}






    @After
    public void tearDownScenario(Scenario scenario) {

            if (scenario.isFailed()) {
                byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(image, "image/png", scenario.getName());


            }
        System.out.println("AFTER - tearDown method is running after the scenario: " + scenario.getName());
        Driver.closeDriver();

    }














}
