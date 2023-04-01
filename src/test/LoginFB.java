package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		//step2: maximise the browser
		driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//step4: Enter the user name
		WebElement Username = driver.findElement(By.name("email"));
		Username.sendKeys("ABC@xyz.com");
				
		//step5: Enter the password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Test*12345678");
		
		//Cick Login
		WebElement Loginbtn = driver.findElement(By.name("login"));
		Loginbtn.click();
		
		//read the locators using tagname "anchor" 'a'
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("All the links on the page " + AllLinks.size());
		
		//get all the link locators using href
		for(WebElement link : AllLinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		
		
		driver.close();

	}

}
