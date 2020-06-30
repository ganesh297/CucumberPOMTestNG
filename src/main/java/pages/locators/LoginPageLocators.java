package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
	
	
	@FindBy(how=How.NAME,using="userName")
	public WebElement UN;
	
	@FindBy(how=How.NAME,using="password")
	public WebElement PWD;

	@FindBy(how=How.NAME,using="login")
	public WebElement LG;
	
	@FindBy(how=How.LINK_TEXT,using="PROFILE")
	public WebElement ProfileLink;

	
	
}
