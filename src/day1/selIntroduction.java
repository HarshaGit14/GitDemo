package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntroduction {
	
	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome-ChromeDriver-> methods close
		//Firefox-FirefoxDriver->methods close
		
		//System.setProperty("webdriver.chrome.driver","/Users/jedhe/Downloads/chromedriver-win64");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.className("theme-btn")).click();
		driver.findElement(By.name("sign_up_method")).click();
		driver.close();
		
		
	}

} 
