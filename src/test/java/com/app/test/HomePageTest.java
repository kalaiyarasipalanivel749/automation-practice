package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.HomePageObjects;

public class HomePageTest {
	HomePageObjects hp;

	public HomePageTest() {
		hp = new HomePageObjects();
	}

	@Test
	public void verifyButton() {
		Assert.assertTrue(hp.getWom().isDisplayed(), "failed");
		Assert.assertTrue(hp.getDress().isDisplayed());
		Assert.assertTrue(hp.getTshirts().isDisplayed());

		hp.getWom().click();
		hp.getDress().click();

		hp.getTshirts().click();

	}

	@Test
	public void verifynav() {
		hp.getWom().click();
		Assert.assertTrue(hp.getTitlte().contains("Women"), "faikled");
	}
}
