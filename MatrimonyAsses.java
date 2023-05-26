package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyAsses {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		WebElement firstname = driver.findElement(By.id("REGISTERED_BY"));
		Select firstname1= new Select(firstname);
		firstname1.selectByValue("8");
		WebElement name = driver.findElement(By.name("NAME"));
		name.sendKeys("Dev");
		WebElement gen = driver.findElement(By.xpath("//label[@for='genderfemale']"));
       gen.click();
       WebElement date = driver.findElement(By.id("DOBDAY"));
       Select birthDate=new Select(date) ;
	    birthDate.selectByValue("5");
	    
	    WebElement mon = driver.findElement(By.id("DOBMONTH"));
	    Select bornMonth=new Select(mon) ;
	    bornMonth.selectByValue("11");
	    
	    WebElement yr = driver.findElement(By.id("DOBYEAR"));
	    Select birthYear=new Select(yr) ;
	    birthYear.selectByValue("1999");
	    
	    WebElement religion = driver.findElement(By.id("RELIGION"));
		 religion.click();   
		 Select clickReligion=new Select(religion) ;
		 clickReligion.selectByValue("");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    		
	
	}

}
