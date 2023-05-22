package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("DemoSalesManager");
	
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	
	WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	loginButton.click();
	
	WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	crmsfa.click();
	
	WebElement leadTab = driver.findElement(By.linkText("Leads"));
	leadTab.click();
	
	WebElement createLead = driver.findElement(By.linkText("Create Lead"));
	createLead.click();
	
	WebElement companyNamefield = driver.findElement(By.id("createLeadForm_companyName"));
	companyNamefield.sendKeys("TestLeaf");
	
	WebElement firstNamefield = driver.findElement(By.id("createLeadForm_firstName"));
	firstNamefield.sendKeys("Poonguzhali");
	
	WebElement lastnamefield = driver.findElement(By.id("createLeadForm_lastName"));
	lastnamefield.sendKeys("KE");
	
	WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	firstNameLocal.sendKeys("maya");
	
	WebElement departmentField = driver.findElement(By.id("createLeadForm_departmentName"));
	departmentField.sendKeys("Selenium");
	
	WebElement description = driver.findElement(By.id("createLeadForm_description"));
	description.sendKeys("Test Web Application Using Selenium Tool");
	
	WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
	emailId.sendKeys("pooguzhali301@gmail.com");
	
	WebElement createButton = driver.findElement(By.className("smallSubmit"));
	createButton.click();
    
	Thread.sleep(2000);                        
    driver.close();                                                                      
	
	
	
	
	
	
}
	

}
