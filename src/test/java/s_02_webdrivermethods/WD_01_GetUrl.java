package s_02_webdrivermethods;

//1.Launch browser
//2.Navigate to demo web shop

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_01_GetUrl {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
