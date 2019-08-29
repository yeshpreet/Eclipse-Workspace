package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Handle {
	public static WebDriver driver;

	@Test
	public void Blaunch() throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Jaspreet/Documents/New%20Dummy%20Website/template_7/template_7/alerts.html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
		Thread.sleep(2000);
		alert.dismiss();
		driver.findElement(By.xpath("//input[@value='PromptBox']")).click();
		Thread.sleep(2000);
		alert.getText();
		alert.sendKeys("ABC");
		alert.accept();
	}
}
