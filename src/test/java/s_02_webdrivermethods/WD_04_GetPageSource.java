package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to flipkart
//3.Get pagesource 
//4.Print pagesource

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_04_GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getPageSource());
	}
}
