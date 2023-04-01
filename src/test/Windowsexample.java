package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/browser-windows");
		
		//step2: maximise the browser
		//driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		WebElement newTab = driver.findElement(By.id("tabButton"));
		
		String ParentWind = driver.getWindowHandle();
		System.out.println("parent window is " + ParentWind);
		
		newTab.click();
		
		Set<String> AllWind = driver.getWindowHandles();
		String childwin = "";
		
		//for each
		for(String win: AllWind)
		{
			if(!win.equals(ParentWind))
			{
				childwin = win;
				
			}
			
		}
		System.out.println("The child window id is " + childwin);
		
		//move to child window
		driver.switchTo().window(childwin);
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("The child window header is "+ childHeader.getText());
		
		driver.close();
		
		//switch backt o parent window
		driver.switchTo().window(ParentWind);
		
		//click for new child window
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		
		System.out.println("The new child window 2 header is "+ newWindow.getText());
		//driver.close();
		
		//All windows
	    AllWind = driver.getWindowHandles();
		String childwin2 = "";
		
		//for each
		for(String win: AllWind)
		{
			if(!win.equals(ParentWind))
			{
				childwin2 = win;
				
			}
			
		}
		System.out.println("The child window 2 id is " + childwin2);
		
		//move to child window
		driver.switchTo().window(childwin2);
		WebElement childHeader2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("The child window 2 header is "+ childHeader2.getText());
		
		
		
		
		//switch backt o parent window
		driver.switchTo().window(ParentWind);
		
		//click for new child window "new window message
		WebElement newWindow2 = driver.findElement(By.id("messageWindowButton"));
		newWindow2.click();
		
		System.out.println("The new child window 3 header is "+ newWindow2.getText());
		driver.close();
		//close all windows
		driver.quit();
		

	}

}
