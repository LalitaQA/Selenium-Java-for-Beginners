package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "View all" using linktext locators and getsize of it and store in variable
//5.Print size of it
//6.Print size as width and height

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_07_GetSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Dimension size = driver.findElement(By.linkText("View all")).getSize();
		System.out.println(size);
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
	}
}
