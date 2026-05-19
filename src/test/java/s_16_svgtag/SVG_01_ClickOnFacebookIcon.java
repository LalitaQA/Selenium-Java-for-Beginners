package s_16_svgtag;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_01_ClickOnFacebookIcon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//*[name()='svg' and @height='1em']")).click();
	}
}
