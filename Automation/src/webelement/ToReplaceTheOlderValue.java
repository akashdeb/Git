package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReplaceTheOlderValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoXpath.html");
		
		WebElement a = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		WebElement b =driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
		WebElement c =driver.findElement(By.xpath("(//input[@type = 'text'])[3]"));
		WebElement d =driver.findElement(By.xpath("(//input[@type = 'text'])[4]"));
		
		a.clear();
		a.sendKeys("Ashish");
		
		b.clear();
		b.sendKeys("Saurav");
		
		c.clear();
		c.sendKeys("Manisha");
		
		d.clear();
		d.sendKeys("Madhuri");

		
	}

}
