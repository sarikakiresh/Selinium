package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath_demoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");// url

		driver.manage().window().maximize();// maximize

		WebElement emailingbox = driver.findElement(By.xpath("//input[@type='text']"));
		emailingbox.sendKeys("sarika.kiresh@gmail.com");// send keys

		WebElement passwordbox = driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pa')]"));
		passwordbox.sendKeys("sarika");

		WebElement create_txt = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
		String value = create_txt.getText();
	    System.out.println("text:"+value);
	    
	    WebElement login_btn = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	    login_btn.click();
	    
	}
	    
}
	

