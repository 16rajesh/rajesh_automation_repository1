package seleniumsessions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreaklinkTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("rajeshkr");
		driver.findElement(By.name("password")).sendKeys("Qwerty@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		List<WebElement> Linkslist = driver.findElements(By.tagName("a"));
		Linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of all links are ---->" + Linkslist.size());
		
		
		List<WebElement> activeList = new ArrayList<WebElement>();
		
		
		for(int i=0; i< Linkslist.size(); i++){
			
			if(Linkslist.get(i).getAttribute("href") !=null &&(! Linkslist.get(i).getAttribute("href").contains("javascript"))){
				activeList.add(Linkslist.get(i));
			}
		}
		
		System.out.println("Size of Active Links are--->" + activeList.size());
		
		
		for(int j=0; j<activeList.size(); j++){
			
		HttpURLConnection connection = (HttpURLConnection)new URL(activeList.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activeList.get(j).getAttribute("href") + "---->" +response);
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
