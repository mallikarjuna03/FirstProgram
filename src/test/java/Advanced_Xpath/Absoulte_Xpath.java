package Advanced_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Absoulte_Xpath {
	WebDriver driver;
	
  @Test
  public void Absoulute() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	  
	  driver.findElement(By.xpath("/html/body/div[12]")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
}
