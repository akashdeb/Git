package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToKnowTheNumberOfAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("movies");
		
		Thread.sleep(2000);

		List<WebElement> allAutosuggestions = driver.findElements(By.xpath("//span[text()='movies']"));
		
		System.out.println("The no. of Autosuggestions are : "+allAutosuggestions.size());
		
		for(WebElement suggestion:allAutosuggestions) {
			System.out.println(suggestion.getText());
		}
		
	}

}
