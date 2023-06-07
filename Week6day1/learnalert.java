package Week6day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
       Alert alert = driver.switchTo().alert();
       Thread.sleep(2000);
       alert.accept();
      
  driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
       driver.switchTo().alert();
       Thread.sleep(2000);
       alert.dismiss();
    
    driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
    Alert alert2 = driver.switchTo().alert();
   alert2.sendKeys("sun");
   alert2.accept();
	
	}

}
