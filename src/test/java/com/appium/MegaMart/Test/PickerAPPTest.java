package com.appium.MegaMart.Test;

import com.appium.MegaMart.Page.PickerAppPage;


import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PickerAPPTest extends PickerAppPage {

	@Test(priority = 1)

	public static void PickerAPPLogin() throws MalformedURLException, InterruptedException {

		ConfigureAppium("PickerAppV1.0.4.apk");
		LoginPage();
		ConfigureAppium("PickerAppV1.0.4.apk");
		LoginPage();
		ConfigureAppium("PickerAppV1.0.4.apk");
		LoginPage();
	}

	@Test(priority = 2)
	public static void DashboardList() throws MalformedURLException, InterruptedException {
		VerifyHeaderText();
		verifyNewOrderListDashboard();
		verifyExploreAll();
		verifyNewOrdersList();
		verifyOnHoldList();
		verifyCompletedList();
		
		
		
	}

}