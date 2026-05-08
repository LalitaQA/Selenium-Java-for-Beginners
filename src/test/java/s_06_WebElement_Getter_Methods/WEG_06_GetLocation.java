package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "View all" using linktext locators
//5.Print location of it

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_06_GetLocation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement viewall = driver.findElement(By.linkText("View all"));
		System.out.println(viewall.getLocation());

		// Or
		Point location = viewall.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
	}
}
