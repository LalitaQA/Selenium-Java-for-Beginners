package s_08_syncronization;

//1.Launch browser
//2.Maximize browser
//3.Navigate to hyrtutorials website
//4.Use implicit wait
//4.Find element "Add Textbox1" button using id locator and click
//5.Use Fluent wait
//6.Find element "Textbox1" field using lamda function
//7.Enter value using sendkeys

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class S_04_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click on add textbox1
		driver.findElement(By.id("btn1")).click();

		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3));// check every 2 sec

		WebElement element = wait.until(d -> d.findElement(By.id("txt1")));
		element.sendKeys("Hello fluent wait");
	}
}
