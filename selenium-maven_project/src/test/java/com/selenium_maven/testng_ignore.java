package com.selenium_maven;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testng_ignore {

	@Ignore
	@Test
	public void test1( ) {
		System.out.println("im in test1");
	}

@Test
	
	public void test2( ) {
		System.out.println("im in test2");
	}


}
