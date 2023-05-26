package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.leafground.com/input.xhtml");
	
	WebElement typeName = driver.findElement(By.name("j_idt88:name"));
	typeName.sendKeys("Poonguzhali");
	
	WebElement country = driver.findElement(By.id("j_idt88:j_idt91"));
	country.sendKeys(",India");
		
	boolean textbox = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
	System.out.println("Is textbox enable or not:"+textbox);
	
	WebElement cleartext = driver.findElement(By.id("j_idt88:j_idt95"));
	cleartext.clear();
	
	String retrivetext = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
	System.out.println(retrivetext);
	
	WebElement mailid = driver.findElement(By.id("j_idt88:j_idt99"));
	mailid.sendKeys("pooguzhali01@gmail.com"+Keys.TAB);
	
	WebElement aboutme = driver.findElement(By.id("j_idt88:j_idt101"));
	aboutme.sendKeys("Love is God");
	
	WebElement textedit = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
	textedit.sendKeys("purple");
	
    WebElement showerror = driver.findElement(By.id("j_idt106:thisform:age"));
	showerror.sendKeys(Keys.ENTER);
	 
	driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail"));
	//System.out.println(); 
	
	
	
	}
}
