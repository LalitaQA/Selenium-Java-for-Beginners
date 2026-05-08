package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.get window ID
//5.Print window id

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_13_GetWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		// Store the value and print
		String win = driver.getWindowHandle();
		System.out.println(win);

		// or direct print
		// System.out.println(driver.getWindowHandle());
	}
}
