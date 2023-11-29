package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	
	@Given("open browser")
	public void open_browser() {
		driver = new ChromeDriver();
	    
	}

	@Given("I open login page")
	public void i_open_login_page() {
	    driver.get("https://www.mycontactform.com/");
	}

	@When("I enter my username {string}")
	public void i_enter_my_username(String username) {
	  driver.findElement(By.id("user")).sendKeys(username);  
	}

	@When("I enter my password  {string}")
	public void i_enter_my_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);  
	}

	@Then("I should be loggin in")
	public void i_should_be_loggin_in() {
		driver.findElement(By.name("btnSubmit")).click(); 
	    
	}


	
	
	
	
	
	
	
	}



