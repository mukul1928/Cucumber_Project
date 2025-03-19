package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Before
	public void test1(){
		System.out.println("Connected to the Database");
	}
	@After
	public void test2() {
		System.out.println("Disconnected to the Database");
	}
	
	@Before("@test1")
	public void beforeTest1() {
		System.out.println("Before test1 method");
	}
	
	@After("@test1") 
		public void afterTest1() {
		System.out.println("After test1 method");
	}
	
	@Before("@test2")
	public void beforeTest2() {
		System.out.println("Before test2 method");
	}
	
	@After("@test2") 
		public void afterTest2() {
		System.out.println("After test2 method");
	}
	
	
	@Given("users opens the web application")
	public void users_opens_the_web_application() {
	   
	}
	
	@Given("user will enter the {string}")
	public void user_will_enter_the(String string) {
	    
	}


	@When("user will click on Login button")
	public void user_will_click_on_login_button() {
	    
	}

	@Then("user will be navigated to the homepage of the application")
	public void user_will_be_navigated_to_the_homepage_of_the_application() {
	    
	}

	@Then("user will be getting the appropriate error message")
	public void user_will_be_getting_the_appropriate_error_message() {
	    
	}
	
	@Given("user will enter the username")
	public void user_will_enter_the_username() {
	    
	}

	@Given("user will enter the password")
	public void user_will_enter_the_password() {
	   
	}
	
	@Then("user will be navigated to the home page")
	public void user_will_be_navigated_to_the_home_page() {
	    
	}

	@Then("the user will then go to add to cart section")
	public void the_user_will_then_go_to_add_to_cart_section() {
	    
	}

	@Then("the user will then go to my favourite section")
	public void the_user_will_then_go_to_my_favourite_section() {
	  
	}

	@Then("the user will then go to change user setting section")
	public void the_user_will_then_go_to_change_user_setting_section() {
	    
	}

}
