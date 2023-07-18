package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);

		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();
		alert.dismiss();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//div[text()='Alerts']")));
		
		driver.findElement(By.id("promtButton")).click();
		
		alert.sendKeys("Qspiders");
		String alertMsg = alert.getText();
		alert.accept();
		
		System.out.println(alertMsg);

	}

}
