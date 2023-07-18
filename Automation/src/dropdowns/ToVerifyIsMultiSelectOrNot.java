package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyIsMultiSelectOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		
		WebElement carWalaDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carWalaDropdown);
		boolean multiSelect = select.isMultiple();
		
		if(multiSelect) {
			System.out.println("The dropdown is multiselect");
		}
		
		else
			System.out.println("The dropdown is single select");

	}

}
