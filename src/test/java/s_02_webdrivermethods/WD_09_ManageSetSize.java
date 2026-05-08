package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to demo web shop
//3.Set size of browser 
//4.Print size of browser

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_09_ManageSetSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		// Create an object for Dimension class and pass refrence variable in set size
		// method
		Dimension dim = new Dimension(700, 300);
		driver.manage().window().setSize(dim);
		System.out.println(dim);

		// OR create an object directly in setsize method becoz of code optimization
		// driver.manage().window().setSize(new Dimension(300,300));
	}
}
