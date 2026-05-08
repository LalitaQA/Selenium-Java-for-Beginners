package s_03_searchcontextmethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Get all the link text
//5.Print using enhance for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC_02_FindElements {
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
