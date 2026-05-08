package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "Register" link using linktext locator
//5.Click

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_03_linkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
	}
}
