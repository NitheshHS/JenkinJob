package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void connectToDB() {
		System.out.println("Connecting to DB...");
	}

	@BeforeClass
	public void initBrowserI() {
		String browser=System.getProperty("Browser");
		System.out.println("browser --->"+browser);
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser input--> "+browser);
		}
	}

	@BeforeMethod
	public void login() {
		System.out.println("Perform login");
	}


	@AfterMethod
	public void logout(){
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("close DB connection");
	}


}
