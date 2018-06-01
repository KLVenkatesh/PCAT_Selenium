package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement PassWord;
	
	@FindBy(id="Login")
	private WebElement LoginButon;
	
	public void login(String username,String password){
		UserName.sendKeys(username);
		PassWord.sendKeys(password);
		LoginButon.submit();
	}

}
