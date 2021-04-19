package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_demo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_brand_bmm&gclid=EAIaIQobChMIh7XB7N277wIVA2oqCh15fgjaEAAYASAAEgIem_D_BwE");

		driver.manage().window().maximize();

		 WebElement location = driver.findElement(By.xpath("//a[text()='chennai']"));
		 //scroll down
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", location);
		 
		 Thread.sleep(1000);
		 
		 WebElement deliverylocation = driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']"));
		 
		 js.executeScript("arguments[0].scrollIntoView();",deliverylocation);
		 
		 System.out.println("scroll completed ");
		 
	}
}
