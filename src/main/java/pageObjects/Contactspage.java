package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactspage {
	
	WebDriver driver;
	
	//click on contacts
		
	   @FindBy(xpath="//*[@id='main-nav']/a[3]/span")
	   WebElement contacts;
	 
	   //click on new
	 
	   @FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	   WebElement newcontact;
	   
	   @FindBy(name="first_name")
	   WebElement Fname;
	   
	   @FindBy(name="last_name")
	   WebElement lname;
	   
	   @FindBy(name="middle_name")
	   WebElement Mname;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	   WebElement companyName;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div")
	   WebElement clickk;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[1]/button")
	   WebElement accesibility;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[1]")
	   WebElement access_click;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[2]/div")
	   WebElement namee;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[2]/div/span")
	   WebElement User_access;
	   
	   //click on save
	   @FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	   WebElement Save;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/label/span")
	   static
	   WebElement fnameWarning;
	   
	   @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label/span")
	   static
	   WebElement lnameWarning;
	   

	   
	   public Contactspage(WebDriver driver){

			this.driver = driver;
			PageFactory.initElements(driver, this);
	   }

	   public void Contacts_button(){

			  contacts.click();
		  }
	   public void companynameclick(){
		   newcontact.click();
	   }
		public void setFirstName(String strFirstName){

			Fname.sendKeys(strFirstName);     
		}
		public void setLastName(String strLastName){

			lname.sendKeys(strLastName);     
		}
		public void setMiddleName(String strMiddleName){

			Mname.sendKeys(strMiddleName);     
		}
		public void setCompanyName(String strCmpnyName){

			companyName.sendKeys(strCmpnyName);     
			clickk.click();

		}
		public void New_Contact(){
			   newcontact.click();
		}
//		public void Accesible_click(){
//
//			accesibility.click();    
//		}
//		public void clicking_access(){
//			access_click.click();
//		}
//		public void names(){
//			namee.click();
//		}
//		public void User_Accessed(){
//
//			User_access.click();    
//		}
		
		public void Save_contact(){

			Save.click(); 
		}

		public void Contacts_formFill(String strFirstName, String strLastName, String strMiddleName, String strCmpnyName)
		{
	        this.setFirstName(strFirstName);
	        this.setLastName(strLastName);
	        this.setMiddleName(strMiddleName);
	        this.setCompanyName(strCmpnyName);
	        this.Save_contact();  
	}

		public static String fnameAlert() {
			return fnameWarning.getText();
		}

		public static String lnameAlert() {
			return lnameWarning.getText();
		}	

	}

