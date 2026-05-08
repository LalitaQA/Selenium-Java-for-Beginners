package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Get window id and print 
//5.Click on Facebook link in footer
//6.Get all window ID's
//7.Traverse all window ID's using enhance for loop and check if any id is equal to parent id or not
//8.If not equal to parent than control move to parent window

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_15_SwitchT0_Windows_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.linkText("Facebook")).click();

		Set<String> wins = driver.getWindowHandles();
		for (String tabs : wins) {
			System.out.println(tabs);
			if (!tabs.equals(parent)) {
				driver.switchTo().window(tabs);
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
	}
}
