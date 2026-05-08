package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Minimize browser
//4.Maximize browser
//5.Navigate to demo web shop
//6.Fullscreen browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_07_Manage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// minimize the browser
		driver.manage().window().minimize();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// fullscreen of the window
		driver.manage().window().fullscreen();
		// driver.close();
	}
}
