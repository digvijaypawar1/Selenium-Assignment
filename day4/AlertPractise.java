package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPractise {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/input")).click();
	  Alert alert=d.switchTo().alert();
	  d.switchTo().alert();
	  String message=alert.getText();
	  System.out.println(message);
	  alert.accept();
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//input[@value='Confirmation']")).click();
	  String message1=d.switchTo().alert().getText();
	  System.out.println(message1);
	  alert.accept();
	  System.out.println(d.findElement(By.xpath("//span[@id='lblMessage']")).getText());
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//input[@value='Prompt']")).click();
	  String message2=alert.getText();
	  System.out.println(message2);
	  d.switchTo().alert().sendKeys("raj patil");
	  alert.accept();
	  String q =d.findElement(By.xpath("//span[@id='lblMessage']")).getText();
	  System.out.println(q);
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("http://10.82.181.42/Automation/DemoApps/PopUpBox.aspx");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
