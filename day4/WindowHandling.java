package day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling {
	static WebDriver d;
	@BeforeMethod
	public static void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\digvijay.pawar01\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public static void test() {
		String window1=d.getWindowHandle();
		System.out.println("window 1 is "+window1);
		d.findElement(By.id("windowButton")).click();
		Set<String> windows=d.getWindowHandles();
		System.out.println("Total windows: "+windows.size());
		for(String w:windows) {
			if(w.equals(window1)) {
				System.out.println("window1: "+w+"\n url1: "+d.getCurrentUrl()+"\n title1: "+ d.getTitle());
			}
			else {
				d.switchTo().window(w);
				System.out.println("window1: "+w+"\n url2: "+d.getCurrentUrl()+"\n title2: "+ d.getTitle());
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
			}
		}
			
			
		}
	@AfterMethod
	public static void afterTest() {
		d.quit();
	}
		
	}


