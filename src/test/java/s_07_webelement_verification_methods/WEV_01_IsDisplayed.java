package s_07_webelement_verification_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to Twitter website
//4.Find element "Happening now" text using xpath locators
//5.Print it is displayed or not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEV_01_IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/");

		WebElement text = driver.findElement(By.xpath("//span[text()='Happening now']"));
		System.out.println(text.isDisplayed());
	}
}
