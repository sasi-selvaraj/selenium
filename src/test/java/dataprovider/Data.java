package dataprovider;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Data{
	@DataProvider(name="login",parallel=true)
	
	public String[][]  getData(){
		String[][]data=new String[4][2];
		
		  data[0][0]= "yasarj.techzar@gmail.com"; data[0][1]= "Password@123";
		  
		  data[1][0]= "sasiselvaraj1112@gmail.com"; data[1][1]="Yasar@12345" ;
		  
		  data[2][0]= "baskar.techzar@gmail.com"; data[2][1]="12345678" ;
		  
		  data[3][0]="ajeni02@gmail.com"; data[3][1]="password123";
		 
	    return data;
}
	
	 @Test(dataProvider="login")

		
	 public  void Dataprovider(String email ,String pass) throws InterruptedException, AWTException, IOException {
		System.out.println("successfully passed");
	
WebDriver driver= new ChromeDriver();
driver.get("https://gadgetz.stagingzar.com/");
Thread.sleep(6000);
driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[1]/div/ul/li")).click(); //login 
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys(email);
driver.findElement(By.id("review")).sendKeys(pass);
driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/form/div[3]/a")).click();

//driver.quit();





}}