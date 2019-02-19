package com.selenium_maven;

import org.testng.annotations.Test;
@Test(groups= {"alltest"})
public class testng_group {
	
@Test(groups= {"sanity"})
	public void test1()
	{
	System.out.println("i in test1");
	}
@Test(groups= {"sanity","smoke"})
public void test2()
{
System.out.println("i in test2");
}
@Test(groups= {"windows.reg"})
public void test3()
{
System.out.println("i in test3");
}
@Test
public void test4()
{
System.out.println("i in test4");
}
}
