package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to saucedemo website
//5.Locate username textfield
//6.Enter value using sendkeys
//7.Copy username value
//8.Paste in password field
//9.Click login

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_14_KeyDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");
		WebElement untextField = driver.findElement(By.id("user-name"));
		Actions act = new Actions(driver);
		act.click(untextField).sendKeys("standard_user").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.ENTER).perform();

	}
}
