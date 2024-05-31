package com.AI.tests;

import org.testng.annotations.Test;

import com.AI.pages.Gainers;

// url =http://the-internet.herokuapp.com/

@Test
public class GainerTest extends BaseTest {
	
	
	@Test(enabled = false)
	public void gainerTest() {


		Gainers g = new Gainers();

		g.getTextofGainers();
	}

	@Test

	public void getcompanynameandcurrencyprice() {

		Gainers g = new Gainers();

		g.getcompanytextcurrentpricetext();

	}


}
