package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static String url;
	
	public BaseClass() throws IOException {
		String propfilepath= System.getProperty("user.dir") +"\\src\\TestData\\TestData.properties";
		File file= new File(propfilepath);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		prop.getProperty("username");
		System.out.println(prop.getProperty("username"));
	 }
	
	
	public By getlocator(String locname, String locvalue) {
		By by=null; 
		switch(locname) {
		case "id":
		by=	By.id(locvalue);
			break;
		case "name":
			by=By.name(locvalue);
			break;	
		case "linkText":
			by=By.linkText(locvalue);
			break;
		case "partialLinkText":
			by=By.partialLinkText(locvalue);
			break;
		case "xpath":
			by=By.xpath(locvalue);
			break;
		case "cssSelector":
			by=By.cssSelector(locvalue);
			break;
		case "className":
			by=By.className(locvalue);
			break;
		case "tagname":
			by=By.tagName(locvalue);
			break;
		default : {
			System.out.println("Locator not found");
		}
		}
		return by;
	}
	public void senddata(String locname, String locvalue, String testData) {// also make other methods using xpath
		driver.findElement(getlocator(locname, locvalue)).sendKeys(testData);
		
	}
	public void buttonclick(String elmloc) {
		String [] arr = elmloc.split("###");
		String locname=arr[0];
		String locvalue=arr[1];
		driver.findElement(getlocator(locname,locvalue)).click();	
	}
	
	public void buttonclickother(String locname, String locvalue) {
		driver.findElement(getlocator(locname, locvalue)).click();	
	}
	
	public void elementdisplayed() {
	//or add in send data	
	}
//	public void cleardata() {
//		boolean ab =driver.findElement());
//	}
	
//	public void gettitle() {
//		.gettitle();
//	}
	public void linkclick() {
		//check clickability of element
	}
	public void gettext() {
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClass obj= new BaseClass();
		
		//obj.launchBrowser("chrome","Browsers\\chromedriver.exe","https://www.facebook.com/");
		Thread.sleep(2000);
		//passing 3 parameters
		obj.senddata("id","email","sdetbatch0402@gmail.com");
		obj.senddata("id", "pass", "sdet040213");
		//obj.buttonclick("id","loginbutton")
//		//other way of same above method ### method
		obj.buttonclick("id###loginbutton");  //"id###email###sdetbatxgdbjfd"
	}
}
