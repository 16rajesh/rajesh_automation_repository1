package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("rajeshk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
