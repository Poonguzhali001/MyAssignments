package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new ChromeDriver();
   driver.get( "https://acme-test.uipath.com/login");
   driver.manage().window().maximize();
	
   WebElement Email = driver.findElement(By.name("email"));
   Email.sendKeys("kumar.testleaf@gmail.com");
	
	//Enter Password as "leaf@12"
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys("leaf@12");
	
	//Click login button
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	loginbutton.click();
	
	//get page title
	String pageTitle = driver.getTitle();	
	System.out.println("HomePage title: "+pageTitle);

	//logout
	WebElement logout = driver.findElement(By.xpath("//a[text()='Log Out']"));
	logout.click();
	
	driver.close();
	
	
	
	}	

}
