package s_08_syncronization;

//1.Launch browser
//2.Maximize browser
//3.Use Thread.sleep
//4.Navigate to demo web shop website

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_01_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
	}
}
