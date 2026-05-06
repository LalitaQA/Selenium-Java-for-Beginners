package s_06_webelement_getter_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_09_GetTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement img = driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']"));
		System.out.println(img.getTagName());
	}
}
