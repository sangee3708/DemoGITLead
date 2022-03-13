package testNG_Features;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -2)
	private void username() {

		System.out.println("username");

	}

	@Test(priority = 2)
	private void password() {

		System.out.println("passwrod");

	}
}
