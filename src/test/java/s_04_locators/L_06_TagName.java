package s_04_locators;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find all links using tagname locator
//5.Print all text of link using enhance for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_06_TagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement alltext : alllinks) {
			System.out.println(alltext.getText());
		}
	}
}
