package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demoo {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@onkeypress='emailIdChange()']"));
		email.sendKeys("sarika@gmail.com");
		
		

	}
}
