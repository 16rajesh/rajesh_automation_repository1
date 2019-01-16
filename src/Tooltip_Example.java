import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip_Example {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement ele= driver.findElement(By.id("age"));
		//String Tooltip = ele.getAttribute("title");
		
		//System.out.println(Tooltip);
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		String Tooltip = ele.getAttribute("title");
		System.out.println(Tooltip);
			
	}

}