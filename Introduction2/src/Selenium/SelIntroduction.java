package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;


public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe.exe");
	WebDriver driver= new ChromeDriver();
	 	driver.get("https://www.spicejet.com");
	 	Thread.sleep(6000);
	 	//xpath for from dropdown
	 	driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
	 	//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-icoktb r-q4m81j]")).click();
	 	driver.findElement(By.id("main-container")).click();
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("(//div[contains(text(),'PNQ - Pune, India')])[1]")).click();
	 	 	
	 	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'BLR - Bengaluru, India')])[1]")).click();
	 	//driver.quit();
	}
	

}
