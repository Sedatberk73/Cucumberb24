package com.cybertek.Tests;

import com.cybertek.pages.VytrackLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VytrackLoginDDTTest {

    WebDriver driver;
    VytrackLoginPage login=new VytrackLoginPage();

    @Before
    public void SetUp(){

        driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("VytrackLogin.url"));

    }
    @After
    public void teardown(){
//    driver.close();
    }

    @Test
    public void LoginBDDtest() throws IOException {
        //openexelfile
        //addpageobject
        //loop and read credentials
        //write the result in exel
        String filePath="VyTrackQa2Users.xlsx";
        FileInputStream in=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(in);
        XSSFSheet datasheet=workbook.getSheet("data");

        for (int i = 1; i <=datasheet.getLastRowNum() ; i++) {
            String _username=datasheet.getRow(i).getCell(0).toString();
            String _pasword=datasheet.getRow(i).getCell(1).toString();
            String expectedName=datasheet.getRow(i).getCell(2).toString()+" "+datasheet.getRow(i).getCell(3).toString();
          //  System.out.println(_username+" "+_pasword);
            System.out.println(expectedName);
            login.setLoginBtn(_username,_pasword);

            String actualNameAndLast=login.nameAndLastName.getText();

            System.out.println(actualNameAndLast);




            XSSFCell CellResult=datasheet.getRow(i).getCell(4);

            BrowserUtils.sleep(3);
            if (driver.getTitle().trim().equalsIgnoreCase("Dashboard") && expectedName.equals(actualNameAndLast)){
                CellResult.setCellValue("");
                CellResult.setCellValue("PASS");

            }else {
                CellResult.setCellValue("");
                CellResult.setCellValue("FAil!!");
            }

            driver.findElement(By.xpath("//*[@id=\"user-menu\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"user-menu\"]//a[.='Logout']")).click();
        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        in.close();










    }




}
