package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_demoo {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");// url

		driver.manage().window().maximize();// maximize

		WebElement createnewaccount_btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewaccount_btn.click();
		
		Thread.sleep(2000);

		WebElement day_dropdown = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(day_dropdown);
		s.selectByValue("14");

		WebElement month_dropdown = driver.findElement(By.xpath("//select[@title='Month']"));

		Select s1 = new Select(month_dropdown);
		s1.selectByValue("5");

		WebElement year_dropdown = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year_dropdown);
		s2.selectByVisibleText("1996");
		

	}

}
