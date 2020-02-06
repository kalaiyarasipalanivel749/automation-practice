package com.app.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPageObects extends BasePage {
	@FindBy(xpath="(//img[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement quicktab;
	@FindBy(xpath="(//a[@title='Add to cart'])[1]")
	private WebElement clickcart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Checkout;
	@FindBy(xpath="//span[@id='summary_products_quantity']")
	private WebElement Product;
	@FindBy(xpath="//h1[@id='cart_title']")
	private WebElement carttitle;
	public AddPageObects()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement gettab()
	{
		return quicktab;
	}
	public void clicart()
	{
		 clickcart.click();;
	}
	public WebElement getcheck()
	{
		return Checkout;
	}
	public WebElement getProduct()
	{
		return Product;
	}
	public WebElement Gettittle()
	{
		return carttitle;
	}
	public void Faded()
	{
		
				
				
	}


	
}
