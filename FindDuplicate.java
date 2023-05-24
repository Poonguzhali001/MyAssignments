package Week4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindDuplicate {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("http://leaftaps.com/opentaps/");
			//enter UN
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("DemoSalesManager");
			//enter password
			WebElement password= driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
		//click log in	
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			
			WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
			crmsfa.click();
			//
			WebElement leadTab = driver.findElement(By.linkText("Leads"));
            leadTab.click();
            
       //Click Find leads
            WebElement findlead = driver.findElement(By.linkText("Find Leads"));
            findlead.click();
            
     //Click on Email
            WebElement email = driver.findElement(By.linkText("Email"));
            email.click();
            
      //enter email id
            WebElement emailid= driver.findElement(By.name("emailAddress"));
            emailid.sendKeys("pooguzhali301@gmail.com");
            
        //	Click find leads button
            WebElement findLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
            findLeadButton.click();

      //	Capture name of First Resulting lead
            WebElement nameOfThe1stLead = driver.findElement(By.xpath("//a[text()='poonguzhali'][1]"));
            String text = nameOfThe1stLead.getText();
            System.out.println(text);

    // Click First Resulting lead
            nameOfThe1stLead.click();
  // Click Duplicate Lead
            WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
            duplicate.click();

  //	Verify the title as 'Duplicate Lead'
            String title = driver.getTitle();
            System.out.println(title);
            
            if(title.contains("Duplicate Lead")){
            System.out.println("title is verified");

            }

   //	Click Create Lead
            WebElement submit = driver.findElement(By.name("submitButton"));
            submit.click();

            //Confirm the duplicated lead name is same as captured name
            WebElement dName = driver.findElement(By.id("viewLead_firstName_sp"));
            String text1 = dName.getText();

            if(text1.equals(text)) {
            	System.out.println("both names are same");
            }

            //	Close the browser (Do not log out)
            driver.quit();

		}  
		}		

	        
            
          
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
		
		
		
				


