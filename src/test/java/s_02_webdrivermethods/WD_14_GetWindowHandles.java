package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Click on Facebook link in footer
//5.Get both window ID's
//6.Print all window ID's using enhance for loop

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_14_GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Facebook")).click();

		Set<String> wins = driver.getWindowHandles();
		for (String x : wins) {
			System.out.println(x);
		}
	}
}
