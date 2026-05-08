package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "nivo-imageLink" using classname locators and getRect of it and store in variable
//5.Print size of it
//6.Print size as width and height

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_08_GetRect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Rectangle link = driver.findElement(By.className("nivo-imageLink")).getRect();

		System.out.println("------for links-------");
		System.out.println(link.x);
		System.out.println(link.y);
		System.out.println(link.width);
		System.out.println(link.height);
		System.out.println(link.getX());
		System.out.println(link.getY());
		System.out.println(link.getWidth());
		System.out.println(link.getHeight());
		System.out.println(link.getDimension());
		System.out.println(link.getPoint());
	}
}
