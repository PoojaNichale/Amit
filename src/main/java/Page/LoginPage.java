package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class LoginPage extends Testbase{

	@FindBy(xpath = "//input[@id='userid']")private WebElement userIdTextbox;
	@FindBy(xpath = "//input[@id='password']")private WebElement passwardTextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kitelogo;
	@FindBy(xpath = "//h2[text()='Login to Kite']")private WebElement logintokitetext;
	@FindBy(xpath = "//input[@id='pin']")private WebElement pintextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	@FindBy(xpath = "//button[@class='button-blue']")private WebElement getstartedtext;
	@FindBy(xpath = "(//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx'])[2]")private WebElement serachtext;
	@FindBy(xpath = "//span[text()='INFOBEAN']")private WebElement infobeansharetext;
//	@FindBy(xpath = "//input[@id='pin']")private WebElement ;
//	@FindBy(xpath = "//input[@id='pin']")private WebElement ;

	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void loginzerodha() throws Exception {
		
		userIdTextbox.sendKeys(readproperty("username"));
	//	userIdTextbox.sendKeys(readexcelfile(0, 1));
	    passwardTextbox.sendKeys(readproperty("passward"));
	//	passwardTextbox.sendKeys(readexcelfile(0, 2));
		loginbutton.click();
		Thread.sleep(3000);
		pintextbox.sendKeys(readproperty("pin"));
	 // pintextbox.sendKeys(readexcelfile(0, 3));
		continuebutton.click();
	}
	
	public boolean verifykitelogo() {
		
		return kitelogo.isDisplayed();
	}
	
	public String verifylogintext() {
		
		return logintokitetext.getText();
	}
	
	
	public void verifysharebyoption() throws Exception
	{
		getstartedtext.click();
		serachtext.sendKeys(readexcelfile(2, 0));
		infobeansharetext.click();
	}
	
	
	
	
	
}
