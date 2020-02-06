package com.app.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.AddPageObects;

public class AddPageTest {
	AddPageObects ap;

	public AddPageTest() {
		ap = new AddPageObects();
	}

	@Test
	public void verifyquic() {
		ap.mouseHover(ap.gettab());
		ap.clicart();
		ap.getcheck().click();
		Assert.assertTrue(ap.getProduct().getText().contains("Product"), "");
		Assert.assertTrue(ap.Gettittle().getText().contains("SHOPPING-CART"), "");
		

	}

}
