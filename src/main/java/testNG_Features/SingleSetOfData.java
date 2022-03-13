package testNG_Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleSetOfData {

	@Test
	@Parameters({ "username","password" })
	private void schooldetails(@Optional("anitha") String username, 
		@Optional("3033")	String password) {

		System.out.println("schooldetails: " + username);
		System.out.println("schooldetails: " + password);
	}

	@Test(priority = 2)
	@Parameters({ "username2","password2" })
	private void collegedetails(String username, String password) {

		System.out.println("collegedetails: " + username);
		System.out.println("collegedetails: " + password);
	}
}
