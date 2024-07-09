package com.sausedemo.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Utility.BaseClass;

public class ProductCheckOut extends BaseClass{
	static SoftAssert softAssert = new SoftAssert();
	static By btn_addToCart = By.id("add-to-cart");
	static By icon_cart = By.className("shopping_cart_link");
	static By btn_Checkout = By.id("checkout");
	static By txt_fn = By.id("first-name");
	static By txt_ln = By.id("last-name");
	static By txt_pin = By.id("postal-code");
	static By btn_continue = By.id("continue");
	static By btn_Finish = By.id("finish");
	
	public static void addToCart() {
		driver.findElement(btn_addToCart).click();
		Reporter.log("Added to Cart");
	}
	
	public static void cart() {
		driver.findElement(icon_cart).click();
		Reporter.log("Clicked on Cart icon");
	}
	public static void checkout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(btn_Checkout).click();
		Reporter.log("Clicked on Checkout Button");
		driver.findElement(txt_fn).sendKeys("Soumya Ranjan");
		Reporter.log("Entered First Name");
		driver.findElement(txt_ln).sendKeys("Meher");
		Reporter.log("Entered Last Name");
		driver.findElement(txt_pin).sendKeys("500081");
		Reporter.log("Entered PIN Code");
		driver.findElement(btn_continue).click();
		Reporter.log("Clicked on Continue Button");
	}
	public static void assertion() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
        softAssert.assertEquals(title, "Swag Labs", "Title Matched");	
        softAssert.assertAll();
		Reporter.log("Assertion attempted");
	}
	public static void finish() {
		driver.findElement(btn_Finish).click();
		Reporter.log("Clicked on Finish Button");
	}
}
