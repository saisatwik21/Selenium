package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class operations {
	WebDriver d = new ChromeDriver();
	  @Test(priority=1)
	  public void rightclick() {
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  d.get("https://www.google.com/");
		  d.manage().window().maximize();
		  WebElement a = d.findElement(By.linkText("Gmail"));
		  
		  Actions act = new Actions(d);
		  act.contextClick(a).sendKeys("L").build().perform();
	  }
	  @Test(priority=2)
	  public void draganddrop() {
		  d.get("https://jqueryui.com/droppable/");
		  d.manage().window().maximize();
		  d.switchTo().frame(0);
		  WebElement b = d.findElement(By.id("draggable"));
		  WebElement c = d.findElement(By.id("droppable"));
		  Actions act = new Actions(d);
		  act.dragAndDrop(b, c).build().perform();
	  }
	  @Test(priority=3)
	  public void slide() {
		  d.get("https://jqueryui.com/slider/");
		  d.manage().window().maximize();
		  d.switchTo().frame(0);
		  WebElement e = d.findElement(By.id("slider"));
		  int x = e.getLocation().x;
		  Actions act = new Actions(d);
		  act.dragAndDropBy(e, x, 50);
	  }
	  @Test(priority=4)
	  public void menu() {
		  d.get("https://jqueryui.com/menu/");
		  d.manage().window().maximize();
		  d.switchTo().frame(0);
		  WebElement f = d.findElement(By.id("ui-id-9"));
		  WebElement g = d.findElement(By.id("ui-id-13"));
		  WebElement h = d.findElement(By.id("ui-id-15"));
		  
		  Actions act = new Actions(d);
		  act.moveToElement(f).moveToElement(g).moveToElement(h).build().perform();		  
	  }
}
