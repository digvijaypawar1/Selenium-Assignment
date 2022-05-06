package day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTab {
	WebDriver d;
  @Test
  public void f() {
	  String window1=d.getWindowHandle();
	  d.findElement(By.id("tabButton")).click();
	  Set<String> windows=d.getWindowHandles();
	  for(String w:windows) {
		  if(w.equals(window1)) {
			  System.out.println(d.getTitle());
		  }
		  else {
			  d.switchTo().window(w);
			  System.out.println(d.findElement(By.id("sampleHeading")).getText());
		  }
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

}
