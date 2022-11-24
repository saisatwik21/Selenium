package grids;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver d1;
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com/";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		d1 = new RemoteWebDriver(new URL(nodeurl),cap);
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		d1=new ChromeDriver();
		d1.get(baseurl);
		d1.close();

	}

}
