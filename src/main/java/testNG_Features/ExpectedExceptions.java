package testNG_Features;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	private void operations() {

		int a = 20;
		System.out.println(a/0);
	}
}
