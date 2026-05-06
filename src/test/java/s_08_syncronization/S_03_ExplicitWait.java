package s_08_syncronization;

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
