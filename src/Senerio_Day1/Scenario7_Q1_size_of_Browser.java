package Scenario_Day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7_Q1_size_of_Browser {
	@Test
	public void test() throws InterruptedException {
		 WebDriver driver;
		  String url="https://www.google.co.in/";
		
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.get(url);
			Dimension size=new Dimension(200, 500);
			driver.manage().window().setSize(size);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.quit();
		}

}
