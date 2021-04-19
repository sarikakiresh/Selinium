package com.selenium.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Projecton_Registration {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
		signin_btn.click();
		System.out.println("signin");
		Thread.sleep(3000);

		WebElement create_account = driver.findElement(By.xpath("//input[@id='email_create']"));
		create_account.sendKeys("sarikakiresh12345@gmail.com");
		System.out.println("emailid password");
		Thread.sleep(1000);

		WebElement create_btn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create_btn.click();
		Thread.sleep(3000);
          
		WebElement gender_btn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender_btn.click();

		Thread.sleep(1000);
		
		WebElement customer_firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		customer_firstname.sendKeys("Sarika");
		System.out.println("firstname entered");

		Thread.sleep(1000);

		WebElement customer_lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		customer_lastname.sendKeys("B");
		System.out.println("lastname entered");

		WebElement password_enter = driver.findElement(By.xpath("//input[@type='password']"));
		password_enter.sendKeys("sarika");
		System.out.println("password passed");

		WebElement day_dd = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day_dd);
		s.selectByIndex(14);
		System.out.println("day selected");

		WebElement month_dd = driver.findElement(By.xpath("//select[@id='months']"));
		Select s1 = new Select(month_dd);
		s1.selectByIndex(5);
		System.out.println("month selected");

		WebElement years_dd = driver.findElement(By.xpath("//select[@id='years']"));
		Select s2 = new Select(years_dd);
		s2.selectByValue("1996");
		System.out.println("years selected");

		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkbox2.click();

		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("skydream amusements");
		System.out.println("company registered");

		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("1");

		Thread.sleep(1000);

		WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
		address2.sendKeys("Midtown office space");
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("NY");
        
		System.out.println("Address entered");
		
		WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		postcode.sendKeys("10001");

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s3 = new Select(state);
		s3.selectByValue("32");

		WebElement additional_info = driver.findElement(By.xpath("//textarea[@name='other']"));
		additional_info.sendKeys("Home sweet Home");

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("555-3890");

		WebElement phone_mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		phone_mobile.sendKeys("555-3899");

		Thread.sleep(1000);

		WebElement name_alias = driver.findElement(By.xpath("//input[@name='alias']"));
		name_alias.sendKeys("Midtownoffice 10001");

		//WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//register.click();

	}

}
