package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Page1 {

	@Test
	public void page2() {
		System.setProperty("WebDriver.Firefox.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\sel files\\Firefox Setup 42.0.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		}

}
