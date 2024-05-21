package com.AI.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AI.listeners.ListenerClass;
import com.AI.pages.InternetPage;

@Listeners({ListenerClass.class})
public class InternetTest2 extends BaseTest {
    private WebDriver driver;
        
    @Test(enabled = false, 
          alwaysRun = true,
          dependsOnGroups = {"group1", "group2"},
          dependsOnMethods = {"method1", "method2"},
          groups = {"group1", "group2"} )
         // inheritGroups = true,
        //  onlyForGroups = {"group1", "group2"})
    public void abtest() throws InterruptedException {
        InternetPage ip = new InternetPage();
        ip.abtestinglinkclick();
    }
    
    @Test(dataProvider = "data", 
         // dataProviderClass = TestData.class,
          description = "Test to add elements",
          enabled = true,
          expectedExceptions = Throwable.class,
          groups = {"group1"},
          invocationCount = 3,
          invocationTimeOut = 10000,
          priority = 1,
          successPercentage = 80,
          singleThreaded = false,
          threadPoolSize = 5)
    public void addelement(String data) throws Throwable {
        InternetPage ip = new InternetPage();
        ip.addremoveelement();
    }
    
    @Test(enabled = false,
          alwaysRun = true,
          dependsOnGroups = {"group1", "group2"},
          dependsOnMethods = {"method1", "method2"},
          groups = {"group2"},
          invocationCount = 2,
          timeOut = 5000)
    public void dragNdrop() throws Throwable {
        driver = new ChromeDriver();
        InternetPage ip = new InternetPage();
        ip.dragobject(driver);
    }
    
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][] {{"data1"}, {"data2"}, {"data3"}};
    }
    
    @Factory
    public Object[] createInstances() {
        return new Object[] {new InternetTest2()};
    }
    
    @Parameters(value = {"param1", "param2"})
    @Test
    public void testWithParameters(String param1, String param2) {
        // Test method with parameters
    }
}
