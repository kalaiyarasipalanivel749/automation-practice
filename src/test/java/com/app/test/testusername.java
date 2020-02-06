package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testusername {
	 public WebDriver driver ; 

	@BeforeMethod
	public void Lauchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	@Parameters({ "UserName", "PassWord" })
	public void loginpage(String UserName, String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
	}

}
