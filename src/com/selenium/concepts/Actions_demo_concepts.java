package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo_concepts {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
        Actions a = new Actions(driver);
        a.moveToElement(dresses).build().perform();
        
        WebElement evening_dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
        a.moveToElement(evening_dresses).build().perform();
        a.click(evening_dresses).build().perform();
        
       System.out.println("process done");
	}

}
