package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to demo web shop
//3.Get title of page
//4.Print title

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_02_GetTitle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
}
