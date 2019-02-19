package com.selenium_maven;

public class utils_excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir");
		sel_excelemo excel=new sel_excelemo(path+"/excel/demo.xlsx", "Sheet1");
		excel.getrowcount();
		excel.getcell(1, 0);
	}

}
