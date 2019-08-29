
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class Youtube_playlist {
 
	public static void main(String[] args) throws Exception {
		
		// Driver path
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//open google page
		driver.get("https://www.youtube.com/watch?v=S-ezhTXPVGU&list=RDEMxYH97nhYLaN9WtWyVLWJxA&start_radio=1");
		
		
	}
 
}