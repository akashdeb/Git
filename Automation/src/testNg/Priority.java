package testNg;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void akash() {
		System.out.println("From Akash");
	}
	
	@Test(priority = 2)
	public void pankaj() {
		System.out.println("From Pankaj");
	}

	
	@Test
	public void vineet() {
		System.out.println("From Vineet");
	}

	
	@Test
	public void jyoti() {
		System.out.println("From Jyoti");
	}


}
