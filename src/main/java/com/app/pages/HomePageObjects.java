package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement Womtab;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresstab;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirttab;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts'][1]")
	private WebElement quicktab;
	@FindBy(xpath="//p[@id='add_to_cart']")
	private WebElement addcart;

	
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWom() {
		return Womtab;
	}
	
	
	public WebElement getDress()
	{
		return Dresstab;
	}
public WebElement getTshirts()
{
	return Tshirttab;
}
public WebElement getquick()
{
	return quicktab;
}
public WebElement getcart()
{
	return addcart;
}
}
	
