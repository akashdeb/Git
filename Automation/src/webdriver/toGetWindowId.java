package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class toGetWindowId {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		String windowId = driver.getWindowHandle();
		
		System.out.println("The window id 1 is : "+windowId);
		
		ChromeDriver driver1 = new ChromeDriver();
		
		String windowId2 = driver1.getWindowHandle();
		
		System.out.println("The window id 2 is : "+windowId2);

	}

}
