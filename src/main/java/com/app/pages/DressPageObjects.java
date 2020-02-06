package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends BasePage {
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dresstab1;

	@FindBys(@FindBy(xpath = "//img[@width='250']"))
	private List<WebElement> prdcont;
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement counting;

	public DressPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress1() {
		return Dresstab1;
	}
	public int getnumber()
	{
		String v=counting.getText();
		String [] m=v.split(" ");
		int coun=Integer.parseInt(m[2]);
		return coun;
	}

public int getcount()
{
	return prdcont.size();
	
	
}


}
