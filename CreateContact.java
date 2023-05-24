package Week4Day1;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class CreateContact {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
//enter username
				
				WebElement username= driver.findElement(By.id("username"));
				username.sendKeys("DemoSalesManager");
//password
		        WebElement password = driver.findElement(By.id("password"));
		        password.sendKeys("crmsfa");
//click login buttom
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();
//click crmsfa
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();
//click contact button
				WebElement contactButton = driver.findElement(By.linkText("Contacts"));
				contactButton.click();
//CContact button
				WebElement createContactButton = driver.findElement(By.linkText("Create Contact"));
				createContactButton.click();
//enter FN
				WebElement firstName = driver.findElement(By.id("firstNameField")); 
				firstName.sendKeys("Poonnguzhali");
//enter Ln
				WebElement lastName = driver.findElement(By.id("lastNameField")); 
				lastName.sendKeys("KE");
//enter first local name
				
				WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
				firstNameLocal.sendKeys("Maya");

				WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
				lastNameLocal.sendKeys("asin");

				WebElement departmentName = driver.findElement(By.id("createContactForm_departmentName"));
				departmentName.sendKeys("Automation");

				WebElement description = driver.findElement(By.id("createContactForm_description"));
				description.sendKeys("Help of selenium tool we execute");
				
				WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
				email.sendKeys("pooguzhali301@gmail.com");

				WebElement stateOrProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
			    Select state=new Select(stateOrProvince) ;
		        state.selectByVisibleText("New York");

		        WebElement submit = driver.findElement(By.name("submitButton"));
				submit.click();

				WebElement edit = driver.findElement(By.className("subMenuButton"));
				edit.click();

				WebElement clearDescription = driver.findElement(By.id("updateContactForm_description"));
				clearDescription.clear();

				WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
				importantNote.sendKeys("TL selenium");

				WebElement update = driver.findElement(By.xpath("//input[@value='Update']"));
				update.click();

				System.out.println(driver.getTitle());
	
	
	}

}
