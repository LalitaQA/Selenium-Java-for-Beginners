package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "Search field" using id locator
//5.Get attribute using "name"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_02_GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement product = driver.findElement(By.id("small-searchterms"));
		// Get attribute of web element from web page
		System.out.println(product.getAttribute("name"));
	}
}
