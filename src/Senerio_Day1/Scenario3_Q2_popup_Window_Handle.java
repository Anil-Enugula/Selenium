package Scenerio_Day1;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3_Q2_popup_Window_Handle {

	WebDriver driver;
	String url="http://popuptest.com/goodpopups.html";
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
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it=set1.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println("Child Title:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent Title :"+driver.getTitle() );
		
	}

}
