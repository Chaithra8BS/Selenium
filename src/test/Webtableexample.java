package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//step2: maximise the browser
		driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//find number of rows sing css
		List<WebElement> Rows = driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		System.out.println("Total number of rows "+ Rows.size());
		
		//find number of columns using xpath
		List<WebElement> Col = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total number of rows "+ Col.size());
		
		//find the element text
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("The test here is : "+data.getText());
		
		//Display all table elements
		for(int i=2;i<Rows.size();i++)
		{
			List<WebElement> Columndata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));
			System.out.println(Columndata.get(0).getText()+" "+ Columndata.get(1).getText()+" "+Columndata.get(2).getText());
		}

	}

}
