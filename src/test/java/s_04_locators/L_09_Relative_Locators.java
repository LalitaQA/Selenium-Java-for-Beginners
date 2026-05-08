package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to instagram website
//4.Find element email text field using name locator
//5.Use Relative locator

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class L_09_Relative_Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");

		WebElement reff = driver.findElement(By.name("email"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(reff)).sendKeys("lalita@123");
	}
}
