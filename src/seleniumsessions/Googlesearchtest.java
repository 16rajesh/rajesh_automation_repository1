package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchtest {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		List<WebElement> list = driver.findElements(By.xpath("//li/descendant::div[@class='sbqs_c']"));
		Thread.sleep(2000);
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("testing campus infotech")){
				list.get(i).click();
				break;
			}
			
		}
				
	}

}
