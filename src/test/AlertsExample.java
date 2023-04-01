package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/alerts");
		
		//step2: maximise the browser
		//driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//Alert pop up and accept it
		WebElement btn = driver.findElement(By.id("alertButton"));
		btn.click();
		
		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();
		
		//Click on confirm pop up and cancel it.
		WebElement confm = driver.findElement(By.id("confirmButton"));
		confm.click();
		
		obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.dismiss();
		
		
		
		
		

	}

}
