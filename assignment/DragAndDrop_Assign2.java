package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop_Assign2 {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  WebElement drag=d.findElement(By.id("draggable"));
	  WebElement drop=d.findElement(By.id("droppable"));
	  Actions action=new Actions(d);
	  action.dragAndDrop(drag,drop).build().perform();
	  Thread.sleep(3000);
	  String message=d.findElement(By.linkText("Dropped!")).getText();
	  if(message.equals("Dropped!")) {
		  System.out.println("Successful");
	  }
	  else {
		  System.out.println("Unsucessful");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
