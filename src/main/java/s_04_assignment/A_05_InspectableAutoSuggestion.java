package s_04_assignment;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to amazon website
//5.Locate search textfield
//6.Enter value using sendkeys
//7.Get all autosuggestion text list
//8.Print till "dressing table organiser" and click it

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
		for (WebElement alltext : autoSuggestions) {
			String text = "dressing table organiser";
			System.out.println(alltext.getText());
			if (alltext.getText().equals(text)) {
				alltext.click();
				break;
			}
		}
	}
}
