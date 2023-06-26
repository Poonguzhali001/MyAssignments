package LearnAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewDashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		// 1. Login to https://login.salesforce.com 
			     
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	 //2.Click on the toggle menu button from the left corner 
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	//3. Click View All and click Dashboards from App Launcher
	String parentwindow = driver.getWindowHandle();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
    System.out.println(parentwindow);
	Set<String> child = driver.getWindowHandles();
	System.out.println(child.size());
	List<String> window = new ArrayList<String>(child);
   driver.switchTo().window(window.get(0))	;
   WebElement element = driver.findElement(By.xpath("//input[@class='slds-input']"));
	element.sendKeys("Dashboards");
	driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
	//4. Click on the New Dashboard option 
	driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	 // 5.Enter Name as 'Salesforce Automation by Your Name ' and Click on               Create.
	    //6.Click on Save and Verify Dashboard name."
	WebElement Element = driver.findElement(By.xpath("/label[@for='dashboardNameInput']"));
	Element.sendKeys("Salesforce Automation by Poonguzhali");
	
	}
}
