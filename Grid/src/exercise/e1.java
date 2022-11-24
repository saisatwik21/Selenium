package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {
	ChromeDriver d=new ChromeDriver();
	 void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		d.get("https://itera-qa.azurewebsites.net/");
		d.manage().window().maximize();
	}
	 void signup() {
		d.findElement(By.linkText("Sign Up")).click();
		d.findElement(By.id("FirstName")).sendKeys("Chakradhar");
		d.findElement(By.id("Surname")).sendKeys("G");
		d.findElement(By.id("Username")).sendKeys("Chakradhar");
		d.findElement(By.id("Password")).sendKeys("chakri@123");
		d.findElement(By.id("ConfirmPassword")).sendKeys("chakri@123");
		System.out.println(d.findElement(By.xpath("/html/body/div/form/div/div[9]/div/label")).getText());
	}
	 void login() {
		d.findElement(By.linkText("Login")).click();
		d.findElement(By.id("Username")).sendKeys("Chakradhar");
		d.findElement(By.id("Password")).sendKeys("chakri@123");
		d.findElement(By.name("login")).click();
		
	}
	 void links() {
		 WebElement a = d.findElement(By.xpath("//*[@id='navbarColor01']/ul"));
		 List<WebElement> b = a.findElements(By.tagName("a"));
		 System.out.println(b.size());
		 for(int i=0;i<b.size();i++) {
			 System.out.println(b.get(i).getText());
		 }
	 }
	 void close() {
		d.close();
	}
	 public static void main(String[] args) {
		 e1 obj = new e1();
		 obj.openurl();
		 obj.signup();
		 obj.login();
		 obj.links();
		 obj.close();
	 }
	
}
