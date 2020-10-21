package Scenerio_Day1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario3_Q1_switch_to_new_Tab {


	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
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
		//driver.close();
	}

	@Test
	public void test() {
		
		String NewTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Medical Records")).sendKeys(NewTab);
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	    driver.findElement(By.linkText("Search Patient")).click();
	    WebElement list1=driver.findElement(By.id("search_type"));
	    Select sel=new Select(list1);
	    sel.selectByIndex(2);
	    driver.findElement(By.id("search_patient")).click();
	    }

}
