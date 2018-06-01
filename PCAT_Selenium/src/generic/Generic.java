package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Generic {
	
	public static void VerifyTitle(WebDriver driver,String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try{
			wait.until((ExpectedConditions.titleIs(eTitle)));
			System.out.println("PASS: Title is Matching");
		}catch(TimeoutException e){
			System.out.println("FAIL : Title is NOT Matching");
		}
	}
	
	public static ArrayList<String> getAllTextFromListBox(WebElement listbox){
		Select select = new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> allText = new ArrayList<String>();
		for(WebElement option:allOptions){
			String text = option.getText();
			allText.add(text);
		}
		return allText;
	}

	public static void WaitForElement(final String Xpath,WebDriver Driver)
	{
		WebDriverWait wait = new WebDriverWait(Driver,60 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));	
	}
	
	public static void SwitchToChildWindow(WebDriver Driver){
		Set<String> allWindows = Driver.getWindowHandles();
		for(String curWindow : allWindows){
			Driver.switchTo().window(curWindow);
		}
	}
}
