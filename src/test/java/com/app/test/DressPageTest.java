package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressPageObjects;

public class DressPageTest {
	DressPageObjects dp;

	public DressPageTest() {
		dp = new DressPageObjects();
	}

	@Test
	public void verifysiz() {
		dp.getDress1().click();
		//boolean v=dp.getcount()==dp.getnumber();
		Assert.assertTrue(dp.getcount()==dp.getnumber());

	}

}