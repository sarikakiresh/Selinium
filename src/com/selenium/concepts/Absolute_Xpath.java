package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
		driver.manage().window().maximize();
		
		WebElement iphone = driver.findElement(By.xpath( 
				"//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[15]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		iphone.click();
		WebElement iphone2 = 
				driver.findElement(By.xpath(
						"//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		iphone2.click();
		WebElement iphone3 = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		iphone3.click();
		WebElement iphone4 = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		iphone4.click();

		//driver.close();//it closes the window which we selected to open as there is no performance done in the other page 
	}

}
