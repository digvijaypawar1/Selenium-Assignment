package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingWebTables {
	WebDriver d;
  @Test
  public void f() {
	  int rowcount=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
	  System.out.println("No of rows: "+rowcount);
	  int colcount=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody//tr[1]/td")).size();
	  System.out.println("No of colums: "+colcount);
	  /*for(int i=1;i<=rowcount;i++) {
		  for(int j=1;j<=colcount;j++) {
			System.out.println(d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText());  
		  }
	  }*/
	  for(int i=0;i<=rowcount;i++) {
		  System.out.println(d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText()+" "+d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[3]")).getText());
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/web-table-element.php#");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
