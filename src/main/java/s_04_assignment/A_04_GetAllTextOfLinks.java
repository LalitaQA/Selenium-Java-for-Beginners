package s_04_assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_04_GetAllTextOfLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int linkCount = alllinks.size();
		System.out.println("Total links: " + linkCount);
		for (WebElement alltext : alllinks) {
			String text = "Log in";
			System.out.println(alltext.getText());
			if (alltext.getText().equals(text)) {
				alltext.click();
				break;
			}
		}
	}
}
