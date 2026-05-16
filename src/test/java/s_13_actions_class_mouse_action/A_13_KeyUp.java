package s_13_actions_class_mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_13_KeyUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		WebElement textField = driver.findElement(By.id("small-searchterms"));
		Actions act = new Actions(driver);
		act.click(textField).keyDown(Keys.SHIFT).sendKeys("mobile").perform();
	}

}
