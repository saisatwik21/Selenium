package TestDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class amazon1 {
	WebDriver d;
	@Given("user is in amazon website")
	public void user_is_in_amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	    d= new ChromeDriver();
	    d.get("https://www.amazon.com/");
	    d.manage().window().maximize();
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());
	}

	@When("user clicks on dropdown elements")
	public void user_clicks_on_dropdown_elements() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream f = new FileInputStream("C://Chakradhar//Book3.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet6");
		Row r;
	    WebElement a = d.findElement(By.xpath("//*[@id=\"nav-main\"]"));
	    List<WebElement> b = a.findElements(By.tagName("a"));
	    System.out.println(b.size());
	    for(int i=0;i<b.size();i++) {
	    	System.out.println(b.get(i).getText());
	    	r=ws.createRow(i);
	    	r.createCell(0).setCellValue(b.get(i).getText());
	    	b.get(i).click();
	    	r.createCell(1).setCellValue(d.getTitle());
	    	r.createCell(2).setCellValue(d.getCurrentUrl());
//	    	Thread.sleep(1000);
	    	a = d.findElement(By.xpath("//*[@id=\"nav-main\"]"));
		    b = a.findElements(By.tagName("a"));
	    }
	    FileOutputStream fo = new FileOutputStream("C://Chakradhar//Book3.xlsx");
	    wb.write(fo);
	    fo.close();
	}

	@Then("user takes screenshot")
	public void user_takes_screenshot() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(src,new File("C:\\Chakradhar\\am.png"));
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}

}
