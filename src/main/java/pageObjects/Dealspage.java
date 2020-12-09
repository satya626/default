package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dealspage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='main-nav']/a[5]")
	WebElement deals;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")
	WebElement newdeals;
	
	@FindBy(name="title")
	WebElement dealstitle;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement assigned;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div")
	WebElement assigneename;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement dealscompany;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement saveDeal;
	
	public Dealspage(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	
	 public void Deals_button() throws Exception{

		  deals.click();
		  Thread.sleep(1000);
	  }
	 
	 public void New_Deals() throws Exception {
			
		 newdeals.click();
		 Thread.sleep(1000);
		}

  
	public void setTitle(String strTitle){

		dealstitle.sendKeys(strTitle);  
	}
	
	public void Assigned(){
		
		assigned.click();
	}
	
	public void Assignee_name() throws Exception{
		
		assigneename.click();
		Thread.sleep(1000);
	}
	
	public void setDealsCompanyName(String strCompanyName) throws Exception{

		dealscompany.sendKeys(strCompanyName);
		Thread.sleep(1000);
	}
	
	public void save_deal(){
		saveDeal.click();
	}
	
	
	public void Deals_formFill(String strTitle, String strCompanyName) throws Exception
	{
        
        this.setTitle(strTitle);
        this.Assigned();
        this.Assignee_name();
        this.setDealsCompanyName(strCompanyName);
        this.save_deal();  
}


}
