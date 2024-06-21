package SampleTestng;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alpha {
	
	    @Test(invocationCount=2, threadPoolSize= 2)

	    public void alphatest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://alpha-power.stagingzar.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("admin@123");
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"accordion-menu\"]/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div[2]/a")).click();
		driver.quit();                                       
		// TODO Auto-generated method stub

	}

}
