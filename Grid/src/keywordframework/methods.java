package keywordframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	WebDriver d;
	public methods() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		d=new ChromeDriver();
	}
	
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void Navigate() {
		d.manage().window().maximize();
	}
	public void usernameenter() {
		d.findElement(By.name("userName")).sendKeys("Chakradhar");
	}
	public void passwordenter() {
		d.findElement(By.name("password")).sendKeys("chakri@123");
	}
	public void click() {
		d.findElement(By.name("submit")).click();;
	}
	public void close() {
		d.close();
	}
}
