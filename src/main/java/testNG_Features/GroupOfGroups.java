package testNG_Features;

import org.testng.annotations.Test;

public class GroupOfGroups {

	@Test(groups = "music")
	private void wynk() {

		System.out.println("wynk");
	}
	@Test(groups = "vegetable")
	private void carrot() {

		System.out.println("carrot");
	}
	@Test(groups = "music")
	private void spotify() {

		System.out.println("spotify");
	}
	@Test(groups = "OTT")
	private void netflix() {

		System.out.println("netflix");
	}
	@Test(groups = "OTT")
	private void prime() {

		System.out.println("prime");
	}
	@Test(groups = "OTT")
	private void MXplayer() {

		System.out.println("MX player");
	}
	@Test(groups = "vegetable")
	private void orange() {

		System.out.println("orange");
	}
	@Test(groups = "fruits")
	private void apple() {

		System.out.println("apple");
	}
	@Test(groups = "vegetable")
	private void spinach() {

		System.out.println("spinach");
	}
	@Test(groups = "music")
	private void primeMusic() {

		System.out.println("prime music");
	}
	
}
