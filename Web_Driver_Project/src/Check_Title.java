import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Title {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String exptitle="Facebook � log in or sign up";
		String acttitle=driver.getTitle();
		if (exptitle.contentEquals(acttitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asbdgd@gmail.com");
//		String chktext= driver.findElement(By.xpath("//span[contains(text(),'account')]")).getText();
//		System.out.println(chktext);
		// or we can check by using
		//a[text()='Forgotten Account?']
	}

}
