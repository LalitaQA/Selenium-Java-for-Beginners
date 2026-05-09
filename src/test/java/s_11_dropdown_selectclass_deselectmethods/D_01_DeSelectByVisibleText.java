package s_11_dropdown_selectclass_deselectmethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to selenium08.blogspot
//4.Locate the month dropdown
//5.Select the May month 
//6.Then deselect the May Month

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_01_DeSelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		Select monthDropDown = new Select(driver.findElement(By.cssSelector("[name='Month']")));
		monthDropDown.selectByVisibleText("May");
		Thread.sleep(3000);
		monthDropDown.deselectByVisibleText("May");
	}
}
