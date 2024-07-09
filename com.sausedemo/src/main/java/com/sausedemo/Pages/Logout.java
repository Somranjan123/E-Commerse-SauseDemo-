package com.sausedemo.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Utility.BaseClass;

public class Logout extends BaseClass{
	static By btn_burger = By.id("react-burger-menu-btn");
	static By Logout = By.id("logout_sidebar_link");
	
	public static void logout() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(btn_burger).click();
		driver.findElement(Logout).click();
        Reporter.log("Logged out from the Application");

	}

}
