package s_01_assignment;

//1.Launch browser
//2.Navigate to easemytrip website
//3.Fetch the title of website
//4.Fetch the current url of website
//5.close browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_03_LaunchEaseMyTrip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		// System.out.println("Title: " +driver.getTitle());
		// System.out.println("Current url: s" +driver.getCurrentUrl());
		driver.close();
	}
}
