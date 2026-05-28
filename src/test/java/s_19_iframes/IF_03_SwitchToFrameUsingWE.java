package s_19_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IF_03_SwitchToFrameUsingWE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demoqa.com/frames");
		WebElement ref = driver.findElement(By.xpath("//div[@id='frame1Wrapper']/child::iframe"));
		driver.switchTo().frame(ref);
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.id("sampleHeading"));
		String text = frame.getText();
		System.out.println(text);
		Thread.sleep(2000);
	}

}
