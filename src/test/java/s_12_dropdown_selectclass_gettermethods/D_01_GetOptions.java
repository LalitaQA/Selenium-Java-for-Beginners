package s_12_dropdown_selectclass_gettermethods;

import java.util.List;

//1.Open the browser
//2.Maximize the browser
//3.navigate to https://selenium08.blogspot.com/2019/11/dropdown.html
//4.Locate the month dropdown
//5.Get all option using getOptions()
//6.Print all options using for each loop

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_01_GetOptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement monthDropDown = driver.findElement(By.cssSelector("[name='Month']"));
		Select select = new Select(monthDropDown);
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());
		for (WebElement web : allOptions) {
			System.out.println(web.getText());
		}
	}
}
