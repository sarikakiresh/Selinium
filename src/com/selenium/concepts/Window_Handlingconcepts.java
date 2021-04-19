package com.selenium.concepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handlingconcepts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// window handle
		Set<String> Id = driver.getWindowHandles();
		for (String id : Id) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("title");

		}

	}

}