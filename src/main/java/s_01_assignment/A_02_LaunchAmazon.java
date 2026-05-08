package s_01_assignment;

//1.Launch browser
//2.Navigate to amazon website
//3.Fetch the current url of website
//4.Print current url

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_02_LaunchAmazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);// OR

		System.out.println(driver.getCurrentUrl());
	}
}
