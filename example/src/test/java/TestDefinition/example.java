package TestDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class example {
	WebDriver d;
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("^user needs to enter (.*) and (.*)$")
	public void user_needs_to_enter_username_and_password(String uname,String pass) {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pass);
	
	}

	@Then("user clicks on signon button")
	public void user_clicks_on_signon_button() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.name("submit")).click();
	}

	@And("user navigated homepage")
	public void user_navigated_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   d.navigate().back();
	   Thread.sleep(1000);
	   d.close();
	}

}
