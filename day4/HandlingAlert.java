package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingAlert {
	WebDriver d;
  @Test
  public void f() {
	 // WebElement frame1=
	  d.findElement(By.xpath("//a[@class='signin']")).click();
	  d.findElement(By.xpath("//input[@type='submit']")).click();
	  Alert alert=d.switchTo().alert();
	  String message=alert.getText();
	  System.out.println(message);
	  alert.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://mail.rediff.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
