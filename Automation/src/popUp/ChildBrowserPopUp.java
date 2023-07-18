package popUp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class=\"nav-link\"]"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		for(WebElement link:allLinks) {
			link.click();
		}
		
		action.keyUp(Keys.CONTROL).perform();
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			String currentWindowTitle = driver.getTitle();
			
			if(currentWindowTitle.contains("Project")) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[text()='W3C Recommendation!']")));
			}
		}

	}

}
