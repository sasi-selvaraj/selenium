package Democracy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Days;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import loginpage.LOGINPAGE;
import loginpage.PROFILE;

public class demotest {
	 @Test
	public void Democracy() throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://prime-humpback-grossly.ngrok-free.app/product-list");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/section[1]/div/footer/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/img")).click();
		   
		
		LOGINPAGE.username.sendKeys("sasiselvaraj1112@gmai.com");
		LOGINPAGE.possword.sendKeys("Sasi@1112");
		LOGINPAGE.loginbutton.click();
		LOGINPAGE.dissmiss.click();
		 
		PROFILE.myaccount.click();
		PROFILE.myprofile.click();
		

		/*
		 * LOGINPAGE.username(driver).sendKeys("sasiselvaraj1112@gmai.com");
		 * LOGINPAGE.password(driver).sendKeys("Sasi@1112");
		 * LOGINPAGE.loginbutton(driver).click(); LOGINPAGE.dissmiss(driver).click();
		 */
		 
		/*
		 * PROFILE.myaccount(driver).click(); PROFILE.myprofile(driver).click();
		 */
		 
			/*
			 * driver.findElement(By.name("email")).sendKeys("sasiselvaraj1112@gmai.com");
			 * driver.findElement(By.name("password")).sendKeys("Sasi@1112");
			 * driver.findElement(By.xpath(
			 * "/html/body/div[2]/div[3]/div/div/div/div[2]/div[1]/form/div/div[3]/div/button"
			 * )).click(); // login driver.findElement(By.xpath(
			 * "//*[@id=\"root\"]/div[5]/div/div/div/div/div[2]/button")).click();// dismiss
			 * Thread.sleep(5000); driver.findElement(By.xpath(
			 * "//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/img[3]")).click();
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div[1]/div/div")).click();
			 */
			 
		  
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath( "//*[@id=\"root\"]/div[4]/div[2]/form/div[2]/div[2]/div[2]/div/div/label/div"
		  )).click();
		  String filepath="C:\\Users\\SwaminathaN\\Downloads\\download (3).jpg"; StringSelection
		  selection = new StringSelection(filepath);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		  Robot robot = new Robot();
		  
		  robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(3000);
		 
		  
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[4]/div/form/div[2]/div[4]/div[1]/div/label/div")).
		 * click(); String filepath1
		 * ="C:\\Users\\SwaminathaN\\Downloads\\download (4).jpg"; StringSelection
		 * selection1 = new StringSelection(filepath1);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,null)
		 * ; Robot sasi = new Robot(); sasi.keyPress(KeyEvent.VK_CONTROL);
		 * sasi.keyPress(KeyEvent.VK_V); sasi.keyRelease(KeyEvent.VK_CONTROL);
		 * sasi.keyPress(KeyEvent.VK_ENTER); sasi.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(3000);
		 */

		
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[4]/div/form/div[2]/div[4]/div[2]/div/label/div")).
		 * click(); String
		 * filepath2="C:\\Users\\SwaminathaN\\Downloads\\download (5).jpg";
		 * StringSelection selection2 = new StringSelection (filepath2);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2,null)
		 * ; Robot key = new Robot(); Thread.sleep(3000); key.keyPress
		 * (KeyEvent.VK_CONTROL); key.keyPress(KeyEvent.VK_V);
		 * key.keyRelease(KeyEvent.VK_CONTROL); key.keyPress(KeyEvent.VK_ENTER);
		 * key.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scroll(0,6000)"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[4]/div/form/div[3]/button[2]")).click();
		 */
		

	}

}