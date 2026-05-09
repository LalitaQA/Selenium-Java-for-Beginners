package s_11_dropdown_selectclass_deselectmethods;

//1.Open the browser
//2.Maximize the browser
//3.navigate to https://selenium08.blogspot.com/2019/11/dropdown.html
//4.Select All the months By selectByIndex();
//5.Deselect All the months By deSelectAll()

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_04DeSelectAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement monthDropDown = driver.findElement(By.cssSelector("[name='Month']"));
		Select select = new Select(monthDropDown);
		for (int i = 1; i < 13; i++) {
			select.selectByIndex(i);
			Thread.sleep(300);
		}
		select.deselectAll();
	}
}
