package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.Navigate to Login page,
//4.enter email, 
//5.then use getAttribute() to print the entered email.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_14_Enter_Email {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Log in")).click();
		WebElement enteredEmail = driver.findElement(By.id("Email"));
		enteredEmail.sendKeys("joe@gmail.com");
		String printEmail = enteredEmail.getAttribute("value");
		System.out.println(printEmail);
	}
}
