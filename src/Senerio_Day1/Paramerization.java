package com.Extent_report;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Parameterization {
	WebDriver driver;
	String url="https://app.simplelogin.io/auth/login";
	
   @BeforeClass
	public void beforeClass() {
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  }
   
 
  @Test
  @Parameters({"user","password"})
  public void test(@Optional("Abs@gmail.com")String user, @Optional("abs123")String password) {
	 driver.findElement(By.id("email")).sendKeys(user);
	 driver.findElement(By.id("password")).sendKeys(password);
	 driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div/div[4]/button")).click();
	 
	  
  }
 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
