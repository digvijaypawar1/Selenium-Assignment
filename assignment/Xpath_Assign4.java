package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath_Assign4 {
	WebDriver d;
  @Test
  public void f() {
	 List<WebElement> links=d.findElements(By.tagName("a"));
	 System.out.println("No of links: "+ links.size()); 
	 for(WebElement link:links) {
		 System.out.println(link.getText()+"    "+link.getAttribute("href"));
	 }
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
