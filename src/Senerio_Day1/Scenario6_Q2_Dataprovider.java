package com.Extent_report;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Scenario6_Q2_Dataprovider {
	@Test(dataProvider="getData")
	  public void setdata(String username,String password) 
		{
			System.out.println("UserName:"+username);
			System.out.println("Password:"+password);
			
	  }
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[2][2];
			data[0][0]="user1";
			data[0][1]="pass1";
			data[1][0]="user2";
			data[1][1]="pass2";
			return data;
		}
}
