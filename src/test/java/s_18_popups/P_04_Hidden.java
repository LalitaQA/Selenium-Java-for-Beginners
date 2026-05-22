package s_18_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_04_Hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();

		driver.findElement(By.id("fiv_6_30/05/2026")).click();
		
	}

}
