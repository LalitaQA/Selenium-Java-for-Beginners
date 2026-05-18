package s_15_takescreenshot;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to flipkart website
//5.Typecasting for takescreenshot
//6.Take screen shot of particular webElement

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class T_02_ScreenShotWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		WebElement ss = driver.findElement(By.xpath("//h3[text()='My account']"));
		File temp = ss.getScreenshotAs(OutputType.FILE);
		File per = new File("./screenshots/ss2.png");
		FileHandler.copy(temp, per);
	}
}
