package s_05_webelement_actions_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element Search text box using xpath locator
//5.Enter value using sendkeys
//6.Use submit method to click ok

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_04_Submit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchField = driver.findElement(By.xpath("//input[starts-with(@class,'search')]"));
		searchField.sendKeys("computer");
		searchField.submit();
	}
}
