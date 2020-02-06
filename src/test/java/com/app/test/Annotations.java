package com.app.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test is running");
	}
	@Test
	public void test()
	{
		System.out.println("test is running");
	}
@BeforeSuite
public void beforesuite()
{
	System.out.println("beforesuite is running");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("after suite is running");
}
@AfterClass
public void aftertest()
{
	System.out.println("afterclass is running");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("before class is running");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("before method is running");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("after method iis running");
}
@Test
public void Test2()
{
	System.out.println("test is run");
}
}
