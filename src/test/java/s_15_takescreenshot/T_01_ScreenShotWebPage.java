package s_15_takescreenshot;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to flipkart website
//5.Typecasting for takescreenshot
//6.Take screen shot of webpage

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class T_01_ScreenShotWebPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("./screenshots/ss1.png");
		FileHandler.copy(tem, per);
	}
}
