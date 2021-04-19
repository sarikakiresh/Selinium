package com.seleinium.practice;
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

	public class Softcopy {
		public static void main(String[] args) throws InterruptedException, IOException {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();

			WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
			signin_btn.click();
			System.out.println("signin");

			Thread.sleep(3000);

			WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
			email.sendKeys("sarikakiresh1234@gmail.com");
			System.out.println("email passed");

			WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
			password.sendKeys("sarika");
			System.out.println("passoword passed");

			WebElement submit_btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			submit_btn.click();
			WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
			Actions a = new Actions(driver);
			a.moveToElement(dresses).build().perform();

			Thread.sleep(2000);

			WebElement evening_dresses = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
			a.moveToElement(evening_dresses).build().perform();
			a.click(evening_dresses).build().perform();

			System.out.println("evening_dresses pressed");
			Thread.sleep(2000);

			WebElement printeddress = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", printeddress);
			a.moveToElement(printeddress).build().perform();

			Thread.sleep(3000);

			WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
			a.moveToElement(quickview).click().build().perform();

			WebElement iframe_button = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(iframe_button);

			Thread.sleep(1000);

			WebElement quantity = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
			quantity.click();

			WebElement select_size = driver.findElement(By.xpath("//select[@name='group_1']"));
			Select s = new Select(select_size);
			s.selectByIndex(2);

			System.out.println("passed");

			Thread.sleep(3000);

			WebElement color_select = driver.findElement(By.xpath("//a[@name='Pink']"));
			color_select.click();

			Thread.sleep(2000);
			WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
			addtocart.click();

			Thread.sleep(2000);

			WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			proceedtocheckout.click();

			Thread.sleep(3000);

			System.out.println("done");

			WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			proceedtocheckout2.click();
			Thread.sleep(2000);

			WebElement proceedtocheckout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
			proceedtocheckout3.click();
			Thread.sleep(3000);

			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			checkbox.click();
			System.out.println("checkbox clicked");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\screenshot\\Snap.png");
			FileUtils.copyFile(source, destination);

			WebElement processcarrier = driver.findElement(By.xpath("//button[@name='processCarrier']"));
			processcarrier.click();

			File source1 = ts.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\screenshot\\Snap1.png");
			FileUtils.copyFile(source1, destination1);

			System.out.println("done");

			WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
			payment.click();

			WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			submit.click();
			System.out.println("processed");

			WebElement backtoorders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
			backtoorders.click();
			File source2 = ts.getScreenshotAs(OutputType.FILE);
			File destination2 = new File("C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\screenshot\\Snap2.png");
			FileUtils.copyFile(source2, destination2);

			System.out.println("donne");

			Thread.sleep(2000);
			WebElement backtoaccount = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[5]"));
			backtoaccount.click();

			Thread.sleep(2000);

			WebElement homepage = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[7]"));
			homepage.click();
		}

	}


