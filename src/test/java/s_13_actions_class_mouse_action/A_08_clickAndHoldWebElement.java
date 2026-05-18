package s_13_actions_class_mouse_action;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wait
//4.Navigate to yonobusiness website
//5.Close popup
//6.Locate password element
//7.Enter value in password textfield
//8.Locate eyeicon in pwdTextField
//9.Perform clickAndHold on eye icon in pwdTextField

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_08_clickAndHoldWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		WebElement popup = driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c2785778308')]"));
		popup.click();
		WebElement pwdTextField = driver.findElement(By.id("password"));
		pwdTextField.sendKeys("nicky");
		WebElement eyeicon = driver.findElement(By.className("ng-star-inserted"));
		Actions act = new Actions(driver);
		act.clickAndHold(eyeicon).perform();
	}
}
