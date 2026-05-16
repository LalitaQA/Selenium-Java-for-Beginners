package s_04_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_05_InspectableAutoSuggestion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@role='row']"));
		for (WebElement suggestion : autoSuggestions) {
			String text = suggestion.getText();
			System.out.println(text);
			if (text.toLowerCase().contains("dressing table organiser")) {
				System.out.println("Matching suggestion found: " + text);
				suggestion.click();
				break;
			}
		}
	}
}
