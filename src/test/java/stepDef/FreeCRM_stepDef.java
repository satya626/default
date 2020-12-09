package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Calendarpage;
import pageObjects.Contactspage;
import pageObjects.Dealspage;
import pageObjects.Loginpage;
import pageObjects.Tasks;

public class FreeCRM_stepDef {

//String driverPath = "C:\\chromedriver.exe";
     WebDriver driver;

    Loginpage xyz;

    Contactspage abc;
    
    Dealspage uvw;
    
    Tasks mno;
    
    Calendarpage objcalendarpage;
    
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");//Launch chrome
        driver = new ChromeDriver();
        driver.get("https://freecrm.co.in/");//Open the FreeCRM website
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();//Maximize the window
            xyz = new Loginpage(driver);//Create Login Page object
            abc=new Contactspage(driver);//Create Contacts Page object
            uvw=new Dealspage(driver);//Create Deals Page object
            mno=new Tasks(driver);//Create Tasks Page object
            objcalendarpage=new Calendarpage(driver);//Create Calendar Page object
    }
    
	@Given("^User is on Login page$")
	public void user_is_on_Login_page() throws Exception  {
		    xyz.clickfirstLogin();//calls the method clickfirstLogin
		    String title=Loginpage.validateLoginTitle();//calls the method which checks the Title
		    Thread.sleep(3000);//Delay
		    Assert.assertEquals(title,"Cogmento CRM");//compare the login page title with actual title
	
	   	}

	@When("^User enters valid UserName and Password$")
	public void user_enters_valid_UserName_and_Password() throws Exception {
		xyz.setUserName("yallasrisatya626@gmail.com");//calls the method Enters username in the Username field
		Thread.sleep(3000);//Delay
		xyz.setPassword("freecrm");//calls the method which Enters the password
		
	    	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Exception {
		xyz.clickLogin();//calls the method which clicks on Login
		Thread.sleep(3000);//Delay
	   	}

	 

	@Then("^User should be navigated to Home Page$")
	public void user_should_be_navigated_to_Home_Page() throws Throwable {
		
		String title=Loginpage.validateLoginTitle();//gets the title of the Home page
	    Thread.sleep(3000);//Delay
	    Assert.assertEquals(title,"Cogmento CRM");//Compares the title which actual page title
	    System.out.println(title);//Prints the title
	    	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Exception  {
		
		xyz.setUserName(arg1);//calls the method which fills Username field
		Thread.sleep(1000);//Delay
		xyz.setPassword(arg2);//calls the method which fills Password field
		Thread.sleep(1000);//Delay
		

		}
		

	@Then("^Displays an alert Message$")
	public void displays_an_alert_Message()  {
		
		String alert=Loginpage.checkCredentials();//calls the method which checks the error message
		System.out.println(alert);//Prints the alert

	    	}

	 

	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Exception {
	    xyz.clickfirstLogin();    //click on login button before filling credentials
		xyz.setUserName("yallasrisatya626@gmail.com");//calls method that enter username
		Thread.sleep(1000);
		xyz.setPassword("freecrm");//calls method that enters Password
		xyz.clickLogin();   //click on login button after filling credentials
		Thread.sleep(1000);   //Delay
		String title1=driver.getTitle();   //gets title of home page
		System.out.println(title1);   //prints the title
		Assert.assertEquals(title1,"Cogmento CRM");     //compares the title with actual title
	    	}

	@When("^user clicks on contacts$")
	public void user_clicks_on_contacts() throws Exception {
		abc.Contacts_button();     // calls the method which clicks on contacts
		Thread.sleep(1000);
	    	}

	@When("^user navigated to contacts page$")
	public void user_navigated_to_contacts_page() {
		String title2=driver.getTitle();      //gets the title of contacts page
		System.out.println(title2);            //prints the page title
	    	}

	@Then("^User clicks on new$")
	public void user_clicks_on_new() throws Exception {
		
		abc.companynameclick(); // calls the method which clicks on new contacts
		Thread.sleep(1000);
	   	}

	@Then("^User is able to create a new contact on filling the FirstName and LastName fields$")
	public void user_is_able_to_create_a_new_contact_on_filling_the_FirstName_and_LastName_fields() throws Exception {
		
		abc.Contacts_formFill("Satya","Yalla","Sri","Capg");   //calls the method which fill the form
		Thread.sleep(2000);
		
	   	}

	 

	@Then("^User leaves the FirstName field empty and clicks on save$")
	public void user_leaves_the_FirstName_field_empty_and_clicks_on_save() throws Exception {
		abc.Contacts_formFill("","Yalla","Sri","Capg");//calls the method which fill the form with first name empty
		Thread.sleep(1000);
	   	}

	 

	@Then("^Displays a firstname alert Message$")
	public void displays_a_firstname_alert_Message() throws Throwable {
		
	String alert2=Contactspage.fnameAlert(); //calls the method which gets text of error
	System.out.println(alert2);
	Assert.assertEquals(alert2,"The field First Name is required");//compare the last name alert with actual alert
		 
	}
	 

	@Then("^User leaves the LastName field empty and clicks on save$")
	public void user_leaves_the_LastName_field_empty_and_clicks_on_save() throws Exception  {
		
		abc.Contacts_formFill("satya","","Sri","Capg");//calls the method which fill the form with last name empty
		Thread.sleep(1000);
		
	 	}
	@Then("^Displays a lastname alert Message$")
	public void displays_a_lastname_alert_Message() throws Throwable {
		String alert3=Contactspage.lnameAlert();//calls the method which gets text of error
		System.out.println(alert3);
		Assert.assertEquals(alert3,"The field Last Name is required");//compare the first name alert with actual alert
		 
	}

	@When("^user clicks on Deals$")
	public void user_clicks_on_Deals() throws Exception {
		
		uvw.Deals_button();//calls the method which click on deals button
		Thread.sleep(1000);
		
	   	}

	 

	@When("^user navigated to Deals page$")
	public void user_navigated_to_Deals_page() throws Exception {
		
		 String DealsPageTitle=driver.getTitle();//gets the title of deals page
	        Assert.assertEquals(DealsPageTitle,"Cogmento CRM");  //compares the title of deals page with actual title
	        Thread.sleep(1000);
	   	}

	@Then("^User clicks on new Deals$")
	public void user_clicks_on_new_Deals() throws Exception{
		uvw.New_Deals(); //calls the method which click on new on deals page
		Thread.sleep(1000);
	}

	@Then("^User is able to create a new Deal on filling the Title field$")
	public void user_is_able_to_create_a_new_Deal_on_filling_the_Title_field() throws Exception {
		
		uvw.Deals_formFill("Mobile","Capgemini");   //fills the deal page form
		Thread.sleep(1000);
		
	}

	@When("^user clicks on Tasks$")
	public void user_clicks_on_Tasks() throws Exception {
		mno.Tasks_button();  //calls the method which clicks on tasks button
		Thread.sleep(1000);
		
	    	}

	 

	@When("^user navigated to Tasks page$")
	public void user_navigated_to_Tasks_page() throws Throwable {
		
		String title3=driver.getTitle();  //gets title of task page
		System.out.println(title3);
	    	}

	@Then("^User clicks on new Tasks$")
	public void user_clicks_on_new_Tasks() throws Exception{
		mno.New_Tasks();    //calls the method which click on new on tasks page
		Thread.sleep(1000);
	}

	@Then("^User is able to create a new Task on filling the Title field$")
	public void user_is_able_to_create_a_new_Task_on_filling_the_Title_field() throws Exception {
		
		mno.Tasks_formFill("Laptops","Deal01","case01","This is my first task in selenium."); //fills the task page form
		Thread.sleep(1000);
	  	}


	@When("^user clicks on Calendar$")
	public void user_clicks_on_Calendar() throws Exception {
		
		objcalendarpage.clickHome();  //calls the method which clicks on home
		Thread.sleep(1000);
		objcalendarpage.clickCalendar(); //calls the method which clicks on Calendar
		Thread.sleep(1000);

	   
	}

	
	@When("^user navigated to Calendar page$")
	public void user_navigated_to_Calendar_page() {
		
		String CalendarPageTitle=driver.getTitle();//gets the title of the page
		Assert.assertEquals(CalendarPageTitle,"Cogmento CRM");
	   	}

	 

	@Then("^Created tasks should be displayed on Calendar Page$")
	public void created_tasks_should_be_displayed_on_Calendar_Page() throws Exception {
		
		String taskmessage=Calendarpage.displayOnCalendar(); //calls the method to check task on calendar
		Assert.assertEquals(taskmessage,"Laptops");//compares the created task on calendar with task title
		Thread.sleep(1000);
		
	   	}
}