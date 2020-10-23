package Scenario_Day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7_Q2_without_Sendkeys {

	 WebDriver driver;
	  String url="https://app.simplelogin.io/auth/login";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		
	}

	@Test
	public void test() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='anu@gmail.com'");
		js.executeScript("document.getElementById('password').value='anuu'");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}
}
