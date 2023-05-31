package com.appium.MegaMart.Test;




import com.appium.MegaMart.Page.MobileFrontAppPage;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
public class MobileFrontAppTest extends MobileFrontAppPage {
	 
 
	@Test(priority = 1)

	public static void MobileAPPStoreLogin() throws MalformedURLException, InterruptedException {
		//DelLoginNegScenarios();
		//	VerifyKeepSignIn();
		ConfigureAppium("megamart.customer-1.0-debug.apk");
		verifyLogin();
		validCredentials();
		

	}
	@Test(priority = 2)
	public static void verifyDashboard() throws InterruptedException {
		verifyDashHearder();
		verifyWeekMenu();
		verifyShopByCat();
		verifyBrandStore();
		verifyTopCat();
		verifyFeaturedProd();
		
		
	}
	@Test(priority = 3)
	public static void verifyCategories() throws Exception {
		verifyshopByCategories();
		verifyBrandStoreDetails();
		verifyAllProductScreen();
		verifyProductViewPage();
		verifyRelatedProducts();
		verifyRecentlyBoughtProd();
		
	}
	@Test(priority = 4)
	public static void verifyProfList() throws InterruptedException {
		verifyProfileScreen();
		verifyMyAddressPage();
		verifyCreditsAndCoupons();
		verifyMyOrderPage();
		verifyMyOrderViewPage();
		verifyOrdrePageTotalValue();
		
	}
	@Test(priority = 5 )
	public static void verifyCartScreen() {	
		
		veriyMyCartProdDetails();
		verifyCartLocPromo();
		verifyPaymentDetail();
		
		
		
		
	}
}