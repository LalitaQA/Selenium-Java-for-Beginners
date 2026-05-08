package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to flipkart
//3.Get current url of page
//4.Print current url

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_03_GetCurrentUrl {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);// OR

		System.out.println(driver.getCurrentUrl());
	}
}
