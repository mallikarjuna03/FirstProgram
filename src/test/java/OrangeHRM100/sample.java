package OrangeHRM100;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	
	WebDriver driver;
	
  @Test
  public void verification() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  ((JavascriptExecutor)driver).executeScript("window.open()");
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
		driver.get("http://google.com");
	  
	  
  }
}
