package s_05_webelement_actions_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element Search text box using xpath locator
//5.Enter value using sendkeys
//6.Use Thread.sleep
//7.Clear text
//8.Use Thread.sleep
//9.Enter value using sendkeys

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_03_Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.sendKeys("Welcome");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("Hello");
	}
}
