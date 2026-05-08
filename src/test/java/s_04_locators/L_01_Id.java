package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to shoppersstack website
//4.Use Thread.sleep
//5.Find element "Email" text field using id locator
//6.Enter value using sendkeys
//7.Find element "password" text field using id locator
//8.Enter value using sendkeys

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_01_Id {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(7000);
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdabcd");
	}
}
