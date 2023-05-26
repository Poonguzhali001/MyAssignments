package Week4Day1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class LearnButton {
public static void main(String[] args) {
		
	     ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		// click
		WebElement title = driver.findElement(By.name("j_idt88:j_idt90"));
		title.click();
		driver.get("http://www.leafground.com/button.xhtml");
		
		
		boolean button = driver.findElement(By.name("j_idt88:j_idt98")).isEnabled();
		System.out.println(button);
		
		// Submit button
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point Location = submitButton.getLocation();
		System.out.println(Location);
		
		
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size);
		
		driver.close();

}}