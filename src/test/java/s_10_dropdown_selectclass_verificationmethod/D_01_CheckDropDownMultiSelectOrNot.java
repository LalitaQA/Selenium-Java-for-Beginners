package s_10_dropdown_selectclass_verificationmethod;

//1.Launch browser
//2.Maximize browser
//3.Navigate to selenium08.blogspot website
//4.Locate the dropdown and store in variable
//5.Check dropdown is multi select or not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_01_CheckDropDownMultiSelectOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		Select monthDropDown = new Select(driver.findElement(By.cssSelector("[name='Month']")));
		System.out.println(monthDropDown.isMultiple());
	}
}
