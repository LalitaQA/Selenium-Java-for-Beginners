package s_03_assignment;

//1.Launch browser
//2.Maximize browser
//3.Navigate demo web shop
//4.Check tricentisLink is diplay or not
//5.Check tricentisLink is selected or not
//6.Check tricentisLink is enable or not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_12_WebElementVerification_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement tricentisLink = driver.findElement(By.xpath("//a[text()='Tricentis']"));
		System.out.println(tricentisLink.isDisplayed());

		System.out.println(tricentisLink.isSelected());

		System.out.println(tricentisLink.isEnabled());
	}
}
