package s_06_webelement_getter_methods;

//1.Launch browser
//2.Maximize browser
//3.Navigate to demo web shop website
//4.Find element using locators
//5.And perform different "CssValue" functions

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_03_GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// Use getCssValue("color");
		WebElement rating = driver.findElement(By.className("rating"));
		String ratingColor = rating.getCssValue("color");
		System.out.println("Star rating Color: " + ratingColor);

		// Use getCssValue("background-color")
		WebElement topmenu = driver.findElement(By.className("top-menu"));
		String TopMenu = topmenu.getCssValue("background-color");
		System.out.println("TopMenu background color :" + TopMenu);

		// Use getCssValue("border-color")
		WebElement recenlyViewProduct = driver.findElement(By.className("listbox"));
		String recentlyView = recenlyViewProduct.getCssValue("border-color");
		System.out.println("Recently View product list border-color: " + recentlyView);

		// Use getCssValue("font-size")
		WebElement wishlist = driver.findElement(By.className("cart-label"));
		String wishlistFontSize = wishlist.getCssValue("font-size");
		System.out.println("Wishlist font size: " + wishlistFontSize);

		// Use getCssValue("font-family")
		WebElement register = driver.findElement(By.className("ico-register"));
		String registerFontFamily = register.getCssValue("font-size");
		System.out.println("Register font family: " + registerFontFamily);

		// Use getCssValue("font-weight")
		WebElement computer = driver.findElement(By.xpath("(//a[contains(@href,'computers')])[1]"));
		String computerMenu = computer.getCssValue("font-weight");
		System.out.println("Computers in menu font weight: " + computerMenu);

		// Use getCssValue("text-align")
		WebElement newsletter = driver.findElement(By.xpath("(//div[@class='title'])[4]"));
		String newsletterText = newsletter.getCssValue("font-weight");
		System.out.println("Newsletter text align: " + newsletterText);

		// Use getCssValue("text-decoration")
		WebElement simpleComputer = driver.findElement(By.xpath("//a[text()='Simple Computer']"));
		String simpleComputerproductName = simpleComputer.getCssValue("font-weight");
		System.out.println("Simple Computer productName text decoration: " + simpleComputerproductName);

		// Use getCssValue("margin")
		// Use getCssValue("padding")
		// Use getCssValue("border")
		// Use getCssValue("width")
		// Use getCssValue("height")
		// Use getCssValue("display")
		// Use getCssValue("visibility")
		// Use getCssValue("opacity")
		// Use getCssValue("position")
		// Use getCssValue("top")
		// Use getCssValue("left")
		// Use getCssValue("z-index")

	}
}
