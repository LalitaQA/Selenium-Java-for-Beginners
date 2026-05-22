package s_18_popups;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_05_WindowPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();

		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allwindows = driver.getWindowHandles();

		for (String windows : allwindows) {
			if (!windows.equals(allwindows)) {
				driver.switchTo().window(windows);
				driver.close();
			}
		}
	}

}
