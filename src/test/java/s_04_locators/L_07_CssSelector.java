package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find Search button using cssselector locator
//5.click

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_07_CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.cssSelector("[class=\"button-1 search-box-button\"]")).click();
	}
}
