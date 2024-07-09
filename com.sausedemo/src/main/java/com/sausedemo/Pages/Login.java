package com.sausedemo.Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Utility.BaseClass;

public class Login extends BaseClass {
	 //Objects
    static By txt_username = By.id("user-name");
    static By txt_password = By.id("password");
    static By btn_Login    = By.id("login-button");

    public static void login(){
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(txt_username).sendKeys("standard_user");
        driver.findElement(txt_password).sendKeys("secret_sauce");
        driver.findElement(btn_Login).click();
        Reporter.log("Login Completed");
    }	
	}



