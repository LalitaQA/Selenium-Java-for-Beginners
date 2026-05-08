package s_03_assignment;

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
		driver.get("https://x.com/");

		driver.findElement(By.xpath("//a[@data-testid='signupButton']")).click();
		// driver.close();

	}

}
