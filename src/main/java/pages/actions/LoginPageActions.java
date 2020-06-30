package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators=null;
	public LoginPageActions()
	{
		
		this.loginPageLocators=new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
	}
	
	
	public void enterTextOnUsername() throws InterruptedException
	{
		
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"m"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"e"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"r"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"u"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"r"));
		loginPageLocators.UN.sendKeys(Keys.chord(Keys.CONTROL,"y"));
	}
	public void enterTextOnPassword() throws InterruptedException
	{
		
		loginPageLocators.PWD.sendKeys("mercury");	
		Thread.sleep(5000);
		loginPageLocators.UN.clear();
		
		
		loginPageLocators.UN.sendKeys("mercury");
		
	}
	
	public void clickOnLogin() throws InterruptedException
	{
		Thread.sleep(5000);
		loginPageLocators.LG.click();	
		
	}

	public void textVerify() throws InterruptedException
	{
		WebDriverWait waitDriver1 = new WebDriverWait(SeleniumDriver.getDriver(), 180);
		
		waitDriver1.until(ExpectedConditions.elementToBeClickable(loginPageLocators.ProfileLink));
				
		boolean b=loginPageLocators.ProfileLink.isDisplayed();	
		System.out.println("Text"+b);
		String s=loginPageLocators.ProfileLink.getText();
		System.out.println("Text1"+s);
		Thread.sleep(3000);
			
	}
	

}
