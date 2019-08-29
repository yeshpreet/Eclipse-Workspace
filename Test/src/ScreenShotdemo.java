import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotdemo {
	public static WebDriver driver;
	@org.testng.annotations.Test
	public void SsCode() throws IOException {
		//Launch Browser
		String Driver=System.getProperty("user.dir");
        String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
        System.setProperty("webdriver.chrome.driver",Driverpath);
        driver=new ChromeDriver();
        //Launch App.  
        driver.get("https://www.google.com/?gws_rd=ssl");
        //Take ScreenShot 
        TakesScreenshot sshot=((TakesScreenshot)driver);
        File sshotfile=sshot.getScreenshotAs(OutputType.FILE);
        //Store the screenshot at destination
        File destfile = new File("C:\\Users\\Jaspreet\\Pictures\\test.png");
        FileUtils.copyFile(sshotfile,destfile);
	    }
}
