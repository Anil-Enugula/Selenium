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
import org.openqa.selenium.support.ui.Select;

public class Scenario2_Q1_bootStrap_Handle {
	WebDriver driver;
	String url="https://www.jquery-az.com/boots/demo.php?ex=63.0_2";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws Exception {
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list1=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		//Selecting Java
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getText());
			if(list1.get(i).getText().equals("Java"))
			{
				list1.get(i).click();
				
				break;
			}
		}
		
		
		
		
	}

}
