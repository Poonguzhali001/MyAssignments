package Week4Day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement selectTool = driver.findElement(By.className("ui-selectonemenu"));
		
		Select select1=new Select(selectTool);
		select1.selectByVisibleText("Selenium");
		
		
		//Click dropdown
		WebElement countryTextBox = driver.findElement(By.id("j_idt87:country_label"));
	    countryTextBox .click();
	  
	    //select country
	    WebElement preferredCountry = driver.findElement(By.id("j_idt87:country_4"));
	    preferredCountry.click();

	    //  clic dropdown cities
	    WebElement selectCities = driver.findElement(By.xpath("//label[text()='Select City']"));
	    selectCities.click();
	    
	   //select city
	    WebElement preferredCity = driver.findElement(By.xpath("//li[text()='New York']"));
	    preferredCity.click();

	   
	    WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
	    course.sendKeys("Selenium WebDriver");
	    //select the course
	    WebElement selectedCourse = driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']"));
	    selectedCourse.click();
	   

	   
	    WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
	    language.click();
	    //selct the language
	    WebElement randomlyLanguage = driver.findElement(By.xpath("//li[text()='Tamil']"));
	    randomlyLanguage.click();
	  
	    // irrespective  language
	    WebElement irrespectiveLanguage = driver.findElement(By.id("j_idt87:value_label"));
	    irrespectiveLanguage.click();
	    
	    WebElement languageSelected = driver.findElement(By.xpath("//li[text()='one']"));
	    languageSelected.click();

	    
	    
	     driver.close();
	 
}
}

