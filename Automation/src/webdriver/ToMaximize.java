package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximize {
//Automation Rule1: Always maximize ur screen after launching 
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
	}

}
