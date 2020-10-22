package Scenerio_Day1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Scenario2_Q2_drag_and_Drop {

	WebDriver driver;
	String url="https://jqueryui.com/droppable";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(src, dst).perform();
		
		String drop=driver.findElement(By.xpath("/html/body/div[2]/p")).getText();
		if(drop.equals("Dropped!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
