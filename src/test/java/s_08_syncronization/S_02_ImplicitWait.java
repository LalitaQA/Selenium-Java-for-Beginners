package s_08_syncronization;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to hyrtutorials website
//5.Find element "Add Textbox1" using id locator and click
//6.Find element "Textbox1" using cssselector 
//7.Enter value using sendkeys

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_02_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();

		driver.findElement(By.cssSelector("[id='txt1']")).sendKeys("Hello!");
	}
}
