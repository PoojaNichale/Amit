package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class Dashboard extends Testbase{

	@FindBy(xpath = "//a[@class='logo']")private WebElement dashboardkitelogo;
	@FindBy(xpath = "//span[@class='nickname']")private WebElement nicknametext;
	@FindBy(xpath = "//div[@class='user-nav perspective']")private WebElement profilebutton;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutbutton;
	
	public Dashboard() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifydashboardkitelogo() {
		
		return dashboardkitelogo.isDisplayed();
	}
	
	public String verifynicknametext() {
		return nicknametext.getText();
		
	}
	
	public void verifyprofileoptions() {
		
		profilebutton.click();
		logoutbutton.click();
	}
}
















