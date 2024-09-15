package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    static WebDriver driver=new ChromeDriver();
    /*
    Creating the private constructor so this class' object
    is not reachable from outside
     */
    private Driver() {

    }



    public static WebDriver getDriver() {
        driver.manage().window().maximize();


        return driver;
    }

    /*
    This method makes sure we have some form of driver sesion or driver id has.
    Either null or not null it must exist.
     */
    public static void closeDriver() {
        driver.close();

    }


}
