package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element "Electronics" in menu using xpath locators
//5.Print AccessibleName of it

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_04_GetAccessibleName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement electronicsmenu = driver.findElement(By.xpath("(//a[contains(@href,'electronics')])[1]"));
		System.out.println(electronicsmenu.getAccessibleName());
	}
}
