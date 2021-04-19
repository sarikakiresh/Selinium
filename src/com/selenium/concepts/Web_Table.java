package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		//ALL data
		
		System.out.println("########ALL DATA###########");
		 List<WebElement> all_Data = driver.findElements(By.xpath(("//table/tbody/tr/td")));
		 
		 for (WebElement data : all_Data) {
			 
			 String value = data.getText();
			 System.out.println(value);
			 
		}
		 System.out.println("*ROW DATA*");
		 List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		 for (WebElement data : row_Data) {
			 String text = data.getText();
			 System.out.println(text);
			
		}
		 
		 System.out.println("**COLUMN DATA**");
		 List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		 for (WebElement data : column_Data) {
			 String text = data.getText();
			 System.out.println(text);

		}
		 
		 WebElement particular_Data = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
		 String data = particular_Data.getText();
		 System.out.println("particular_Data:"+data);
		 
		 System.out.println("*******HEADER*******");
		 List<WebElement> all_Header = driver.findElements(By.tagName("th"));
		for (int i = 0; i < all_Header.size(); i++) {
			String header = all_Header.get(i).getText();
			System.out.println(header);
			
		}
		}
		 
	}

