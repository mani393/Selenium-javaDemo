package com.selenium_maven;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_retry {
	@Test
	public void test1( ) {
		System.out.println("im in test1");
	}

@Test
	
	public void test2( ) {
		System.out.println("im in test2");
		//int i=1/0;
	}

@Test
public void test3( ) {
	System.out.println("im in test3");
	Assert.assertTrue(false);
}

}
