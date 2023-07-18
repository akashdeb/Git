package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementIdentifiesFirstElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoPage.html");
		
		//find element will identify the first element when duplicate element is present
		WebElement paragraph = driver.findElement(By.tagName("p"));
		
		String getParagraph = paragraph.getText();
		
		System.out.println(getParagraph);

	}

}
