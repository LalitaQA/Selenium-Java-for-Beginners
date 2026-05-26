package s_18_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_08_FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\ishu\\Downloads\\Lalita_Kashyap_Resume.pdf");

	}

}
