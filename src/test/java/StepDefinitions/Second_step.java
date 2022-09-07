package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Second_step {
	
	public static WebDriver driver;
	public static Pages.Page1 page1;
	
	public Second_step() {
		
		this.driver=Initiate.getDriver();
		page1=new Pages.Page1(this.driver);
		
		
	}
	
	
	
	@When("i am second")
	public void i_am_second() {
	    
		System.out.println("this is second");
		
	}
	@Then("still second")
	public void still_second() {
	 
	}




}
