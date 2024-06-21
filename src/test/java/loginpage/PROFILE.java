package loginpage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PROFILE {
	@FindBy(xpath="//*[@id=\\\"root\\\"]/div[1]/div[2]/div/div[2]/div/img[3]")
	public static  WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div[1]/div/div")
	public static WebElement myprofile;
	
	
	/*
	 * public static WebElement myaccount (WebDriver driver ) {
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"root\"]/div[1]/div[2]/div/div[2]/div/img[3]")).click();; return
	 * null; }public static WebElement myprofile (WebDriver driver ) {
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div[1]/div/div")).click(); return
	 * null;
	 */
		
	}
	                                          


