package s_04_assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_08_Task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demowebshop.tricentis.com");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String win : allwindows) {

			driver.switchTo().window(win);
			
			if (driver.getTitle().contains("Facebook")) {

				System.out.println("Control moved to Facebook window");
				
				driver.findElement(By.xpath("//input[@id='_r_4_']")).sendKeys("abc");
				driver.findElement(By.xpath("//input[@id='_r_8_']")).sendKeys("1234");
				break;

			}
		}
		
	}

}
