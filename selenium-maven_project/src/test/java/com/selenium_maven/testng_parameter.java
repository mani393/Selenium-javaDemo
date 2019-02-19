package com.selenium_maven;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_parameter {
	@Test
	@Parameters({"myname"})
	public void test(@Optional("pradyot") String name) {
		System.out.println("name is "+name);
	}

}
