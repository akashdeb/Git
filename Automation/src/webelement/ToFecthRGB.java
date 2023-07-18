package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFecthRGB {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.facebook.com/");
		
		String rgb = driver.findElement(By.name("login")).getCssValue("akash");
		System.out.println(rgb);
	}

}
