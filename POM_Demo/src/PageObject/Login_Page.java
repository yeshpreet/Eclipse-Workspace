package PageObject;

import java.io.IOException;

import Utility.BaseClass;

public class Login_Page extends BaseClass {

	public Login_Page() throws IOException {
		super();
		
	}

	public void Login_Valid_Cred(String locname, String locvalue, String testdata) {
		//senddata(prop.getProperty("username")); in case of ###
		senddata(prop.getProperty("username"),prop.getProperty("password"), prop.getProperty("username"));
		senddata("id", "email", "sdetbatch0402@gmail.com");
		senddata("id","pass","sdet040213");
		buttonclickother("id","loginbutton");
	}
	
		

	

}
