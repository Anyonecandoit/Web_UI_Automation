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
		
	@Test(enabled = false)
	

public void abtest() throws InterruptedException {
	
	InternetPage ip = new InternetPage();
	
	ip.abtestinglinkclick();
	
}
	
	
	@Test
	
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
	

}