package com.AI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TDP {

	
	
	
	By Links =  By.xpath("/html/body/nav/div[2]/div/div[2]/div[2]/div/child::div");
	
//	BY by = BY by 
	
	public TDP gettext() {
		
		
		getLinksText(Links);
		
		
		
		return this;
	}
	
	
	
	public List<WebElement> getLinksText(By by) {
		List<WebElement> li = driver.DriverManager.getDriver().findElements(by);
		int count = li.size();
		System.out.println("Total number of links " +count);
		// ExtentManager.getExtentTest().pass("Total no of links is "  + count);
		/**
			for(int i=0; i<li.size();i++)
			{
				System.out.println(li.get(i).getText());
			}*/
		li.forEach(e -> System.out.println(e.getText()));
		return   li ;
	}
}