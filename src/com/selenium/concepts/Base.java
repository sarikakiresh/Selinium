package com.selenium.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//gecko.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();//maximize
		return driver;
	}

	public static void enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("enabled or not:" + enabled);//enabled

	}

	public static void displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("displayed or not:" + displayed);//displayed
	}

	public static void getattribute(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println("passed data:" + attribute);//getattribute

	}

	public static void clickonelement(WebElement element) {
		element.click();// click

	}


	public static void inputvalueElement(WebElement element, String value) {
		element.sendKeys(value);// passdata(sendkeys)
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println("Text:" + text);//text
	}

	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("selected or not:" + selected);//selected or not
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("byVisibletext")) {
			s.selectByVisibleText(value);

		}//index value visible text
	}

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);//frame
	}

	public static void javascriptscrollpage(String arg0, WebElement arg1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(arg0, arg1);//javascriptexecutor
	}
	
	public static void Takescreenshot(String url) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("url");
		FileUtils.copyFile(source, destination);//screenshot
	}


	public static void alert() {
		Alert alert = driver.switchTo().alert();

		if (alert.equals(alert)) {
			alert.accept();

		} else if (alert.equals(alert)) {
			alert.dismiss();
		}
	}//alert

	public static void robot() throws Exception {
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
	}//robot

//	public static void windowhandling(String arg0) {
//		String title = driver.switchTo().window(arg0).getTitle();
//		System.out.println(title);
//	}

	public static void movetoelement(WebElement actions) {
		Actions a = new Actions(driver);
		a.moveToElement(actions).build().perform();
	}//move to element actions

	public static void movetoelementclick(WebElement actions) {
		Actions b = new Actions(driver);
		b.moveToElement(actions).click().perform();
	}//move to element click actions
	
	
	public static void gettitle(String url) {
		String title = driver.getTitle();
		System.out.println("gettitle:" + title);
	}//gettitle

	public static void getcurrenturl(String url) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currenturlpage:" + currentUrl);
	}//getcurrenturl
	
	public static void getUrl(String url) {
		driver.get(url);
	}//geturl
	
	public static void navigate() {
		driver.navigate();
	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}//navigate to

	public static void navigateback() {
		driver.navigate().back();
	}//navigate back

	public static void navigateforward() {
		driver.navigate().forward();
	}//navigate forward

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}//navigate refresh
	
	public static void thread() throws InterruptedException {
		Thread.sleep(3000);
	}//thread
	
	public static void clear(WebElement element) {
		element.clear();
	}//clear
	
	public static void close() {
		driver.close();
	}//close
}
