package PageTest;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import Utility.BaseClass;

public class BaseTest extends BaseClass {
	
	public static WebDriver driver;
	public static String url;
	
	public BaseTest() throws IOException {
		super();
		
	}
	
	@Parameters("browsername")
	@Test
	public void launchBrowser(String browser, String dpath) {
		System.getProperty("user.dir");
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}
	
		LaunchApp();
	}
	
	public void LaunchApp() {
		url="www.facebook.com";
		driver.get(url);
		driver.manage().window().maximize();   
	}
	 public void pagetitle() {
		
		
		
	}
}
