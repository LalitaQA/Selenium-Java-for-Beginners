package s_06_webelement_getter_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_10_GetDomAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement search = driver.findElement(By.id("small-searchterms"));

		System.out.println("-------Before enter any value-------");

		System.out.println(search.getDomAttribute("value"));

		System.out.println(search.getDomProperty("value"));

		search.clear();
		search.sendKeys("books");

		System.out.println("-------After enter any value-------");

		System.out.println(search.getDomAttribute("value"));

		System.out.println(search.getDomProperty("value"));
	}
}
