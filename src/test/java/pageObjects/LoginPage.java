package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
public WebDriver ldriver;
	
	public void PageClass(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='name']")
	@CacheLookup
	WebElement txt_name;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='phone']")
	@CacheLookup
	WebElement txt_phone;
	
	@FindBy(xpath="//textarea[@id='textarea']")
	@CacheLookup
	WebElement txt_address;
	
	@FindBy(xpath="//input[@id='male']")
	@CacheLookup
	WebElement rd_Male;
	
//	@FindBy(xpath="//input[@class='form-check-input' and @type='checkbox']")
//	@CacheLookup
//	WebElement chk_box;
	
	public void enterName(String name)
	{
		txt_name.clear();
		txt_name.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		txt_email.clear();
		txt_email.sendKeys(email);
	}
	
	public void enterPhone(String phone)
	{
		txt_phone.clear();
		txt_phone.sendKeys(phone);
	}
	
	public void enter_address(String address)
	{
		txt_address.clear();
		txt_address.sendKeys(address);
	}
	
	public void clickMaleRadioButton()
	{
		rd_Male.click();
	}
	
	public void clickCheckBoxes()
	{
		
	}
	
	
}
