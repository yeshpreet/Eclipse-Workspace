import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScript {

	public static void main(String[] args) {
		// Driver rpath
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
				//	launch browser
		WebDriver driver= new ChromeDriver();
//maximize browser
		driver.manage().window().maximize();
	}

}
