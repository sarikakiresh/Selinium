package com.seleinium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launchdemo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");// url

		driver.manage().window().maximize();// maximize

		String title1 = driver.getTitle();
		System.out.println("title:" + title1);// get title

		String currentUrl1 = driver.getCurrentUrl();
		System.out.println("currenturl:" + currentUrl1);// current url

		driver.navigate().to("https://www.naukri.com/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();
		

		driver.close();

	}
}
