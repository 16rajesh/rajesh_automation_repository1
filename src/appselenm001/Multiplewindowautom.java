package appselenm001;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindowautom {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		Set windowid = driver.getWindowHandles();
		Object[] data = windowid.toArray();
		driver.switchTo().window((String)data[1]);
		driver.close();
	}

}
