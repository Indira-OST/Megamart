package com.appium.MegaMart.Page;

import java.net.MalformedURLException;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class AbstractPage {
	public static AndroidDriver driver;

	public static void ConfigureAppium(String APKfile) throws MalformedURLException {
	
		 UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("deliveryApp");
		
			options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			options.setApp("C:\\Users\\indira.k\\eclipse-workspace\\Appium_MegaMart\\src\\test\\java\\resources\\"+APKfile+"");
			
			//("C:\\Users\\indira.k\\eclipse-workspace\\Appium_MegaMart\\src\\test\\java\\resources\\PickerAppV1.0.4.apk");
			//("C:\\Users\\indira.k\\eclipse-workspace\\Appium_MegaMart\\src\\test\\java\\resources\\DeliveryApp_new.apk");
			
			driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			// xpath, id, accessibilityId, classname, andriodUIAutomator
	}
	public static void send_keys(By locator, String name) {
		driver.findElement(locator).sendKeys(name);
		
	}
	
	public static void keysEventDelete(By locator, String name) {
		driver.findElement(locator).sendKeys(name);
		
	}

		public static void click_btn(By locator) {
			driver.findElement(locator).click();
		}
		public static void element_isDisplayed(By locator) {
			driver.findElement(locator).isDisplayed();
		}
		public static void verify_elementText(By locator,String ExpectedTxt) {
			String actualtxt=driver.findElement(locator).getText();
			Assert.assertEquals(actualtxt, ExpectedTxt);
		}
//	public void tearDown() {
//		driver.quit();
//	}
}