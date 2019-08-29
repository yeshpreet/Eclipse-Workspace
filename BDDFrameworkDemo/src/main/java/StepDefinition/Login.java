package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;
	
	
@Given ("^Open Browser$")
public void OpenBrowser() {
	String driverPath=System.getProperty("user.dir")+"\\src\\main\\java\\Browser_Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
}

@And ("^Launch application$")
public void launchapp() {
	driver.get("https://www.facebook.com/");
}
@When("^User enters valid username$")
public void user_enters_valid_username()  {
    // Write code here that turns the phrase above into concrete actions

}

@And("^User enter valid password$")
public void user_enter_valid_password()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^CLick on Login Button$")
public void click_on_Login_Button()  {
    // Write code here that turns the phrase above into concrete actions
    
}

}
