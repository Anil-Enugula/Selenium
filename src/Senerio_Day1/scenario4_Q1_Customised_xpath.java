package Scenerio_Day1;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario4_Q1_Customised_xpath {
	WebDriver driver;
	String url="https://www.google.com";


	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("clothes");
		Thread.sleep(3000);
		List<WebElement> list1=driver.findElements(By.xpath(".//*[@role='listbox']/li"));
		for(WebElement web:list1)
		{
			if(web.getText().trim().equals("clothes dryer"))
			{
				web.click();
				break;
			}
		}
		Thread.sleep(5000);
	
	}

}
