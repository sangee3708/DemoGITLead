package testNG_Features;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority = -2)
	private void browserLaunch() {

		System.out.println("browser Launch");
	}

	@Test(priority = 0)
	private void url() {

		System.out.println("url");
	}

	@Test(priority = 2 , invocationCount = 3)
	private void refresh() {

		System.out.println("refresh");
	}
}
