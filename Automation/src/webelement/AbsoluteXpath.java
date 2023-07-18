package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoXpath.html");
		
		WebElement thirdTxtField = driver.findElement(By.xpath("(//input)[2]"));
		
		thirdTxtField.sendKeys("Kuch bhi");
	}

}
