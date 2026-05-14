package s_13_actions_class_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_04_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		WebElement profileIcon = driver.findElement(By.xpath("//p[text()='Profile']"));
		Actions act = new Actions(driver);
		act.moveToElement(profileIcon).perform();

	}

}
