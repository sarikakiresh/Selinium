package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launchdemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Driver//chromedriver.exe");// driver name
																										// and location
																										// // (alt
																										// enter)

		WebDriver driver = new ChromeDriver();// up casting

		driver.get("https://www.google.com/");// URL

		driver.manage().window().maximize();// maximize

		String title = driver.getTitle();
		System.out.println("title:" + title);// title

		String currentUrl = driver.getCurrentUrl();
		System.out.println("current Url:" + currentUrl);// current Url

		driver.navigate().to("http://amazon.in/");// to Url

		driver.navigate().back();// back

		driver.navigate().forward();// forward

		driver.navigate().refresh();// refresh
		Thread.sleep(3000);
		driver.close();// close

	}

}
