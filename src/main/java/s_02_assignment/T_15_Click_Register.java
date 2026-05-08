package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click Register, 
//4.then use isDisplayed() to check 
//5.if the Register button is visible.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_15_Click_Register {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Register")).click();
		boolean registerButtonDisplay = driver.findElement(By.id("register-button")).isDisplayed();
		System.out.println(registerButtonDisplay);
	}
}
