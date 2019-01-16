import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		   
	   ((JavascriptExecutor) driver).executeScript("window.open()");
	   ArrayList<String> s= new ArrayList<String>(driver.getWindowHandles());
	   /*Set<String> s= driver.getWindowHandles(); 
	   Iterator<String> itr = s.iterator();
	   itr.next();
	   String p = itr.next();*/
	   driver.switchTo().window(s.get(1));
	   driver.get("https://www.facebook.com/");
	   driver.switchTo().window(s.get(0));
	   driver.navigate().to("https://www.facebook.com/");
	   
	   
	}
	
	

}
