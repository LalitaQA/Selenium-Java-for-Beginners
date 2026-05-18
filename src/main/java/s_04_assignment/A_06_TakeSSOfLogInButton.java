package s_04_assignment;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to saucedemo website
//5.Typecasting for takescreenshot
//6.Take screen shot of Login button 

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_06_TakeSSOfLogInButton {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");
		WebElement ss = driver.findElement(By.id("login-button"));
		File temp = ss.getScreenshotAs(OutputType.FILE);
		File per = new File("./screenshots/ss3.png");
		FileHandler.copy(temp, per);
	}
}
