package com.AI.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot  {
	private static WebDriver driver ;
	 public Screenshot(WebDriver driver) {
	        this.driver = driver;
	    }

	public void takescreenshot() {
		 System.out.println("about to take screenshot ");
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 System.out.println("screenshot taken ");
		 try {
			 
			 String df = "C:\\Users\\shravan\\Downloads\\AI-Framework2023-master\\AI-Framework2023-master\\test-output\\screenshotskranthi\\screenshot.png";
	
			 System.out.println("screenshot taken storing in destination ");
			 FileUtils.copyFile(screenshotFile, new File(df));
			 System.out.println("done screenshot saved ");
		
		 } catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
