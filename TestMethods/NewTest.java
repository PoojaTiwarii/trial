package TestMethods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void a() throws InterruptedException {
	 
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\SELENIUM\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
	  WebDriver driver = new InternetExplorerDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	 driver.manage().window().maximize();
	 
	  WebElement Customer = driver.findElement(By.id("custid"));
	  WebElement submit = driver.findElement(By.name("submit"));
	  
	  Customer.sendKeys("5646");
	  submit.click();
	  
	  Alert alert = driver.switchTo().alert();
	
	  
	 // String alertmsg = driver.switchTo().alert().getText();
	  
	 // System.out.println("alertMessage");	
      //Thread.sleep(5000);
      
      alert.accept();
	  
  }
}
