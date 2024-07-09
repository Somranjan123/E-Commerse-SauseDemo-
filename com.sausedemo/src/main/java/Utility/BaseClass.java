package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClass {
	 public static WebDriver driver;
	 public static void openApplication(){
	     driver = new FirefoxDriver();
	     driver.get("https://www.saucedemo.com");
	     Reporter.log("Application Opened");
	 }
	 public static void closeApplication(){
	     driver.close();
	     Reporter.log("Application Closed");
	 }
	 }


