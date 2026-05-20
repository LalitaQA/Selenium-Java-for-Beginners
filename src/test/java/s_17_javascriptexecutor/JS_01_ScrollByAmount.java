package s_17_javascriptexecutor;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to amazon
//5.Scroll the webpage using JavascriptExecutor scrollBy()

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_01_ScrollByAmount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
	}
}
