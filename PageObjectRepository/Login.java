package PageObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id="512")
	private WebElement icon;
	
	@FindBy(xpath="//a[@href='/login?referer=https://www.myntra.com/']")
	private WebElement login;
	
	public void login1() throws Exception {
		
File src = new File("C:\\Users\\IBM_ADMIN\\Desktop\\SELENIUM\\TestData.xlsx");
FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(0);

	}

}
