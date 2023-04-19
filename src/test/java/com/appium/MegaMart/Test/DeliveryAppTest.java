package com.appium.MegaMart.Test;

import com.appium.MegaMart.Page.DeliveryAppPage;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
public class DeliveryAppTest extends DeliveryAppPage {
	 
 
	@Test(priority = 1)

	public static void DeliveryAPPLogin() throws MalformedURLException, InterruptedException {
		//DelLoginNegScenarios();
		//	VerifyKeepSignIn();
		ConfigureAppium("DeliveryApp_new.apk");
		VerifyLoginPage();
		ValidCredentials();
		verifyleftMenu();
		
	}
	@Test(priority = 2 )
	public static void DashboardPage() {
		verifyDashboardPage();
		verfiyScheduledPage();
		sixDigitOrderId();
		
	}
	@Test(priority =3)
	public static void NewOrderPickupScreen() throws InterruptedException {
		VerifyNewOrderPickUP();
		VerifyNOCompletePickup();
		VerifyDeliverCompleteBtn();
		verifyPaymentOption();
		
		
		
	}
	@Test(priority = 4 )
	public static void returnOrderList() throws InterruptedException {
		verifyReturnOrderlist();
		verifyReturnOrderPickUpScreen();
		VerifyRefundCouponImg();
		VerifyROCompletePickup();
	}
	@Test(priority = 4 )
	public static void returnOrderListduplicate() throws InterruptedException {
		verifyReturnOrderlist();
		verifyReturnOrderPickUpScreen();
		VerifyRefundCouponImg();
		VerifyROCompletePickup();
	}
}
