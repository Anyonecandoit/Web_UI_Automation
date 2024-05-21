package com.AI.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AI.listeners.ListenerClass;
import com.AI.pages.InternetPage;
@Listeners({ListenerClass.class})



public class InternetTest extends BaseTest {
	private WebDriver driver;
		
	@Test(enabled = true , groups = {"sanity" ,"functional"} )
	

public void abtest() throws InterruptedException {
	
	InternetPage ip = new InternetPage();
	
	ip.abtestinglinkclick();
	
}
	
	
	@Test(enabled = true , dependsOnGroups = {"smoke"} ,dependsOnMethods = "abtest" , groups = {"smoke"})
	
	public void addelement() throws Throwable {
		InternetPage ip = new InternetPage();
		ip.addremoveelement();
	}
	
	@Test(enabled = false)
public void dragNdrop() throws Throwable {
		driver = new ChromeDriver();
		
		
	InternetPage ip = new InternetPage();
	
	ip.dragobject(driver);
	
}
	
	
	@Test 
	
	public void checkboxes() {
		InternetPage ip = new InternetPage();
		ip.clickoncheckboxes();
		
	}
	

}