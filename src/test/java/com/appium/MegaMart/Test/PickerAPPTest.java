package com.appium.MegaMart.Test;

import com.appium.MegaMart.Page.PickerAppPage;


import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PickerAPPTest extends PickerAppPage {

	@Test(priority = 1)

	public static void PickerAPPLogin() throws MalformedURLException, InterruptedException {

		ConfigureAppium("PickerAppV1.0.4.apk");
		LoginPage();
		
		
	}
	@Test(priority = 2)
	public static void LastPrdoWithShareList() throws InterruptedException {
		backbutton();
		backbutton();
		
	}
	//@Test(priority = 2)
	public static void startPickpage() throws InterruptedException {
		
		backbutton();
		backbutton();
		verifyStartPickupPage();
		verifyPickupNextpage();
		verifySubsReason();
		verifySubsProducts();
		
	}

	//@Test(priority = 2)
	public static void DashboardList() throws MalformedURLException, InterruptedException {
		VerifyHeaderText();
		verifyNewOrderListDashboard();
		verifyViewOrdersbtn();
		verifyNewOrdersList();
		verifyOrdersOnHoldbtn();
		verifyOrdersPickedbtn();
		verifyExploreAllBtn();
		

	}
	//@Test(priority = 3)
	public static void verifyDrawerMenu() throws InterruptedException {
		verifyDrawerMenuBtn();	
		verifyUpdateItemLocation();
		verifyLogoutBtn();
	}
}