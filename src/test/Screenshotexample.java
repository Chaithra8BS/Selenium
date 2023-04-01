package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com");
		
		//step2: maximise the browser
		//driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		TakesScreenshot tsObj = (TakesScreenshot) driver;
		File fileobj = tsObj.getScreenshotAs(OutputType.FILE);
		
		File screenshotobj = new File("image.png");
		
		FileUtils.copyFile(fileobj, screenshotobj);
		driver.close();
		
		

	}

}
