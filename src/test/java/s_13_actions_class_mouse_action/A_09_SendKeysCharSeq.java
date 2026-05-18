package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to demowebshop website
//5.Locate searchtextfield element
//7.Enter value in search textfield using sendKeys (Char seq)

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_09_SendKeysCharSeq {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		WebElement textField = driver.findElement(By.id("small-searchterms"));
		Actions act = new Actions(driver);
		act.moveToElement(textField).click().sendKeys("mobile").perform();
	}
}
