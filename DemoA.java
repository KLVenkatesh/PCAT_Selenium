package script;
import generic.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.CreateOpportunities;
import pom.LoginPage;
import pom.NewOpportunity;


public class DemoA {
	public static String CHROME_KEY = "webdriver.chrome.driver";
	public static String CHROME_VALUE = "./software/chromedriver.exe";
	public static String URL = "https://test.salesforce.com";
	public static String USERNAME = "priyanka.a.raooth@centurylink.com.itv2";
	public static String PASSWORD = "@Pri1992";
	public static WebDriver driver;
	
//	public static void main(String[] args) throws InterruptedException {
		@BeforeTest
		public void OpenBrowser() {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();

		LoginPage l = new LoginPage();
		PageFactory.initElements(driver, l);
		l.login(USERNAME,PASSWORD);
		
		
		Generic.VerifyTitle(driver, driver.getTitle());
		}
		
		@Test
		public void TestDemoA() {
		CreateOpportunities c = new CreateOpportunities();
		PageFactory.initElements(driver, c);
		Generic.WaitForElement("//li[@id='Opportunity_Tab']", driver);
		c.clickOpportunities();
		Generic.WaitForElement("//input[@name='new']", driver);
		c.clickNew();
		Generic.WaitForElement("//input[@title='Continue']", driver);
		c.clickContinue();
		
//		String parentWindow= driver.getWindowHandle();
		
		NewOpportunity n = new NewOpportunity();
//		Generic.WaitForElement("//img[@class='lookupIcon']", driver);
//		n.SearchImage();
//		
//		Generic.SwitchToChildWindow(driver);
//		Generic.WaitForElement("//input[@id='lksrch']", driver);
//		n.Lookup("Sunday UAT");
//		n.GoButton();
//		Generic.WaitForElement("//a[contains(text(),'Sunday UAT')])[1]", driver);
//		n.HyperLink();
		
//		driver.switchTo().window(parentWindow);
		
		}
		
		@AfterTest
		public void CLoseBrowser() {
//			driver.close();
		}
		
	}

