package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class first_step {
	
	public static WebDriver driver;
	public static Pages.Page1 page1;
	
	public first_step() {
		
		this.driver=Initiate.getDriver();
		page1=new Pages.Page1(this.driver);
		
		
	}
	

	@When("the Maker starts a game")
	public void the_maker_starts_a_game() {
	
		page1.getEle1().click();
		
		
	}
	@Then("the Maker waits for a Breaker to join")
	public void the_maker_waits_for_a_breaker_to_join() {
	   System.out.println(2/0);
	}

	@Given("there are {int} cucumbers")
	public void there_are_cucumbers(Integer int1) {
	   System.out.println(int1);
	}
	@When("I eat {int} cucumbers")
	public void i_eat_cucumbers(Integer int1) {
		System.out.println(int1);
	}
	@Then("I should have {int} cucumbers")
	public void i_should_have_cucumbers(Integer int1) {
		System.out.println(int1);
	}






	
	

}
