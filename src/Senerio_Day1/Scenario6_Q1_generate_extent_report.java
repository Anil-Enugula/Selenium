package com.Extent_report;


import java.io.File;
import java.util.List;

import org.junit.Assert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Scenario6_Q1_generate_extent_report implements IReporter  {
	static com.relevantcodes.extentreports.ExtentTest test;
	static ExtentReports report;

	   WebDriver driver;
		  String url="https://www.google.co.in";
		  
		
		  
		  
		@BeforeClass
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.get(url);
			
		}

		@AfterClass
		public void tearDown() throws Exception {
			driver.close();
		}

	@Test
	public void test() {
		report = new ExtentReports("./targer/extent.html");
		test = report.startTest("ExtentDemo");

		if(driver.getTitle().equals("Google"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}


	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

}


