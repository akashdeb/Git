package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//1. Converting the physical representation of property file to Java Representation
		FileInputStream fis = new FileInputStream("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\testData\\propertyData.properties");
		
		//2. Reading the Java repsentation of property file
		Properties prop = new Properties();
		prop.load(fis);
		
		//3. Calling the value using the key 
		String urlFromPropertyFile = prop.getProperty("url");
		
		System.out.println("The URL is : "+urlFromPropertyFile);
		
		String usernameFromPropertyFile = prop.getProperty("username");
		
		System.out.println("The username is : "+usernameFromPropertyFile);
		
		String passwordFromPropertyFile = prop.getProperty("password");
		
		System.out.println("The password is : "+passwordFromPropertyFile);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(urlFromPropertyFile);
		
		driver.findElement(By.id("username")).sendKeys(usernameFromPropertyFile);
		driver.findElement(By.name("pwd")).sendKeys(passwordFromPropertyFile);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

			
		
		

	}

}
