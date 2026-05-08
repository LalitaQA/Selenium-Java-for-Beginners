package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.Navigate to Register page, 
//4.enter password, 
//5.then get the text value using getAttribute("value").

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_18_Enter_Password {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Register")).click();
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("joefrill");
		String printpassword = password.getAttribute("value");
		System.out.println(printpassword);
	}
}
