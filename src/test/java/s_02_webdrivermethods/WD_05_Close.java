package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to flipkart
//3.Close browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_05_Close {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
}
