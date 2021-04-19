package com.selenium.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Shopping_Baseclassdemo extends Base {
	public static void main(String[] args) throws Throwable {
		driver = getBrowser("Chrome");
		getUrl("http://automationpractice.com/index.php");

		WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
		clickonelement(signin_btn);

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		inputvalueElement(email, "sarikakiresh1234@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		inputvalueElement(password, "sarika");

		WebElement submit_btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickonelement(submit_btn);

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		movetoelement(dresses);

		WebElement evening_dresses = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		movetoelementclick(evening_dresses);

		WebElement printeddress = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
		javascriptscrollpage("arguments[0].scrollIntoView();", printeddress);
		movetoelement(printeddress);
		thread();

		WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		movetoelementclick(quickview);
		thread();

		WebElement iframe_button = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frame(iframe_button);
		thread();

		WebElement quantity = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		clickonelement(quantity);

		WebElement select_size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(select_size, "byIndex", "2");

		WebElement color_select = driver.findElement(By.xpath("//a[@name='Pink']"));
		clickonelement(color_select);

		WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickonelement(addtocart);

		WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonelement(proceedtocheckout);

		thread();

//		//WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		clickonelement(proceedtocheckout2);
//		
//		thread();
//
//		WebElement proceedtocheckout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
//		clickonelement(proceedtocheckout3);
//		thread();
//
//		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		clickonelement(checkbox);
//
//		// Takescreenshot("C:\\Users\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap.png");
//
//		WebElement processcarrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
//		clickonelement(processcarrier);
//
//		// Takescreenshot("C:\\\\Users\\\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap1.png");
//		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		clickonelement(payment);
//
//		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		clickonelement(submit);
//
//		WebElement backtoorders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
//		clickonelement(backtoorders);
//
//		// Takescreenshot("C:\\Users\\\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap2.png");
//
//		WebElement backtoaccount = driver
//				.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[5]"));
//		clickonelement(backtoaccount);
//
//		thread();
//
//		WebElement homepage = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[7]"));
//		clickonelement(homepage);
	}

}
