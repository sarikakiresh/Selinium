package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdowndemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sarika\\eclipse-workspace\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
	 driver.manage().window().maximize();
	 WebElement multiple_DD = driver.findElement(By.xpath("//select[@multiple ='multiple']"));
     Select s = new Select(multiple_DD);
	 //IS MULTIPLE
     boolean multiple = s.isMultiple();
     System.out.println("mutiple or not:"+multiple);
     //get options
     
     System.out.println("***All options***");
     List<WebElement> all_options = s.getOptions();
     
     for(WebElement options:all_options) {
    	 System.out.println(options.getText());
     }
     int size = all_options.size();
     System.out.println("size:"+size);
     //multiple values
     for(int i=0;i<size;i++) {
    	 if(i==0||i==2||i==3) {
    		 s.selectByIndex(i);
    		 
    	 }
     }
     //get all selected options
     
     System.out.println("**selected options**");

     List<WebElement>allselectedoptions = s.getAllSelectedOptions();
     
     for(WebElement selected_options: allselectedoptions) {
    
    	 System.out.println(selected_options.getText());
     }//get first selected options
    	 WebElement firstSelectedOption = s.getFirstSelectedOption();
    	 
    	 String first_option = firstSelectedOption.getText();
    	 
    	 System.out.println("First option:"+first_option);
     }
     }
	


