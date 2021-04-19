package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Democoncepts {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		WebElement gmail_btn = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a = new Actions(driver);
		//context click
		a.contextClick(gmail_btn).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		System.out.println("process completed");
	  
	}

}
