package s_01_assignment;

//1.Launch browser
//2.Navigate to flipkart website
//3.Fetch the title of website
//4.Print title

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_01_LaunchFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
}