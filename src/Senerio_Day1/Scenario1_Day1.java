package Senerio_Day1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1_Day1 {
	
	WebDriver driver;
	String url="http://accounts.google.com/signup";

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
		driver.findElement(By.id("firstName")).sendKeys("Praveen");
		driver.findElement(By.id("lastName")).sendKeys("Enugula");
		driver.findElement(By.id("username")).sendKeys("praveenenu1997");
		driver.findElement(By.name("Passwd")).sendKeys("praven97@$");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("praven97@$");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/span/span")).click();
	}

}
