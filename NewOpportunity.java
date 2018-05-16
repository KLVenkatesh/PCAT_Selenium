package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewOpportunity {

	@FindBy(xpath="//input[@id='opp4']")
	private WebElement AccountName;

	@FindBy(xpath="//img[@class='lookupIcon']")
	private WebElement SearchImage;
	
	@FindBy(xpath="//input[@id='lksrch']")
	private WebElement Lookup;
	
	@FindBy(xpath="//input[@name='go']")
	private WebElement GoButton;
	
	@FindBy(xpath="(//a[contains(text(),'Sunday UAT')])[1]")
	private WebElement HyperLink;
	
	public void AccountName(){
		AccountName.sendKeys("Sunday UAT");
	}
	
	public void Lookup(String name){
		Lookup.sendKeys(name);
	}
	
	public void HyperLink(){
		HyperLink.click();
	}
	
	public void GoButton(){
		GoButton.click();
	}
		
	public void SearchImage(){
		SearchImage.click();
	}
}
