package com.AI.pages;

import org.openqa.selenium.By;

import com.AI.enums.WaitStrategy;

public class Gainers extends Basepage {

	
	
	By gainerslist = By.xpath("/html/body/div[2]/div[5]/table/tbody/child::tr");
	
	By cn = By.xpath("/html/body/div[2]/div[5]/table/tbody/child::tr/child::td[1]/child::a");
	
	By cp = By.xpath("/html/body/div[2]/div[5]/table/tbody/child::tr/child::td[3]");
	
	
	
	public void getTextofGainers() {
		
		getText(gainerslist , WaitStrategy.PRESENCE);
		
		
	}
	
	
	public  void getcompanytextcurrentpricetext() {
		
		
		extracttabledata(cn, cp, WaitStrategy.PRESENCE);
	}
	
}
