package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAsses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement Create = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
	Create.click();
	WebElement firstname = driver.findElement(By.name("firstname"));
	firstname.sendKeys("Poonguzhali");
	
	WebElement surnmae = driver.findElement(By.name("lastname"));
	surnmae.sendKeys("KE");
	
	WebElement mobile = driver.findElement(By.name("reg_email__"));
	mobile.sendKeys("9677517231");
	

	WebElement password = driver.findElement(By.id("password_step_input"));
	password.sendKeys("Poongu@123");
	
	
	
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select day1=new Select(day);
	day1.selectByVisibleText("5");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select month1=new Select(month);
	month1.selectByVisibleText("Nov");
	
	WebElement year = driver.findElement(By.id("year"));
	Select year1=new Select(year);
	year1.selectByVisibleText("1999");
	
	
    WebElement gender= driver.findElement(By.xpath(("//label[text()='Female']")));
	gender.click();
	
	}

}
	
	
	
	
	
	


