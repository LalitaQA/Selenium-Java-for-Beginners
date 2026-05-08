package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to amazon
//3.Navigate to flipkart
//4.Quit browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_06_Quit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
}
