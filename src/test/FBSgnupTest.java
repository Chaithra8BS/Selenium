package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSgnupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		
		//step2: maximise the browser
		driver.manage().window().maximize();
		// wait for 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		//click on create new account
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
		Thread.sleep(3000);
		WebElement first = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		first.sendKeys("Chaithra");
		WebElement surname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		surname.sendKeys("test");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("test@gmail.com");
		WebElement confirmemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmemail.sendKeys("test@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("pass123");
		
		
		
		//check what is the default value selected in drop down
		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("the default day selected is : "+ selectedDay);
		
		
		//select drop downs
		WebElement day =driver.findElement(By.xpath("//select[@title='Day']"));
		Select dDay = new Select(day);
		dDay.selectByVisibleText("15");
		//dDay.selectByvalue("15");
		
		//check what is the default value selected in drop down
		WebElement selectedMM = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		System.out.println("the default day selected is : "+ selectedMM);
		
		//printall the values of month
		List<WebElement> allMM = driver.findElements(By.xpath("//select[@title='Month']/option"));
		System.out.println("the default day selected is : "+ allMM.size());
		
		for(WebElement mm:allMM )
		{
			System.out.println(mm.getText());
		}
		

		
		WebElement month =driver.findElement(By.xpath("//select[@title='Month']"));
		Select mMonth = new Select(month);
		mMonth.selectByVisibleText("Feb");
		//mMonth.selectByvalue("2");
		
		//check what is the default value selected in drop down
		WebElement selectedYY = driver.findElement(By.xpath("//select[@title='Year']/option[@selected='1']"));
		System.out.println("the default day selected is : "+ selectedYY);
		
		WebElement year =driver.findElement(By.xpath("//select[@title='Year']"));
		Select YY= new Select(year);
		YY.selectByVisibleText("2023");
		//mMonth.selectByvalue("2023");
		
		
		
		//radio buttons
		//WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		female.click();

		String Gender = "Male";
		String dummyxpath = "//label[text()='placeholder']";
		String newxpath = dummyxpath.replace("placeholder", Gender);
		System.out.println("New Xpath is : "+ newxpath);
		
	//one more way to assign value to xpath
	//	String newxpath = "//label[text()='"+ Gender +"']";
		
		WebElement genderElem = driver.findElement(By.xpath(newxpath));
		genderElem.click();
		
		
		
		//driver.close();
		
		

	}

}
