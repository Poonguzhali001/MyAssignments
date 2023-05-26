package Week4Day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class learnradiobutton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		WebElement browser = driver.findElement(By.xpath("//label[text()='Chrome']"));
		browser.click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	

		String unselected =driver.findElement(By.xpath("//label[text()='Bengaluru']")).getAttribute("value");
		
		String unselected1=driver.findElement(By.xpath("//label[text()='Chennai']")).getAttribute("value");
		
		System.out.println("unselected="+unselected + " , " +unselected1);
		
		
		WebElement clicked=driver.findElement(By.xpath("//index[@class=ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active]"));
		System.out.println(clicked.getText());
		
		boolean enabled=clicked.isEnabled();
		System.out.println(enabled);
		
		Thread.sleep(3000);
		driver.close();s
	}
}