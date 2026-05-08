package s_03_assignment;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Click on Books in menu
//5.Click on sort by dropdown
//6.Select Name: Z to A

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_14_SelectDropDownValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.id("products-orderby")).click();
		driver.findElement(By.xpath("//option[text()='Name: Z to A']")).click();
	}

}
