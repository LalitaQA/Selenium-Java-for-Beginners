package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Get size of browser 
//5.Print size of browser

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_08_ManageGetSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension dim = driver.manage().window().getSize();
		System.out.println("Height: " + dim.getHeight());
		System.out.println("Width: " + dim.getWidth());
	}
}
