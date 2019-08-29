package PageTest;

import java.io.IOException;
import org.testng.annotations.Test;

import PageObject.Login_Page;
@Test
public class LoginTest extends BaseTest{
	Login_Page lp=new Login_Page();
	public LoginTest() throws IOException {
		super();
		
	}
public void dologin() {
	lp.Login_Valid_Cred("id", "email", "@gmail.com");
	 
}
}
