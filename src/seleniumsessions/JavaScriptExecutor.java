package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("naveenk");
	    driver.findElement(By.name("pass")).sendKeys("test@123");
	    
	    WebElement element = driver.findElement(By.id("u_0_2"));
	    flash(element, driver);
	}
    public static void flash(WebElement element, WebDriver driver){
    	//JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String bgcolor = element.getCssValue("backgroungColor");
    	for(int i=0; i< 10; i++){
    		changeColor("rgb(0,200,0)", element, driver);
    		changeColor(bgcolor, element, driver);
    	}
    }
 
    
	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
    	js1.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
    	
    	try{
    		Thread.sleep(2000);
    	}catch(Exception e){
    		
    	}		
	}
    
	
	
}
