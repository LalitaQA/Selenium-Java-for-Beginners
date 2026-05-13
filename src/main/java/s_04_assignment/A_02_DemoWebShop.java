package s_04_assignment;

//1.Launch browser
//2.Navigate to demo web shop website
//3.Locate gift card and click
//4.Click on 3 add to cart button

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_02_DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[3]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
	}
}
