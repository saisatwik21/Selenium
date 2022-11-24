package internalfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingData {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\chakr\\eclipse-workspace\\excelsheets\\src\\internalfiles\\a1.propertiies");
		Properties p1 = new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//Fetching url from propertyList using getProperty
		d.get(p1.getProperty("url"));
		d.manage().window().maximize();
		//Fetching username from propertyList using getProperty
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		//Fetching password from propertyList using getProperty
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		System.out.println(p1.getProperty("password"));
		Thread.sleep(1000);
		d.findElement(By.name("submit")).click();
		//d.close();
	}

}
