package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitdriver {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
        WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
		driver.get("https://www.freecrm.com/");
	    
		System.out.println("Before login the title is =="+driver.getTitle());
	    
		driver.findElement(By.name("username")).sendKeys("naveenk");
	    driver.findElement(By.name("password")).sendKeys("test@123");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    System.err.println("After login the title is =="+driver.getTitle());
		
		
		
		
	}

}
