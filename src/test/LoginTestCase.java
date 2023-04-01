package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step1: launch chromebrowser and open simplilearn website
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.simplilearn.com/");
		
		//step2: maximise the browser
		driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//step3: click on the login link on top right corner
		//Show title
		System.out.println("The Title of the page is :"+ driver.getTitle());
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println("The link will take you to "+ location);
		loginLink.click();
		
		//show title
		//WebElement title = driver.findElement(By.tagName("title"));
		//System.out.println("The Title of the page is "+ title.getText());
		//Show title		
		System.out.println("The Title of the page is :"+ driver.getTitle());
		
		
		
		//step4: Enter the user name
		WebElement Username = driver.findElement(By.name("user_login"));
		Username.sendKeys("ABC@xyz.com");
		
		//step5: Enter the password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Test*12345678");
		
		//click remember me
		WebElement rem = driver.findElement(By.className("rememberMe"));
		rem.click();
		
		//step6: Click on the link login button\
		WebElement Loginbtn = driver.findElement(By.name("btn_login"));
		Loginbtn.click();
		//Thread.sleep(3000);
		
		//step 7: Validate the login was successful
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(expErrorMsg))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
		System.out.println("The error for login is  : "+ errorMsg);
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("All the links on the page " + AllLinks.size());
		
		
		for(WebElement link : AllLinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		
		
		driver.close();
	
		

	}

}
