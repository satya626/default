package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id='main-nav']/a[6]/span")
	WebElement tasks;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
	WebElement newtasks;
	
	@FindBy(name="title")
	WebElement taskstitle;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement tasksassigned;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div")
	WebElement tasksassigneename;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[1]/div/input")
	WebElement date;
	
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")
	WebElement taskDateSelect;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[37]")
	WebElement taskTimeSelect;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/input")
	WebElement taskdeal;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div[2]")
	WebElement taskdealname;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div/input")
	WebElement tasksearch;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div/div[2]")
	WebElement taskcase;
	
	@FindBy(name="description")
	WebElement taskdescription;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement saveTask;
	
	
	public Tasks(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	
	
	 public void Tasks_button() throws Exception{

		  tasks.click();
		  Thread.sleep(1000);
	  }
	 
	 public void New_Tasks() throws Exception {
			
		 newtasks.click();
		 Thread.sleep(1000);
		}

  
	public void setTitle(String strTitle){

		taskstitle.sendKeys(strTitle);  
	}
	 
public void Assigned(){
		
		tasksassigned.click();
	}
	
	public void Assignee_name() throws Exception{
		
		tasksassigneename.click();
		Thread.sleep(1000);
	}
	
	
	public void task_deal(String strDealDeal) {
		taskdeal.sendKeys(strDealDeal);
	}
	
	public void task_dealname(){
		taskdealname.click();
	}

	public void taskTimeSelect() {
		taskTimeSelect.click();
		
	}

	public void taskDateSelect(){
		taskDateSelect.click();
		
	}

	public void dateClick() {
		 date.click();
	}
	public void task_search(String strcasename) throws Exception{
		tasksearch.sendKeys(strcasename);
		Thread.sleep(1000);
		
	}
	
	public void task_case() throws Exception{
		taskcase.click();
		Thread.sleep(1000);
	}
	
	public void task_description(String strdescription){
		
		taskdescription.sendKeys(strdescription);
	}

	public void save_task(){
		saveTask.click();
	}
	
	
	public void Tasks_formFill(String strTitle, String strDealDeal, String strcasename, String strdescription) throws Exception
	{
        
        this.setTitle(strTitle);
        this.Assigned();
        this.Assignee_name();
        this.task_deal(strDealDeal);
        this.task_dealname();
        //this.dealnameclick();
        this.dateClick();
		this.taskDateSelect();
		this.taskTimeSelect();
        this.task_search(strcasename);
        this.task_case();
        this.task_description(strdescription);
        this.save_task();  
}
	
}
