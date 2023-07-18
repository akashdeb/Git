package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathByAxes {

	public static void main(String[] args) {
		//Dynamic Xpath
		String productName = "APPLE iPhone 11 (White, 64 GB)";
		String productPrice = "₹40,999";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_5_0_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_5_0_na_na_na&as-pos=5&as-type=HISTORY&suggestionId=iphone&requestId=36fc4bf2-bf3c-487e-bb90-2993acc74a99");
		
		WebElement priceOfIphone = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+productPrice+"']"));
	
		String actualPrice = priceOfIphone.getText();
		
		System.out.println(actualPrice);
		
		WebElement f = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		driver.switchTo().frame(f);
	}

}
