package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to selenium dev website
//5.Locate draggable element
//6.Locate droppable element
//7.Perform drag and drop using actions method

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_06_DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
}
