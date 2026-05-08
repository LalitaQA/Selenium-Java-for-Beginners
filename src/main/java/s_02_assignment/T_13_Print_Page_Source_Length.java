package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.print page source length.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_13_Print_Page_Source_Length {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		String pagesourcelength = driver.getPageSource();
		System.out.println(pagesourcelength.length());
	}
}
