package com.app.test;




import org.testng.annotations.Test;

public class Annopriority {
	@Test(priority=3)
	public void test1()
	{
		System.out.println("test1 is running");
	}
	@Test(priority=1)
	 public void test2()
	{
		System.out.println("test3 is running"); 
	 }
	@Test
	 public void test3()
	{
		System.out.println("test4 is running"); 
	 }
	@Test(priority=2)
	 public void test4()
	{
		System.out.println("test5 is running"); 
	 }

}
