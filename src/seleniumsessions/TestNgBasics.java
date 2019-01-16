package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
    
	@Test
	public void googleTitleText(){
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleIs("google"));
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	/*@Test(priority=2)
	public void googleLogoTest(){
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test(priority=3)
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/
	
	
	
	
	
	
	
	
}
