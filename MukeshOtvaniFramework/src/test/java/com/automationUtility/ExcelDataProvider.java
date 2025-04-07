package com.automationUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	XSSFWorkbook wb; //we need it outside the method so making it globle
	
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read excel file"+ e.getMessage());
		}
	}
	
	public String getStringData (int sheetIndex, int row, int column)  //method overloading - type of parameter has changed
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData (String sheetName, int row, int column)  // //method overloading
	{
		//return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	
	}
	
	public double getNumericData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
