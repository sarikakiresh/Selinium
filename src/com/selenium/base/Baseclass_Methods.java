package com.selenium.base;

import org.openqa.selenium.WebElement;
import com.selenium.concepts.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass_Methods extends Base {
	public static void main(String[] args) throws Exception {

		driver = getBrowser("Chrome");
		getUrl("https://www.facebook.com/");

		WebElement emailing = driver.findElement(By.xpath("//input[@type='text']"));
		enabled(emailing);
		displayed(emailing);
		inputvalueElement(emailing, "sarika123@gmail.com");
		getattribute(emailing);
		clear(emailing);
		inputvalueElement(emailing, "sarika@gmail.com");

		WebElement create_txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		gettext(create_txt);

		WebElement createnewaccount_btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickonelement(createnewaccount_btn);
		thread();

		WebElement gender_btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		clickonelement(gender_btn);
		isselected(gender_btn);

		getUrl("https://www.google.com/");
		gettitle("title");
		getcurrenturl("currentUrl");
		navigate();
		
		navigateto("http://amazon.in/");
		navigateback();
		navigateforward();
		navigaterefresh();
		thread();

		navigateto("http://demo.automationtesting.in/Alerts.html");
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		clickonelement(confirm_alert);
		thread();
		WebElement confirm_box = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		clickonelement(confirm_box);
		alert();
		// pressconfirm_alert.dismiss();//dismiss

		navigateto("https://www.google.com/?gws_rd=ssl");
		WebElement gmail_btn = driver.findElement(By.xpath("//a[text()='Gmail']"));
		movetoelementclick(gmail_btn);
		robot();
		// close();

	}
}
