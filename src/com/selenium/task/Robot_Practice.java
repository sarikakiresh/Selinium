package com.selenium.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Practice {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		// context click
		Robot r = new Robot();

		WebElement Bestsellers = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
		a.contextClick(Bestsellers).build().perform();
		System.out.println("best sellers pressed");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
		a.contextClick(mobiles).build().perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("mobilespressed");

		WebElement Todaysdeal = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[4]"));
		a.contextClick(Todaysdeal).build().perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("todaysdealpressed");

		WebElement fashion = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
		a.contextClick(fashion).build().perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);// fr every tab to perform we must give down and enter
		System.out.println("fashion pressed");

		// window handling
		Set<String> Id = driver.getWindowHandles();
		for (String id : Id) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String actual_title = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String id : Id) {
			if (driver.switchTo().window(id).getTitle().equals(actual_title)) {
				break;
			}

		}
	}
}
