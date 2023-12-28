package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class LoginSteps 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch ChromeDriver")
	public void user_launch_chrome_driver() 
	{
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   
		   lp = new LoginPage();
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Then("User should navigates to the URL {string}")
	public void user_should_navigates_to_the_url(String url) 
	{
	   driver.get(url);
	}



	@When("User should enter the text fields")
	public void user_should_enter_the_text_fields(String string) 
	{
	    lp.enterName("Umesh Kavali");
	    lp.enterEmail("umeshk@outlook.in");
	    lp.enterPhone("8125794062");
	    lp.enter_address("9-5-14/B, Ramnagar Street, Gadwal-509125");
	}

	

	@Then("User should click on the Male Radio Button")
	public void user_should_click_on_the_male_radio_button() 
	{
	    lp.clickMaleRadioButton();

	}

	

	@Then("User check all the checkboxes")
	public void user_check_all_the_checkboxes() 
	{
	   lp.clickCheckBoxes();
	}

	

	@Then("User should select {string} from the Country dropdown")
	public void user_should_select_from_the_country_dropdown(String string) 
	{
	    
	}

	

	@Then("User should select {string} from the Colors dropdown")
	public void user_should_select_from_the_colors_dropdown(String string) 
	{
	    
	}

	

	@Then("User should select the Date as {string}")
	public void user_should_select_the_date_as(String string) 
	{
	    
	}
	
	@Then("User should close the browser finally")
	public void user_should_close_the_browser_finally() 
	{
	    
	}

	


}
