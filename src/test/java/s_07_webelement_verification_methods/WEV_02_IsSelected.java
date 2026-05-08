package s_07_webelement_verification_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to deno web shop website
//4.Find element "poll-block-1" using xpath locators
//5.Print it is selected or not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEV_02_IsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement poll = driver.findElement(By.xpath("//div[@id='poll-block-1']"));
		System.out.println(poll.isSelected());
	}
}
