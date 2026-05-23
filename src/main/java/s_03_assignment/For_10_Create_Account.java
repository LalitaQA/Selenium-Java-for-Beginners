package s_03_assignment;

import java.time.Duration;

//1.Open the browser 
//2.Navigate to https://x.com/
//3.Click on the Create account (Using x path only {Use any one})
//4.Close the browser 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_10_Create_Account {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		// driver.close();

	}

}
