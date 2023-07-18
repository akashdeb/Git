package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println(dim);
		
		System.out.println("The old dimensions are : "+dim);
		
		Dimension newDim = new Dimension(700, 200);
		driver.manage().window().setSize(newDim);
		
		Dimension dim2 = driver.manage().window().getSize();
		System.out.println("The new dimensions are :"+dim2);
	}

}
