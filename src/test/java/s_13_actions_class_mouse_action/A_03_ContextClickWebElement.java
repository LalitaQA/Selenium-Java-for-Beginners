package s_13_actions_class_mouse_action;

//1.Open browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to vinothqaacademy website
//5.Locate right click button and store in variable
//6.Create actions class object
//7.Perform rightclick method 

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_03_ContextClickWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://vinothqaacademy.com/mouse-event/");

		WebElement rightClick = driver.findElement(By.id("rightBtn"));

		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
	}
}
