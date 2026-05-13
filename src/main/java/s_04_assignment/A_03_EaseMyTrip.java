package s_04_assignment;

//1.Launch browser
//2.Navigate to ease my trip website
//3.Locate departure date and click
//4.Select 13 sep 2026

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_03_EaseMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("ddate")).click();

		while (true) {
			WebElement monthYear = driver.findElement(By.xpath("(//div[@class='month2'])[1]"));
			String text = monthYear.getText();
			System.out.println(text);

			if (text.contains("SEP 2026")) {
				break;
			}

			// click next arrow
			driver.findElement(By.id("img2Nex")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath("//li[@id='trd_0_13/09/2026']")).click();
	}
}
