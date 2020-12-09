package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
static WebDriver driver;

    //user clicks on first login
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")
	WebElement clickfirstLogin;

	//user enters username
	@FindBy(name="email")
	WebElement UserName;

	//user enters password
	@FindBy(name="password")
	WebElement Password;  
	
	//user clicks on login
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]")
	WebElement login;
	
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]")
	static
	WebElement warning;
	
	public Loginpage(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	public void clickfirstLogin(){

		  clickfirstLogin.click();
	  }
	
	//setters
	
	public void setUserName(String strUserName){

		UserName.sendKeys(strUserName);     
	}

//	//Set password in password textbox
//
	public void setPassword(String strPassword){
//
		Password.sendKeys(strPassword);
//
	}
	  public void clickLogin(){

    login.click();

}
	  
	  //public void (String strUserName,String strPassword){
//		    this.clickfirstLogin();
//
//	        //Fill user name
//
//	        this.setUserName(strUserName);
//
//	        //Fill password
//
//	        this.setPassword(strPassword);
//
//	        //Click Login button
//
//	        this.clickLogin();  
//}
	public static  String validateLoginTitle() {
		
		return driver.getTitle();
	}
	public static String checkCredentials() {
		// TODO Auto-generated method stub
		return warning.getText();
	}
//	public void Loginpage(String arg1, String arg2, boolean b) {
//		
//		 username.sendKeys(uid);
//		    password.sendKeys(pas);
//		    button.click();
//		    if(isValidCredential == true){
//		      // check if user is logged in successfully and click on logout button
//		   } else {
//		      //check appropriate error message is displayed
//		    }
//	
//		
//	}
}
