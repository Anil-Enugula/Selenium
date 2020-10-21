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
		WebElement fir=driver.findElement(By.id("firstName"));
		fir.sendKeys("Praveen");
		String f=fir.getAttribute("value");
		System.out.println("FirstName:"+f);
		
		WebElement las=driver.findElement(By.id("lastName"));
		las.sendKeys("Enugula");
		String last=las.getAttribute("value");
		System.out.println("LastName:"+last);
		WebElement use=driver.findElement(By.id("username"));
		use.sendKeys("praveenenu1997");
		String user=use.getAttribute("value");
		System.out.println("UserName:"+user);
		
		
		WebElement pas=driver.findElement(By.name("Passwd"));
		pas.sendKeys("praven97@$");
		String pass=pas.getAttribute("value");
		System.out.println("Password:"+pass);
		
		WebElement pas1=driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
		pas1.sendKeys("praven97@$");
		String pass1=pas1.getAttribute("value");
		System.out.println("ConfirmPassword:"+pass1);
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
