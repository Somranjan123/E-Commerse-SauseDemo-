package com.sausedemo.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Utility.BaseClass;

public class SearchProduct extends BaseClass{
	static SoftAssert softAssert = new SoftAssert();
	
	
	 //Objects
		static By TShirt = By.xpath("//div[text()='15.99']/ancestor::div[@class=\"inventory_item\"]//div[contains(text(),'Sauce Labs Bolt T-Shirt')]");
		
	
	public static void assertion() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
        softAssert.assertEquals(title, "Swag Labs", "Title Matched");	
        softAssert.assertAll();
		Reporter.log("Assertion Attempted");
	}
	
	public static void searchProduct() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(TShirt).click();
		Reporter.log("Product Located");
	}
}
