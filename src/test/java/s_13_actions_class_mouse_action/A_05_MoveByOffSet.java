package s_13_actions_class_mouse_action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_05_MoveByOffSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(460, 201).perform();
	}
}
