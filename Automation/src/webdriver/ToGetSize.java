package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println(dim);
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("The height of the webpage is : "+height);
		System.out.println("The width of the webpage is : "+width);

		

	}

}
