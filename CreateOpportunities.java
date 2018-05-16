package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOpportunities {
	
	@FindBy(xpath="//li[@id='Opportunity_Tab']")
	private WebElement Opportunities;

	@FindBy(xpath="//input[@name='new']")
	private WebElement NewButton;
	
	@FindBy(xpath="//input[@title='Continue']")
	private WebElement ContinueButton;
	
	public void clickOpportunities(){
		Opportunities.click();
	}
	
	public void clickNew(){
		NewButton.click();
	}
	
	public void clickContinue(){
		ContinueButton.click();
	}
}
