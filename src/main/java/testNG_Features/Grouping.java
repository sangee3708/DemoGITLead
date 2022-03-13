package testNG_Features;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "fruits")
	private void apple() {

		System.out.println("apple");
	}
	@Test(groups = "fruits")
	private void orange() {

		System.out.println("orange");
	}
	@Test(groups = "fruits")
	private void grapes() {

		System.out.println("grapes");
	}
	@Test(groups = "fruits")
	private void pineapple() {

		System.out.println("pineapple");
	}
	@Test(groups = "vegetable")
	private void carrot() {

		System.out.println("carrot");
	}
	@Test(groups = "vegetable")
	private void beetroot() {

		System.out.println("beetroot");
	}
	@Test(groups = "vegetable")
	private void spinach() {
		
		System.out.println("spinach");
	}
	@Test(groups = "vegetable")
	private void beans() {

		System.out.println("beans");
	}

}
