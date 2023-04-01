package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//webdriver -> interface used for all browser drivers
		//if we use chromedriver it will be used only for chrome driver.not for FF browser.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
			

	}

}
