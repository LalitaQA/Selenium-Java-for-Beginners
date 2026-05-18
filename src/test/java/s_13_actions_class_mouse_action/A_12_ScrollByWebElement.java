package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to doodles.google website
//5.Locate element using  scrolToElement (WE)

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_12_ScrollByWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://doodles.google/");
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[text()='When is your birthday?']"));
		act.scrollToElement(element).perform();
	}
}
