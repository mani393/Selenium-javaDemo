package com.selenium_maven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sel_excelemo {
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public sel_excelemo(String excelpath,String Sheetname)
	{
		
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(Sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public static void main(String[] args) {
		
		
	}
	
	public static int getrowcount()
	
	
	{
				
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("rows:-"+rowcount);
		return rowcount;
		
	}
public static int getcellcount()
	
	
	{
				
		int cellcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("rows:-"+cellcount);
		return cellcount;
		
	}
		public static String getcell(int rownum,int colnum)
		{
				
			
			//workbook = new XSSFWorkbook(path+"/excel/demo.xlsx");
			 //sheet=workbook.getSheet("Sheet1");
			String data=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println("cell value:-"+data);
			return data;
		}
	

}
