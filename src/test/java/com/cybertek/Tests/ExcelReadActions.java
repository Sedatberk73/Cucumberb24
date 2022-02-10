package com.cybertek.Tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {


    @Test
    public void readExcelSheetData() throws IOException {
        String  filepath="Employers.xlsx";


        XSSFWorkbook workbook=new XSSFWorkbook("Employers.xlsx");
        XSSFSheet worshhet=workbook.getSheet("Sheet1");

        System.out.println(worshhet.getRow(1).getCell(0));

        String name= worshhet.getRow(1).getCell(0).toString();
        System.out.println(name);

        System.out.println(worshhet.getRow(1).getCell(0));

        for (int i = 0; i <=2; i++) {

            System.out.println(worshhet.getRow(0).getCell(i));

        }
        System.out.println(worshhet.getRow(3).getLastCellNum());//get last index of cell

        int rowscount=worshhet.getPhysicalNumberOfRows();//get count of rows
        System.out.println(rowscount);


        for (int i = 1; i <rowscount; i++) {

         if (worshhet.getRow(i).getCell(0).toString().equals("Sedat")){
             System.out.println(worshhet.getRow(i).getCell(0)+" | "+worshhet.getRow(i).getCell(1 )+" | "+worshhet.getRow(i).getCell(2));
             break;
         }

        }



    }



}
