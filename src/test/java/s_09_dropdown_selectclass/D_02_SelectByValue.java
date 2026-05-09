package s_09_dropdown_selectclass;

//1.Launch browser
//2.Maximize browser
//3.Use implicit wqait
//4.Navigate to selenium08.blogspot website
//5.Locate the country dropdown
//6.Select "India" using "selectByValue"

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_02_SelectByValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement country = driver.findElement(By.cssSelector("[name='country']"));

		Select select = new Select(country);
		select.selectByValue("IN");
	}
}
