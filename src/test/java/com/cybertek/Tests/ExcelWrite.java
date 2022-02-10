package com.cybertek.Tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String filePath="Employers.xlsx";

    @Test
    public void writeExcelSheetData() throws IOException {
        //open the Employees.xlsx using Apache POI
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        //Goto "data" sheet. or goto first sheet by index
        XSSFSheet dataSheet = workbook.getSheetAt(0);

        //add a column name "Salary" and save into file
        XSSFCell salaryColCell = dataSheet.getRow(0).createCell(3);
        salaryColCell.setCellValue("Salary");

        XSSFCell salaryColCellfirst = dataSheet.getRow(1).createCell(3);
        salaryColCellfirst.setCellValue("10$");

        //save the changes:
        //open to write to the file: FileInputStream -> reading
        //                           FileOutputStream -> writing
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        in.close();




















    }


}
