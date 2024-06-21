package Utils;
    
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ReadExcel {
@Test
public void Techinfo () throws InterruptedException, IOException {  
		WebDriver driver = new ChromeDriver();
		driver.get("https://gadgetz.stagingzar.com/");
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\SwaminathaN\\eclipse-workspace\\maventest\\Test_data\\login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		for (int i=1;i<rowcount;i++) {	
	    XSSFRow celldata = sheet.getRow(i);
		String mail = celldata.getCell(0).getStringCellValue();
		String pwd = celldata.getCell(1).getStringCellValue();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[1]/div/ul/li")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("review")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/form/div[3]/a")).click();
	    wb.close();
	    driver.quit();
	
		
		
	}

}

}

