package com.seleinium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Xpath {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		WebElement login_btn = driver.findElement(By.xpath("//span[text()='Sign up']"));
		login_btn.click();
		Thread.sleep(2000);
	}

}
