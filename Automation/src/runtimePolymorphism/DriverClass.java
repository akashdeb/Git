package runtimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static void main(String[] args) {
		
		ToVerifyGoogleTitle.test(new ChromeDriver());
		System.out.println("The Application has been tested in Chrome");
		
//		ToVerifyGoogleTitle.test(new FirefoxDriver());
//		System.out.println("The Application has been tested in Firefox");
		
		ToVerifyGoogleTitle.test(new EdgeDriver());
		System.out.println("The Application has been tested in Edge");
	}

}
