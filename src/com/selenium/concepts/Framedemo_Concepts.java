package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo_Concepts {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.switchTo().frame("singleframe");
		
		WebElement text_box = driver.findElement(By.xpath("//input[@type='text']"));
		text_box.sendKeys("sarika");

		System.out.println("single frame completed");
		Thread.sleep(1000);
        
		driver.switchTo().defaultContent();

		WebElement iframe_btn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe_btn.click();

		WebElement outer_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer_frame);
		WebElement inner_frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner_frame);
		WebElement text_boxs = driver.findElement(By.xpath("//input[@type='text']"));
		text_boxs.sendKeys("mutipleframe");
        //driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("mutipleframe completed");
	}
}
