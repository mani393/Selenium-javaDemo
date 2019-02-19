package com.selenium_maven;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_dependc {
	
	@Test(dependsOnGroups= {"h"})
	public void test1( ) {
		System.out.println("im in test1");
	}

@Test(groups= {"h"})
	
	public void test2( ) {
		System.out.println("im in test2");
	}



}
