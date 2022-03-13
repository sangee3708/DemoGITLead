package testNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class MultipleSetOfData {

	@Test(dataProvider = "data")
	private void schooldetails( String username, int age) {

		System.out.println("schooldetails: " + username);
		System.out.println("schooldetails: " + age);
	}
	@DataProvider
	private Object[][] data() {

		return new Object[][]
				
				{
			{"ani",6},
			{"shivani",8},
			{"abi",7}
				};
	
	}
}
