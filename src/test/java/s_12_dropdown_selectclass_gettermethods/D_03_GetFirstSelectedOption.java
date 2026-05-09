package s_12_dropdown_selectclass_gettermethods;

//1.Open the browser
//2.Maximize the browser
//3.navigate to https://selenium08.blogspot.com/2019/11/dropdown.html
//4.Select even index months By selectByIndex();
//5.Get first selected option using GetFirstSelectedOptions()

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_03_GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement monthDropDown = driver.findElement(By.cssSelector("[name='Month']"));
		Select select = new Select(monthDropDown);
		for (int i = 1; i < 13; i++) {
			if (i % 2 != 0) {
				select.selectByIndex(i);
				Thread.sleep(300);
			}
		}
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
	}
}
