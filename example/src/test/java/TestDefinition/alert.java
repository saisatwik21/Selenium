package TestDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class alert {
	WebDriver d;
	@Given("user is in dezlearn page")
	public void user_is_in_dezlearn_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user gets url and title")
	public void user_gets_url_and_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(d.getCurrentUrl());
	    System.out.println(d.getTitle());
	}

	@Then("user works on alert message")
	public void user_works_on_alert_message() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.id("s_alert1")).click();
	    Alert alt = d.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.accept();
	}

	@And("user captures screenshots and closes the window")
	public void user_captures_screenshots_and_closes_the_window() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(src,new File("C:\\Chakradhar\\alert1.png"));
	}

}
