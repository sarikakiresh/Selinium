package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_demo {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sarika@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sarikakiresh");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\screenshot\\Snap.png");
		FileUtils.copyFile(source, destination);


		driver.navigate().back();// back
		Thread.sleep(3000);
		
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\screenshot\\Snap1.png");
		FileUtils.copyFile(source1, destination1);
		
		driver.close();
	}
	  
}
