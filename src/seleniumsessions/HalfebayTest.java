package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfebayTest {
	
	WebDriver driver;
	
	@BeforeMethod 
	public void setup(){
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fb%2FBooks%2F267%2Fbn_1854946");
		
	}
	
	@Test
	public void HailEbayTest(){
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	

}
