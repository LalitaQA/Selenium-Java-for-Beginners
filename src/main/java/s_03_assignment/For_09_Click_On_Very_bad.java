package s_03_assignment;

//1.Open the browser 
//2.Navigate to the demo web shop 
//3.Click on the “Very bad” radio button (only using the xpath by axes)
//4.Close the browser 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_09_Click_On_Very_bad {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//label[text()='Very bad']/preceding-sibling::input")).click();
		// driver.close();
	}

}
