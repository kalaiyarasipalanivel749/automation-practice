package com.app.test;

import org.testng.annotations.Test;

public class annotation1 {
 @Test(enabled=false)//skipping the function
 public void test()
 {
	 System.out.println("test is running");
 }
 @Test
 public void test1()
 {
	 System.out.println("test2 is running");
 }
 @Test
 public void test2()
{
	System.out.println("test3 is running"); 
 }
}
