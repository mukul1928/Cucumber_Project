package StepDefinition;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Before
	public void test1() {
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
		System.out.println("Application opened");
	}

	@Given("user will enter the {string}")
	public void user_will_enter_the(String string) {
		System.out.println("Hello");
	}

	@When("user will click on Login button")
	public void user_will_click_on_login_button() {
		System.out.println("Hii");
	}

	@Then("user will be navigated to the homepage of the application")
	public void user_will_be_navigated_to_the_homepage_of_the_application() {
		System.out.println("Welcome");
	}

	@Then("user will be getting the appropriate error message")
	public void user_will_be_getting_the_appropriate_error_message() {
		System.out.println("Error !!");
	}

	@Given("user will enter the username")
	public void user_will_enter_the_username() {
		System.out.println("chandan_143");
	}

	@Given("user will enter the password")
	public void user_will_enter_the_password() {
		System.out.println("test@1234");
	}

	@Then("user will be navigated to the home page")
	public void user_will_be_navigated_to_the_home_page() {
		System.out.println("Welcome again user");
	}

	@Then("the user will then go to add to cart section")
	public void the_user_will_then_go_to_add_to_cart_section() {
		System.out.println("Product added to the cart successfully");
	}

	@Then("the user will then go to my favourite section")
	public void the_user_will_then_go_to_my_favourite_section() {
		System.out.println("the favourite section shown successfully");
	}

	@Then("the user will then go to change user setting section")
	public void the_user_will_then_go_to_change_user_setting_section() {
		System.out.println("the user successfully updated his profile");
	}

	@Given("user is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		System.out.println("WelcomeHRom user");
	}

	@When("user will enter the credientials")
	public void user_will_enter_the_credientials(io.cucumber.datatable.DataTable dataTable) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<List<String>> signupform = dataTable.asLists(String.class);

		String username = signupform.get(0).get(0);
		String email = signupform.get(0).get(1);
		String phone = signupform.get(0).get(2);
		String DOB = signupform.get(0).get(3);

		WebElement name = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
		name.sendKeys(username);
		WebElement email_id = driver.findElement(By.xpath("(//input[@id='email'])"));
		email_id.sendKeys(email);
		WebElement mobile = driver.findElement(By.xpath("(//input[@id='mobile'])"));
		mobile.sendKeys(phone);
		WebElement dateofbirth = driver.findElement(By.xpath("(//input[@id='dob'])"));
		dateofbirth.sendKeys(DOB);

	}

	@Then("user will be submitting the form")
	public void user_will_be_submitting_the_form() {
			System.out.println("The user is successfully created his account");
	}

}
