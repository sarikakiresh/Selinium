package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert_Demo {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		confirm_alert.click();
		Thread.sleep(2000);
		
		WebElement promptbox_alert = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		promptbox_alert.click();
	    Thread.sleep(2000);
	    
	    Alert confirm_boxAlert = driver.switchTo().alert();
	    Thread.sleep(1000);
	    
	    String text = confirm_boxAlert.getText();
	    System.out.println("the text:"+text);
	    
	    
	    //confirm_boxAlert.accept();
	    Thread.sleep(1000);
	    
	    System.out.println("prompt alert completed");
	    
	}

}
