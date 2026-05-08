package s_03_assignment;

//1.Open the browser 
//2.Navigate to demo webshop
//3.Click on the facebook link 
//4.Close the browser (without using text function and only using the xpath by axes)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_11_Click_On_Facebook_Link {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//li[contains(@class,'facebook')]/child::a")).click();
		// driver.close();
	}
}
