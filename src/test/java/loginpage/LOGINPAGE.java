package loginpage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGINPAGE {
	@FindBy(name = "email")
	public static WebElement username ;
	
	@FindBy(name = "possword")
	public static WebElement possword ;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/div/div[2]/div[1]/form/div/div[3]/div/button")
	public static WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\\\"root\\\"]/div[4]/div/div[1]/div[2]/div[1]/div/div")
	public static WebElement dissmiss;
	
	
	 

	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.name("email")); } public static WebElement password
	 * (WebDriver driver) { return driver.findElement(By.name("password"));
	 * 
	 * }public static WebElement loginbutton(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[2]/div[3]/div/div/div/div[2]/div[1]/form/div/div[3]/div/button"
	 * )); } public static WebElement dissmiss (WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\\\"root\\\"]/div[5]/div/div/div/div/div[2]/button")); }
	 */
	
	
		
	
	
	
	}

	
