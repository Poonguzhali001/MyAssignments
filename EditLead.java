package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
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
		
		WebElement findlead = driver.findElement(By.linkText("Find Leads"));
		findlead.click();
		
		WebElement firstname = driver.findElement(By.id("ext-gen248"));
		firstname.sendKeys("Poonguzhali");
		
		//Click Find leads button
	    WebElement findleadbutton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
	    findleadbutton.click();
		
	    WebElement firstlead =driver.findElement((By.xpath("(//a[text()='Poonguzhali'])[1]")));
		  firstlead.click();
		  
		String actualTitle = driver.getTitle(); System.out.println(actualTitle);
		 
		  if (actualTitle.contains("View Lead")) {
		  System.out.println("title is verified"); }
		  
		  WebElement edit = driver.findElement(By.linkText("Edit")); edit.click();
		  
		  
		  WebElement companyName =driver.findElement(By.id("updateLeadForm_companyName")); 
		  companyName.clear();
		  
		  companyName.sendKeys("leaftaps12023");
		  
		  //Click Update 
		  WebElement update =driver.findElement(By.name("submitButton")); 
		  update.click();
		  
		  
		  WebElement changedCompName =driver.findElement(By.id("viewLead_companyName_sp")); 
		  String text =changedCompName.getText();
		   System.out.println(text);
		  
		  if(text.contains("leaftaps")) { System.out.println("company name changed");
		  
		  } driver.quit();
		
        
	}

}
