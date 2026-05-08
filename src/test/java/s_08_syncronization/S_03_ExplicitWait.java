package s_08_syncronization;

//1.Launch browser
//2.Maximize browser
//3.Navigate to omayo website
//4.Find element "Dropdown" button using classname locator and click
//5.Use explicit wait
//6.Find element "Facebook" link using xpath locator 
//7.Click

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_03_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();

		// explicit wait
		// use elementToBeClickable()
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']")));

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	}
}
