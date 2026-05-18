package s_04_assignment;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to demowebshop website
//5.Get all links and count
//6.Print link text
//7.If "Log in" text is their then click and break 

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
