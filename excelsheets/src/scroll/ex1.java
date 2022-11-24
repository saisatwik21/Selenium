package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.careerpower.in/states-and-capitals-of-india.html");
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0,500)", "");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-1000)", "");
		WebElement a = d.findElement(By.xpath("//*[@id=\"middleMain\"]/p[4]/a"));
		js.executeAsyncScript("arguments[0].scrollIntoView();", a);
	}

}
