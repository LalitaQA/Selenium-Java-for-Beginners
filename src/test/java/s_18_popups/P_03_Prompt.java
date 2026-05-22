package s_18_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_03_Prompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("Lalita");
		Thread.sleep(3000);
		a.accept();
		// driver.quit();
	}

}
