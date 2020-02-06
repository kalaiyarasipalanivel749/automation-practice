package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovide {
	public WebDriver driver;
	@BeforeMethod
	public void lauchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	
	}
	@DataProvider(name="testData")
	public Object [][] getData()
	{
		Object[][] data =new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		data[2][0]="kalai";
		data[2][1]="kalai123";

return data;
		
	}
	@Test(dataProvider="testData")

	public void login (String Email,String Pass)throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys(Email);
		driver.findElement(By.id("txtPassword")).sendKeys(Pass);
		driver.findElement(By.id("btnLogin")).click();
		
	}
}
