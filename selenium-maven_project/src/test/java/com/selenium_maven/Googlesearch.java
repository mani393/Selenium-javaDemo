package com.selenium_maven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Googlesearch {
public static String browsername=null;
	
	public static void main(String[] args) throws InterruptedException, Exception {
		google_search();
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\SONY\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
	}
		public static void google_search() throws IOException
		{
			//propeertiesdemo.getproperties();
			String path=System.getProperty("user.dir");
			WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
		System.out.println(path);
		
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
	 driver = new ChromeDriver();
			
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.get("https://www.google.co.in/"); 
	    System.out.println(driver.getTitle());
	    //Runtime.getRuntime().exec("C:\\Program Files (x86)\\Notepad++\\Notepad++.exe");
	    
	
	    //Thread.sleep(2000);
	    
	    //Thread.sleep(2000);
	    
	    driver.close();
		
	
	        }
}
