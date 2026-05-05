package s_03_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_13_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();

		driver.findElement(By.cssSelector("[id='txt1']")).sendKeys("Hello!");
		driver.findElement(By.cssSelector("[id='txt2']")).sendKeys("People!");
	}
}
