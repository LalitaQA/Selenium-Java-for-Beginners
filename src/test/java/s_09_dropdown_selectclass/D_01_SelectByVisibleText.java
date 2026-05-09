package s_09_dropdown_selectclass;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Click on "Books" link in menu
//5.Locate the dropdown
//6.Select "Created on" using "selectByVisibleText"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_01_SelectByVisibleText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement dropdown = driver.findElement(By.id("products-orderby"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("Created on");
	}
}
