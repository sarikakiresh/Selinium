package com.automation.pom;

import com.selenium.concepts.Base;

public class Shopping_Automation extends Base {

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");

		getUrl("http://automationpractice.com/index.php");

		// WebElement signin_btn = driver.findElement(By.xpath("//a[@class='login']"));
		Home_Page home = new Home_Page(driver);
		clickonelement(home.getSignin_btn());
		thread();

		// WebElement email =
		// driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		Login_Page login = new Login_Page(driver);

		inputvalueElement(login.getEmail(), "sarikakiresh1234@gmail.com");

		// WebElement password =
		// driver.findElement(By.xpath("//input[@name='passwd']"));
		inputvalueElement(login.getPassword(), "sarika");

		// WebElement submit_btn =
		// driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickonelement(login.getSubmit_btn());

		// WebElement dresses =
		// driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Shopping_Page shopping = new Shopping_Page(driver);

		movetoelement(shopping.getDresses());

		// WebElement evening_dresses =
		// driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		movetoelementclick(shopping.getEvening_dresses());

		// WebElement printeddress = driver.findElement(By.xpath("//a[@title='Printed
		// Dress']"));
		javascriptscrollpage("arguments[0].scrollIntoView();", shopping.getPrinteddress());
		movetoelement(shopping.getPrinteddress());

		thread();

		// WebElement quickview =
		// driver.findElement(By.xpath("//a[@class='quick-view']"));
		movetoelementclick(shopping.getQuickview());
		thread();

		// WebElement iframe_button =
		// driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		Order_Selecting select = new Order_Selecting(driver);
		frame(select.getIframe_button());
		thread();

		// WebElement quantity =
		// driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		clickonelement(select.getQuantity());

		// WebElement select_size =
		// driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown(select.getSelect_size(), "byIndex", "2");

		// WebElement color_select = driver.findElement(By.xpath("//a[@name='Pink']"));
		clickonelement(select.getColor_select());

		// WebElement addtocart =
		// driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickonelement(select.getAddtocart());
         
		thread();
		
		// WebElement proceedtocheckout =
		// driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonelement(select.getProceedtocheckout());

		thread();

		// WebElement proceedtocheckout2 =
		// driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		Checkout2_Page Checkout2 = new Checkout2_Page(driver);

		clickonelement(Checkout2.getProceedtocheckout2());

		thread();

		// WebElement proceedtocheckout3 =
		// driver.findElement(By.xpath("//button[@name='processAddress']"));
		Checkout3_Page checkout3 = new Checkout3_Page(driver);
		clickonelement(checkout3.getProceedtocheckout3());
		thread();

		// WebElement checkbox =
		// driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox_Page box = new Checkbox_Page(driver);
		clickonelement(box.getCheckbox());

		// Takescreenshot("C:\\Users\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap.png");

		// WebElement processcarrier =
		// driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickonelement(box.getProcessCarrier());

		// Takescreenshot("C:\\\\Users\\\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap1.png");
		// WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		Payment_Page pay = new Payment_Page(driver);

		clickonelement(pay.getPayment());

		// WebElement submit =
		// driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonelement(pay.getSubmit());

		// WebElement backtoorders = driver.findElement(By.xpath("//a[@title='Back to
		// orders']"));
		clickonelement(pay.getBacktoorders());

		// Takescreenshot("C:\\Users\\\\Sarika\\\\eclipse-workspace\\\\Selinium\\\\screenshot\\\\Snap2.png");

		// WebElement backtoaccount = driver.findElement(By.xpath("(//a[@class='btn
		// btn-default button button-small'])[5]"));
		Back_Page back = new Back_Page(driver);
		clickonelement(back.getBacktoaccount());

		thread();
        Homeback_Page homeback= new Homeback_Page(driver);
		//WebElement homepage = driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[7]"));
		clickonelement(homeback.getHomepage());
	}
}
