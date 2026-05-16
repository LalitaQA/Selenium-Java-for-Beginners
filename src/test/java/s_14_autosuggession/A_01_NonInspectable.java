package s_14_autosuggession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_01_NonInspectable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> autolist = driver
				.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR bRjjIF _1psv1ze5l _1psv1ze9l')]/li"));
		for (WebElement Autosuggesstion : autolist) {
			System.out.println(Autosuggesstion.getText());
		}
	}

}
