package Scenario_Day2;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5_Q2_Read_Excel {
      WebDriver driver;
	  String url="https://app.simplelogin.io/auth/login";
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
	public void test() throws IOException, InterruptedException {
		String path="G:\\Selenium_sheet.xlsx";
		FileInputStream file1=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file1);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=1;i<=rows;i++)
		{
			String user=sheet.getRow(i).getCell(0).getStringCellValue();
			String pass=sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("email")).sendKeys(user);
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(3000);
			
			
		}
		
	}

}
