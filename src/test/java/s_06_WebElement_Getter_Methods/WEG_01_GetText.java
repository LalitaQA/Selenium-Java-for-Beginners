package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "Virtual gift card" using xpath locator
//5.Get text "Virtual gift card"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_01_GetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement register = driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[2]"));
		// Get text of web element from web page
		System.out.println(register.getText());
	}
}
