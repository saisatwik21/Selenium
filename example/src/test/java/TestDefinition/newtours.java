package TestDefinition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class newtours {
	WebDriver d;
	@Given("user in newtours")
	public void user_in_newtours() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	}

	@When("user needs to click register link")
	public void user_needs_to_click_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.linkText("REGISTER")).click();
	}

	@Then("user needs to get country names in dropdown")
	public void user_needs_to_get_country_names_in_dropdown() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream f = new FileInputStream("C://Chakradhar//Book3.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet5");
		Row r;
		WebElement a = d.findElement(By.tagName("select"));
	    List<WebElement> b = a.findElements(By.tagName("option"));
	    System.out.println(b.size());
	    for(int i=0;i<b.size();i++) {
	    	System.out.println(b.get(i).getText());
	    	r=ws.createRow(i);
	    	r.createCell(0).setCellValue(b.get(i).getText());
	    	b.get(i).click();
	    	if(!b.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("fail");
	    	}
	    	else {
	    		r.createCell(1).setCellValue("pass");
	    	}
	    }
	    FileOutputStream f0 = new FileOutputStream("C://Chakradhar//Book3.xlsx");
	    wb.write(f0);
	    f0.close();
	}
	@And("user closes the browser")
	public void user_closes_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}
}

