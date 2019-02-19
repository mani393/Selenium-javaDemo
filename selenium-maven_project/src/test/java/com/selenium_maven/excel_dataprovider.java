package com.selenium_maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excel_dataprovider {
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
	String path=System.getProperty("user.dir");
	 driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
//System.out.println(path);
driver = new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

	@Test(dataProvider="test1")
	public void test1(String username,String password) throws Exception
		{
System.out.println(username+" | "+password);
driver.get("https://opensource-demo.orangehrmlive.com/"); 

driver.findElement(By.id("txtUsername")).sendKeys(username);
driver.findElement(By.id("txtPassword")).sendKeys(password);
Thread.sleep(2000);

		}
	 @DataProvider(name="test1")
	public static Object[][] getdata() {
			String path=System.getProperty("user.dir");
			String excelpath=path+"/excel/demo.xlsx";
			
			Object data[][]=testdata(excelpath,"Sheet1");
			return data;
		
	}
public static Object[][] testdata(String excelpath,String sheetname) {
	
	sel_excelemo excel=new sel_excelemo(excelpath, sheetname);
	int rc=excel.getrowcount();
	int cc=excel.getcellcount();
	Object data[][]=new Object[rc-1][cc];
	
	for (int i = 1; i <rc; i++) {
		for (int j = 0; j < cc; j++) {
			
			String cellvalue=excel.getcell(i, j);
			System.out.print(cellvalue+" | ");
			data[i-1][j]=cellvalue;
			
		}
		System.out.println();
		
	}
	
	return data;
	
}
}
