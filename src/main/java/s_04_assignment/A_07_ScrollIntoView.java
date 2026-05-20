package s_04_assignment;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to https://doodles.google/
//5.Scroll the webpage using JavascriptExecutor scrollIntoView()

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_07_ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(5);
		//WebElement popup = driver.findElement(By.xpath("//span[text()='Close']"));
		//popup.click();
		WebElement ele = driver.findElement(By.xpath("(//img[@alt='Furniture Store in Hyderabad'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

}
