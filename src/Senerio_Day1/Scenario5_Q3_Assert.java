package Scenario_Day2;

import  org.junit.Assert;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class Scenario5_Q3_Assert {
	   WebDriver driver;
		  String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.get(url);
			
		}

		@After
		public void tearDown() throws Exception {
			driver.close();
		}
	@Test
	public void test() {
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Welcome to OpenClinic : Clinica1", pageTitle);
	}

}
