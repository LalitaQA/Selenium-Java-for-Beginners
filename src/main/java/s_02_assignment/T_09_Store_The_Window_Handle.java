package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.store the window handle, 
//4.then print it in the console.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_09_Store_The_Window_Handle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
	}
}
