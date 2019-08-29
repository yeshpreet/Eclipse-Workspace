import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_FooterLink {

	public static void main(String[] args) {
		// Driver path
				System.getProperty("user.dir");
			String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions(); 

			options.setExperimentalOption("prefs", prefs);
			WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.facebook.com");
				
				driver.manage().window().maximize();
//			driver.findElement(By.xpath("//a[@href='/r.php']")).click();
//			driver.navigate().back();
			int size = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]//child::li/a")).size();
			System.out.println("Size= " +size);
			for ( int i=1; i<=size; i++) {
			//System.out.println("Start loop");
			driver.findElement(By.xpath("//ul[contains(@class,'pageFooterLinkList')]//child::li["+i+"]/a")).click();
			//System.out.println("loop"+i+" time");
			driver.navigate().back();
			}
			

	}

}
