import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",Driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("Summer dresses");
		driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).click();
//		driver.findElement(By.xpath("//a[@title='Women']")).click();
//		driver.findElement(By.xpath("//span[@class='grower CLOSE']")).click();
//		driver.findElement(By.xpath("//a[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")).click();
		driver.findElement(By.id("selectProductSort")).click();
		driver.findElement(By.xpath("//span[text()='Reference: Highest first')]")).click();
//		
		
		
		

	}

}
