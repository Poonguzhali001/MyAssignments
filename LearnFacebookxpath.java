package Week4Day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnFacebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Download and set the path 
	ChromeDriver driver = new ChromeDriver();
	
	//Launch the ChromeDriver
	driver.get("https://en-gb.facebook.com/");
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Click on Create New Account button
	WebElement createNewButton = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
	createNewButton.click();
	
	//Enter the first name
	WebElement firstName = driver.findElement(By.name("firstname"));
    firstName.sendKeys("Poonguzhali");
	
    //Enter the last name
	WebElement surname = driver.findElement(By.name("lastname"));
	surname.sendKeys("KE");
	
	//Enter the mobile number
	WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
	mobilenumber.sendKeys("9677517231");
	
	//Enter the password
	WebElement password = driver.findElement(By.id("password_step_input"));
	password.sendKeys("Poongu@123");
	
	// Handle all the three drop downs
	
	WebElement day = driver.findElement(By.id("day"));
	Select day1=new Select(day);
	day1.selectByVisibleText("5");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select month1=new Select(month);
	month1.selectByVisibleText("Nov");
	
	WebElement year = driver.findElement(By.id("year"));
	Select year1=new Select(year);
	year1.selectByVisibleText("1999");
	
	//Select the radio button "Female" 
    WebElement gender= driver.findElement(By.xpath(("//label[text()='Female']")));
	gender.click();
	
	
	
	
	
	
	
	
}

}

	