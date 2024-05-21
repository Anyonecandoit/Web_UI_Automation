package com.AI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AI.enums.WaitStrategy;

public class InternetPage extends Basepage {


	By a1abtesting  = By.xpath("//*[@id=\"content\"]/ul/li[1]/a");
	
	By a2AR = By.xpath("/html/body/div[2]/div/ul/li[2]/a");
	By a2aaddelementbutton = By.xpath("/html/body/div[2]/div/div/button");
	By a2deleteelementbutton =  By.xpath("/html/body/div[2]/div/div/div/button[1]");
	
	By a10dragndrop = By.xpath("//*[@id=\"content\"]/ul/li[10]/a");
	
	By dragA = By.xpath("/html/body/div[2]/div/div/div/div[1]");
	By dropB = By.xpath("/html/body/div[2]/div/div/div/div[2]");
	

	public void abtestinglinkclick() throws InterruptedException  {
		
		System.out.println("clicking abtesting");
		click(a1abtesting,  WaitStrategy.CLICKABLE );
		System.out.println("clicked and redirected to new page");
		Thread.sleep(2000);
				
		
	}



	public void dragobject(WebDriver driver) throws Throwable {
		System.out.println("clicking drag and drop link ");
		click(a10dragndrop,  WaitStrategy.CLICKABLE );
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println("about to drag and drop");
		dragndropelement(dragA , dropB ,driver );
		System.out.println("done");
		
	}



	public void addremoveelement() throws Throwable {
		
		addremoveW(a2AR ,WaitStrategy.CLICKABLE  );
		
		Thread.sleep(2000);
		System.out.println("adding element");
		clickona2aaddelementbutton(a2aaddelementbutton ,WaitStrategy.CLICKABLE );
		Thread.sleep(5000);
		System.out.println("deleting element ");
		clickon2deleteelementbutton(a2deleteelementbutton ,WaitStrategy.CLICKABLE );
		Thread.sleep(5000);
	}






	
}
