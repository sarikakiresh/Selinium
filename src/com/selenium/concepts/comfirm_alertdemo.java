package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comfirm_alertdemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm_alert.click();
		Thread.sleep(2000);

		WebElement confirm_box = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirm_box.click();
		Thread.sleep(2000);

		Alert pressconfirm_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		pressconfirm_alert.accept();//accept
		
		//pressconfirm_alert.dismiss();//dismiss
		Thread.sleep(1000);
		System.out.println("confitm_alert completed");

	}

}
