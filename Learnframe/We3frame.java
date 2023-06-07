package Learnframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class We3frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");	
driver.manage().window().maximize();	
driver.switchTo().frame("iframeResult");	
driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert alert = driver.switchTo().alert();	
	alert.dismiss();
	
	}

}
