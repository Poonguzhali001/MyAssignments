package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
	driver.get("https://leafground.com/select.xhtml");
	
	WebElement select = driver.findElement(By.className("ui-selectonemenu"));
	select.click();
	
	Select select1 = new Select(select);
	select1.deselectByVisibleText("Selenium");
	
	WebElement country = driver.findElement(By.id("j_idt87:country_label"));
	country.click();
	
	WebElement selectcountry = driver.findElement(By.id("j_idt87:country_3"));
	selectcountry.click();
	
	WebElement selectcity = driver.findElement(By.xpath("//label[text()='Select City'])"));
	selectcity.click();	
	
	WebElement Wdriver = driver.findElement(By.id("\"//li[@data-item-value='Selenium WebDriver']"));
	 Wdriver.click();
	
	WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
    language.click();
    
    WebElement randomLanguage = driver.findElement(By.xpath("//li[text()='Tamil']"));
    randomLanguage.click();
  
   WebElement languageSelect = driver.findElement(By.xpath("//li[text()='one']"));
    languageSelect.click();

  driver.close();
 
}
}