package Week6day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://leafground.com/frame.xhtml");
driver.manage().window().maximize();
driver.switchTo().frame(0)	; 
WebElement find = driver.findElement(By.id("Click"));
find.click();	
String text = find.getText();	
System.out.println(text);	
driver.switchTo().defaultContent();
	}

}
