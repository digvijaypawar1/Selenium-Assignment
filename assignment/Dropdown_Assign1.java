package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdown_Assign1 {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.xpath("//b[@class='caret']")).click();
	  d.findElement(By.xpath("//input[@value='HTML']")).click();
	  d.findElement(By.xpath("//input[@value='CSS']")).click();
	  d.findElement(By.xpath("//input[@value='Bootstrap']")).click();
	  d.findElement(By.xpath("//input[@value='Java']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  d.close();
  }
  

}
