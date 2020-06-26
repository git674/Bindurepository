package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readdatafromexcelbydataprovider extends Resuablecode {
	
	@Test(dataProvider="calculate",groups= {"regression"})
	public void calculate(String homevalue,String downpayment,String loanamt,String interestrate) {
		
		sendkeys(By.id("homeval"),homevalue);
		sendkeys(By.id("downpayment"),downpayment);
		sendkeys(By.id("loanamt"),loanamt);
		sendkeys(By.id("intrstsrate"),interestrate);
		clickonlinkelement(By.name("cal"));
	}
	
	@DataProvider(name="calculate")
	public String[][] getmethod() throws IOException{
		String arr[][]= readdatafromexcel("C:\\Users\\chenn\\Desktop\\Excelsheet.xlsx","Sheet1");
		return arr;
	}

	private String[][] readdatafromexcel(String url, String sheetname) throws IOException {
		String arr[][]=null;
		FileInputStream f1=new FileInputStream(url);
        XSSFWorkbook wb=new XSSFWorkbook(f1);
         XSSFSheet sh=wb.getSheet(sheetname);
        int tot_rows=sh.getLastRowNum();
        int tot_cols=sh.getRow(3).getLastCellNum();
         arr=new String[tot_rows][tot_cols];
           for(int i=1;i<=tot_rows;i++) {
        	 
        	XSSFRow row=sh.getRow(i);
        	 
        	 for(int j=0;j<tot_cols;j++) {
        		 
        		 XSSFCell col=row.getCell(j);
        		 
        		 arr[i-1][j]=col.getStringCellValue();       		 
        		         		 
        	}
         }                 
         	
		return arr;
	}
	

}
