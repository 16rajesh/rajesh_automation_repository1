package appselenm001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownautom {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jetairways.com/en/in/home.aspx");
		System.out.println("pop");
		driver.findElement(By.xpath("//*[@id='noOfTravellers']")).click();
		System.out.println("push");
		Select select = new Select(driver.findElement(By.xpath("//*[@id='ddlAdult']")));
		System.out.println("put");
		select.selectByIndex(2);
		driver.close();		
	}

}
