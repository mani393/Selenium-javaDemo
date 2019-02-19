package com.selenium_maven;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.selenium_maven.testng_listners.class)
public class testng_listnerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("i m in test1");
	}
	@Test
	public void test2()
	{
		System.out.println("i m in test2");
	}

	@Test
	public void test3()
	{
		System.out.println("i m in test3");
	}

}
