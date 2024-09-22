package PageObjectModel;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom  extends BaseClass{
	
	//WebDriver driver;
	
	public LoginPom() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@data-testid='royal_email']")
	private WebElement emailid;
	

	public WebElement getEmailid() {
		return emailid;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(xpath = "//div[@class='_6luy _55r1 _1kbt']")
	private WebElement pass;
	

	@FindBy(xpath = "//*[@data-testid='royal_login_button']")
	private WebElement loginbtn;
	


}
