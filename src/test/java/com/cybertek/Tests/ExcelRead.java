package com.cybertek.Tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {

    @Test
    public void ReadingFromExcel() throws IOException {
        //open excel workbook using XSSWorkBook class

        XSSFWorkbook workbook=new XSSFWorkbook("Employers.xlsx");


        //Goto worksheet

        XSSFSheet worksheet=workbook.getSheet("Sheet1");

        System.out.println(worksheet.getRow(2).getCell(1));


        System.out.println(worksheet.getRow(4).getCell(4));





    }

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook("Employers.xlsx");

        XSSFSheet worksheet=workbook.getSheet("Sheet1");

        System.out.println(worksheet.getRow(2).getCell(1));

        System.out.println(worksheet.getRow(4).getCell(2));
    }



}
