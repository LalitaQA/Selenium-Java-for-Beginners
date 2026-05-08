package s_03_searchcontextmethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to shoppersstack
//4.Use Thread.sleep
//5.Search for email text field and enter value

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC_01_FindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(7000);
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
	}
}
