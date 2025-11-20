package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MobilePurchase {
	   public static WebDriver driver;
	
@BeforeClass(groups="default")
public static void browserLaunch() {
	System.out.println("browserLaunch");
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass(groups="default")
public static void browserQuit() {
	System.out.println("browserQuit");
}
@BeforeMethod(groups="default")
public void startTime() {
	long end=System.currentTimeMillis();
	System.out.println("before");
}
@AfterMethod(groups="default")
public void endTime() {
	long end=System.currentTimeMillis();
	System.out.println("After totaltime"+(end));
}
@Test(priority=1)

public void login() {
	System.out.println("method1");
	
	WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("realme",Keys.ENTER);
}
@Test(priority=2,enabled=false)
public  void search() {
	System.out.println("method2");
}
@Test(priority=3,invocationCount=2)
public  void mobile() {
	System.out.println("method3");

}
@Test(priority=4,groups="smoke")
public  void windows() {
	System.out.println("method4");
}
@Test(priority=5,groups="smoke")
public  void validation() {
	System.out.println("method5");
}
}