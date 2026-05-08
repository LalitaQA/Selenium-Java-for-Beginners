package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Perform different functions using different xpath's

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_08_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// Absolute xpath
		// click on login link
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

		// Relative xpath By Attribute
		// click on search
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();

		// Relative xpath By TextFunction
		// click on forgot password in instagram
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();

		// Relative xpath By Contains
		// Enter text in search field
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[contains(@id,'small')]")).sendKeys("How are you!");

		// Relative xpath By Multiple Attribute
		// Enter text in search field
		driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("good");

		// Relative xpath By indexing
		// Enter text in newsletter field
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");

		// Relative xpath By starts-with
		// Enter text in search field
		driver.findElement(By.xpath("//input[starts-with(@class,'search')]")).sendKeys("Hello");

		// Relative xpath By axes
		driver.findElement(By.xpath("//label[text()='Poor']/preceding-sibling::input")).click();
	}
}
