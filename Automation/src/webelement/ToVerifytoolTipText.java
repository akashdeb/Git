package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytoolTipText {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.flipkart.com/");
		
		WebElement flipkartLogo = driver.findElement(By.xpath("//img[@src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\"]"));

		String toolTipText = flipkartLogo.getAttribute("title");
		
		System.out.println(toolTipText);
	}

}
