package Scenerio_Day1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4_Q2_Auto_scroll {
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
	public void test() throws InterruptedException {
		JavascriptExecutor javas=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		javas.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
	}

}
