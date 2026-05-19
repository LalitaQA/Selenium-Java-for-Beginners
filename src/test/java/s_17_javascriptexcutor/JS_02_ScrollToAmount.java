package s_17_javascriptexcutor;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to doodles.google
//5.Scroll the webpage using JavascriptExecutor scrollTo()

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_02_ScrollToAmount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://doodles.google/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,500)");
	}
}
