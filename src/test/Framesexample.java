package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/frames");
		
		//step2: maximise the browser
		//driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//switch for iframe 1
		driver.switchTo().frame("frame1");
		WebElement Header = driver.findElement(By.id("sampleHeading"));
		System.out.println("parent window is " + Header.getText());
		
		//switch back to main screen out of iframe
		driver.switchTo().defaultContent();
		

	}

}
