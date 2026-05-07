package s_03_assignment;

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
