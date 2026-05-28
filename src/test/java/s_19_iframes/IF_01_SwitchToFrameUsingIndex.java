package s_19_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IF_01_SwitchToFrameUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.id("sampleHeading"));
		String text = frame.getText();
		System.out.println(text);
		Thread.sleep(2000);

	}
}
