package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;//
import org.openqa.selenium.support.ui.Wait;//
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		WebElement Automation_Demo_Site = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
        //explicit wait
		
       WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.visibilityOf(Automation_Demo_Site));
       System.out.println("process completed;");
	   //Fluent wait
       
       //Wait wait1 = new FluentWait(driver)
    	//	   .withTimeout(30, TimeUnit.SECONDS)
          //     .pollingEvery(10, TimeUnit.SECONDS)	
            //   .ignoring(Exception.class);
	}

}
