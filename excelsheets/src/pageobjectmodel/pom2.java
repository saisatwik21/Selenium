package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By pno=By.name("phone");
	By uname=By.name("userName");
	By cont=By.name("country");
	By sub=By.name("submit");
	pom2(WebDriver d){
		this.d=d;
	}
	public void first() {
		d.findElement(fname).sendKeys("Chakradhar");
	}
	public void last() {
		d.findElement(lname).sendKeys("G");
	}
	public void phone() {
		d.findElement(pno).sendKeys("9876543210");
	}
	public void email() {
		d.findElement(uname).sendKeys("chakradhar@gmail.com");
	}
	public void country() {
		d.findElement(cont).sendKeys("INDIA");
	}
	public void submit() {
		d.findElement(sub).click();
	}
}
