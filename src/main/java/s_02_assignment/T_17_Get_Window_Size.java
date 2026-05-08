package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.get window size, 
//4.then set a new window size.

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_17_Get_Window_Size {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");

		Dimension currentwindowSize = driver.manage().window().getSize();
		System.out.println(currentwindowSize);

		Dimension newSize = new Dimension(500, 500);
		driver.manage().window().setSize(newSize);
	}
}
