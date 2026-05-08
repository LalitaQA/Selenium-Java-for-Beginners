package s_02_webdrivermethods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop
//4.Or Navigate to demo web shop using URL("")
//5.Use navigate back
//6.Use navigate forward
//7.Use navigate refresh

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_12_NavigateTo {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		// navigate to url using to(URL url)
		// URL url= new URL("https://demowebshop.tricentis.com");//deprecated
		// driver.navigate().to(url);

		// driver.navigate().back();
		// driver.navigate().forward();

		driver.navigate().refresh();
	}
}
