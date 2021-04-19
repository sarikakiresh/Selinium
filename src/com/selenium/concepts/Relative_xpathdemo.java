package com.selenium.concepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpathdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");// url
		
		driver.manage().window().maximize();// maximize
		
		WebElement emailing = driver.findElement(By.xpath("//input[@type='text']"));
		emailing.sendKeys("sarika123@gmail.com");//wanted input data in login
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("sarika");//send keys//wanted input data in password	
	
		WebElement creating_txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));//create a page
				
		String value = creating_txt.getText();//get text
		
		System.out.println("thecreatedtext:" +value);
		
		driver.quit();	
		

		

	}

}
