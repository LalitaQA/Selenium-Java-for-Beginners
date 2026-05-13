package s_04_assignment;

//1.Launch browser
//2.Navigate to amazon website
//3.Locate serch textfield
//4.Search for iphone
//5.Click on search button
//6.Click on iphone link(switch to child window)
//7.Print price

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_01_Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("iphone");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 16 Plus 128 GB:')])[1]")).click();

		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();

		for (String id : allIds) {

			if (!id.equals(parentId)) {

				driver.switchTo().window(id);
			}
		}
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));

		System.out.println("iPhone Price is : " + price.getText());
	}
}
