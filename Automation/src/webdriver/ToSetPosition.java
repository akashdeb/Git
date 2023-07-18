package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
				
		Point pos=new Point(100, 100);
		driver.manage().window().setPosition(pos);

	}

}
