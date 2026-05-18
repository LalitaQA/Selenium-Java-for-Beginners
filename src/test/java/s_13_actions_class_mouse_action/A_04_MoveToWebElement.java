package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to woodenstreet website
//5.Use thread.sleep
//6.Locate profile 
//7.Mouse hover on profile using actions method

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_04_MoveToWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		WebElement profileIcon = driver.findElement(By.xpath("//p[text()='Profile']"));
		Actions act = new Actions(driver);
		act.moveToElement(profileIcon).perform();

	}
}
