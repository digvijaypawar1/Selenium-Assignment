package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowPopup_Asign3 {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.linkText("Daftar")).click();
	  d.findElement(By.xpath("//*[@id=\"register_modal\"]/div/div/div[1]/button")).click();
	 /* WebElement dd1=d.findElement(By.xpath("//*[@id=\"language_selector_trigger\"]"));
	  Select select=new Select(dd1);
	  select.selectByIndex(0);*/
	  d.findElement(By.xpath("//input[@name=\"Username\"]")).sendKeys("raj@gmail.com");
	  d.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("raj123");
	  d.findElement(By.xpath("//input[@value=\"Masuk\"]")).click();
	  d.findElement(By.id("popup_modal_dismiss_button")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("http://popuptest.com/goodpopups.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
