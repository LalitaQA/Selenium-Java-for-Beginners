package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Set position of browser 
//5.Print position of browser using getposition

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_11_ManageSetPosition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().setPosition(new Point(10, 10));
		System.out.println(driver.manage().window().getPosition());
	}
}
