package Senerio_Day1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1_Day1 {
	
	WebDriver driver;
	String url="https://accounts.google.com/signup";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.id("firstName")).sendKeys("Praveen");
		driver.findElement(By.id("lastName")).sendKeys("Enugula");
		driver.findElement(By.id("username")).sendKeys("praveenenu1997");
		driver.findElement(By.name("Passwd")).sendKeys("praven97@$");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("praven97@$");
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]")).click();
	/*
		driver.findElement(By.id("phoneNumberId")).sendKeys("123456781");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
		
		
		WebElement mon=driver.findElement(By.className("month"));
		Select m=new Select(mon);
		m.selectByValue("January");
		
		driver.findElement(By.id("day")).sendKeys("23");
		driver.findElement(By.id("year")).sendKeys("2000");
		WebElement gen=driver.findElement(By.id("gender"));
		Select g=new Select(gen);
		g.selectByValue("Male");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	*/	
   
}}
