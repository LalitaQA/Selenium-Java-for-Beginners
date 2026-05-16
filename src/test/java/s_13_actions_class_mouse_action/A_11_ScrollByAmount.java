package s_13_actions_class_mouse_action;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_11_ScrollByAmount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://doodles.google/");
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 6000).perform();
	}

}
