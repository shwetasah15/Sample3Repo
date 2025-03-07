package StepDefPkg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBLoginCode {
//	@Given("I navigate to the login page")
//	public void i_navigate_to_the_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("It is navigatin to login page");
//	}
//
//	@And("I enter a valid username and password")
//	public void i_enter_a_valid_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("verifyig....");
//	}
//
//	@And("I click the sign-in button")
//	public void i_click_the_sign_in_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("sigin.....");
//	}
//
//	@Then("It navigates to the Home Page")
//	public void it_navigates_to_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("navigating to home page.....");
//	}
//
//	@And("I enter a valid username and an invalid password")
//	public void i_enter_a_valid_username_and_an_invalid_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("verifying......");
//	}
//
//	@Then("It should display an error message")
//	public void it_should_display_an_error_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Errorrrr...");
//	}


	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hello from the home  page");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	      System.out.println(string + "   "+  string2);
	}

	@When("I click the sign-in button")
	public void i_click_the_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("signing in....");
	}

	@Then("It navigates to the home page")
	public void it_navigates_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("login succesfulll...");
	}


}