package testNG_Features;

import org.testng.annotations.Test;

public class Ignore {

	@Test
	private void wynk() {

		System.out.println("wynk");
	}

	@Test(enabled = false)
	private void spotify() {

		System.out.println("spotify");
	}

	@Test
	private void facebook() {

		System.out.println("facebook");
	}

	@Test
	private void instagram() {

		System.out.println("instagram");
	}

	@org.testng.annotations.Ignore
	@Test
	private void whatsup() {

		System.out.println("whatsup");
	}
}
