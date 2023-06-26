package LearnAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createindividuals {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		 //Login to https://login.salesforce.com 
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
    driver.findElement(By.id("Login")).click();
	 // 2.Click on the toggle menu button from the left corner
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	String parentwindow = driver.getWindowHandle();
	// 3. Click View All and click Individuals from App Launcher
	driver.findElement(By.xpath("//button[text()='View All']")).click();
    System.out.println(parentwindow);
	Set<String> child = driver.getWindowHandles();
	System.out.println(child.size());
	List<String> window = new ArrayList<String>(child);
    driver.switchTo().window(window.get(0))	;  
    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("individuals");
    driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
   //4. Click on New Individual 
    driver.findElement(By.className("forceActionLink")).click();
   // 5. Enter the Last Name as 'Kumar'
   
    driver.findElement(By.xpath("//input[@maxlength='80']")).sendKeys("Kumar");
     //6.Click save and verify Individuals Name"
     driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
    String title = driver.getTitle();
    System.out.println(title);
	}   
   
}
