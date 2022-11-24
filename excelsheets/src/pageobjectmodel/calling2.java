package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		String baseurl = "https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		pom2 a1 = new pom2(d);
		a1.first();
		a1.last();
		a1.phone();
		a1.email();
		a1.country();
		a1.submit();
	}

}
