package s_18_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P_06_BrowserNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.easemytrip.com/");
	}

}
