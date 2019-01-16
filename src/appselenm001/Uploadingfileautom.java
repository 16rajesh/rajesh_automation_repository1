package appselenm001;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadingfileautom {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.19.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.olx.in/");
		driver.findElement(By.xpath("//*[@id='postNewAdLink']/span")).click();
		driver.findElement(By.xpath("//*[@id='add-file-1']/div/a/span")).click();
		StringSelection selection = new StringSelection("D:\\claxica.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Thread.sleep(5000);
		System.out.println("uploading");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("uploaded");
		
	}

}
