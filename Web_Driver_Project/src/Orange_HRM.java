import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Orange_HRM {

	public static void main(String[] args) {
		// https://opensource-demo.orangehrmlive.com/
		System.getProperty("user.dir");
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		//remove blackout 
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();   
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.xpath("//b[text()='PIM']")).click();
			driver.findElement(By.id("btnAdd")).click();
			driver.findElement(By.id("firstName")).sendKeys("Jazz");
			driver.findElement(By.id("lastName")).sendKeys("Sharma");
			driver.findElement(By.id("employeeId")).clear();
			driver.findElement(By.id("employeeId")).sendKeys("1001");
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Jazz']")).isDisplayed());
			driver.findElement(By.xpath("//a[text()='1001']//parent::td/preceding-sibling::td/input")).click();
			driver.findElement(By.id("btnDelete")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			System.out.println(driver.findElement(By.xpath("//a[text()='Jazz']")).isDisplayed());
			
			
			
			
			
			


	}

}
