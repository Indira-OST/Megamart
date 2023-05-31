package com.appium.MegaMart.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;

public class PickerAppPage extends AbstractPage {
	private static final By loginbtnHome = AppiumBy.xpath(
			"hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	private static final By megaMartPic = AppiumBy
			.xpath("//android.widget.ImageView[@content-desc='Contact profile picture'][2]");
	private static final By signIn = AppiumBy.accessibilityId("Sign in");
	private static final By userNameTxt = AppiumBy.xpath("//android.widget.EditText[@text='username']");
	private static final By userIcon = AppiumBy.accessibilityId("User İcon");
	private static final By pswdTxt = AppiumBy.xpath("//android.widget.EditText[@text='password']");
	private static final By pswdLockIcon = AppiumBy.accessibilityId("Password Lock İcon");
	private static final By pswdHideIcon = AppiumBy.accessibilityId("Password Visibility Icon");
	private static final By loginErrorMsg = AppiumBy
			.xpath("//android.widget.TextView[@text='Either username / password incorrect!']");
	private static final By SignInTxt = AppiumBy.xpath("//android.widget.TextView[@text='Sign in']");
	private static final By poweredByTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Powered by T. Choithram & Sons']");
	private static final By pickerNameTxt = AppiumBy.xpath("//android.widget.TextView[@text='Good morning, Siva!']");
	private static final By notificationIcon = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View");
	private static final By notificationTxt = AppiumBy.xpath("//android.widget.TextView[@text='Notifications']");
	private static final By backArrow = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View");
	private static final By drawerMenu = AppiumBy
			.xpath("(//android.view.View[@content-desc='Contact profile picture'])[2]");
	private static final By viewOrderIcon = AppiumBy
			.xpath("(//android.view.View[@content-desc='Contact profile picture'])[3]");
	private static final By viewOrdersText = AppiumBy.xpath("//android.widget.TextView[@text='View orders']");
	private static final By viewOrderFwdIcon = AppiumBy
			.xpath("(//android.view.View[@content-desc='Contact profile picture'])[4]");
	private static final By exploreAllTxt = AppiumBy.xpath("//android.widget.TextView[@text='Explore all']");
	private static final By newOrdersTxt = AppiumBy.xpath("//android.widget.TextView[@text='New orders']");
	private static final By ordersOnHoldTxt = AppiumBy.xpath("//android.widget.TextView[@text='Orders on hold']");
	private static final By orderPickedTxt = AppiumBy.xpath("//android.widget.TextView[@text='Orders picked']");
	private static final By newOrdersNum = AppiumBy.xpath("//android.widget.TextView[@index='3']");
	private static final By ordersPickedNum = AppiumBy.xpath("//android.widget.TextView[@index='6']");
	private static final By ordersOnHoldNum = AppiumBy.xpath("//android.widget.TextView[@text='02']");
	private static final By newOrdersTxtDash = AppiumBy.xpath("//android.widget.TextView[@text='New orders']");
	private static final By dashNOInstant = AppiumBy.xpath("//android.widget.TextView[@text='Instant']");
	private static final By dashNOpickedOrderNum = AppiumBy
			.xpath("//android.widget.TextView[@text='Pick order number #']");
	private static final By dashNOorderId = AppiumBy.xpath("//android.widget.TextView[@text='MGORD-2023-2515121']");
	private static final By dashFlashIcon = AppiumBy.xpath("(//android.view.View[@content-desc='Order Details'])[1]");
//	private static final By dashSchdIcon= AppiumBy.xpath("(//android.view.View[@content-desc='Keep sign in text box'])[1]");
	private static final By dashSchdIcon = AppiumBy.xpath("//android.widget.TextView[@index='4']");
	private static final By dashSchdTime = AppiumBy.xpath("//android.widget.TextView[@index='5']");
	private static final By dashScrollTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Delivery scheduled at 17:00 to 22:00']");
	private static final By orderListBackArrow = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
	private static final By orderListText = AppiumBy.xpath("//android.widget.TextView[@text='Order list']");
	private static final By notificationPic = AppiumBy.accessibilityId("Notification picture");
	private static final By notificationNum = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView");
	private static final By orderListAllTxt = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView");
	private static final By onHoldListAllTxt = AppiumBy.xpath("//android.widget.TextView[@text='On hold']");
	private static final By newOrderListNum = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView[2]");
	private static final By onHoldListNum = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.TextView[2]");
	private static final By CompletedTxt = AppiumBy.xpath("//android.widget.TextView[@text='Completed']");
	private static final By CompletedTxtNum = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.widget.TextView[2]");
	private static final By onHoldtimingtxt = AppiumBy.xpath("//android.widget.TextView[@text='01:00']");
	private static final By completedTimingTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Delivery scheduled at 16:00 to 21:00']");
	private static final By pickerFullName = AppiumBy.xpath("//android.widget.TextView[@text='Siva Thankesh']");
	private static final By pickerUniqueId = AppiumBy.xpath("//android.widget.TextView[@text='PICKER6451561651']");
	private static final By draweMenuCloseBtn = AppiumBy.xpath("//android.widget.ImageView[@content-desc='Close']");
	private static final By updateItemLocationIcon = AppiumBy.accessibilityId("Update item location");
	private static final By updateItemLocationTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Update item location']");
	private static final By logoutBtnIcon = AppiumBy.accessibilityId("Logout");
	private static final By logoutBtnTxt = AppiumBy.xpath("//android.widget.TextView[@text='Logout']");
	private static final By updateLocationItemName = AppiumBy
			.xpath("//android.widget.TextView[@text='Carrot Australia']");
	private static final By updateLocationBarcode = AppiumBy.xpath("//android.widget.TextView[@text='Barcode']");
	private static final By updateLocationSkucode = AppiumBy.xpath("//android.widget.TextView[@text='SKU code']");
	private static final By updateLocationAisle = AppiumBy.xpath("//android.widget.TextView[@text='Aisle']");
	private static final By updateLocationAisleA = AppiumBy.xpath("//android.widget.TextView[@text='Aisle A']");
	private static final By updateLocationAisleB = AppiumBy.xpath("//android.widget.TextView[@text='Aisle B']");
	private static final By updateLocationBay = AppiumBy.xpath("//android.widget.TextView[@text='Bay']");
	private static final By updateLocationAisleBox = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[6]");
	private static final By updateLocationBayBox = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[10]");
	private static final By updateLocationUpdateBtn = AppiumBy.xpath("//android.widget.TextView[@text='Update']");
	private static final By startPickupBtn = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[14]/android.widget.Button");
	private static final By startPickupOrderId = AppiumBy
			.xpath("//android.widget.TextView[@text='Pickup order MGORD-2023-2515121']");
	private static final By startPickupNotifyPic = AppiumBy.accessibilityId("Notification picture");
	private static final By startPickupNotifyNum = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView");
	private static final By startPickupCusNameTxt = AppiumBy.xpath("//android.widget.TextView[@text='Customer name']");
	private static final By startPickupCusName = AppiumBy.xpath("//android.widget.TextView[@text='Siva Thangesh']");
	private static final By startPickupMobNumTxt = AppiumBy.xpath("//android.widget.TextView[@text='Mobile number']");
	private static final By startPickupMobNum = AppiumBy.xpath("//android.widget.TextView[@text='+971 4368 4026']");
	private static final By startPickupNoOfOrderTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='No of ordered items']");
	private static final By startPickupNoOfOrder = AppiumBy.xpath("//android.widget.TextView[@text='05']");
	private static final By startPickupSubsTxt = AppiumBy.xpath("//android.widget.TextView[@text='Substitute']");
	private static final By startPickupsubsYesWCon = AppiumBy
			.xpath("//android.widget.TextView[@text='Yes, with confirmation']");
	private static final By startPickupsubsDeliSchdTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Delivery scheduled']");
	private static final By startPickupsubsDeliTime = AppiumBy
			.xpath("//android.widget.TextView[@text='27-01-2023, 13:00 to 14:00']");
	private static final By startPickupCustNote = AppiumBy.xpath("//android.widget.TextView[@text='Customer note']");
	private static final By startPickupCusIcon = AppiumBy
			.xpath("(//android.widget.ImageView[@content-desc='Start Picking'])[2]");
	private static final By startPickupCusNoteDesc = AppiumBy.xpath(
			"//android.widget.TextView[@text='Please keep the orders in the delivery box. I’ll not available at the time of delivery.']");
	private static final By startPickupBayNum = AppiumBy.xpath("//android.widget.TextView[@text='BAY - A04B']");
	private static final By startPickupProductName = AppiumBy
			.xpath("//android.widget.TextView[@text='Carrot Australia']");
	private static final By startPickupQuantity = AppiumBy.xpath("//android.widget.TextView[@text='1Kg x 2']");
	private static final By startPickupBarCode = AppiumBy
			.xpath("//android.widget.TextView[@text='Bar code : 6546465161611']");
	private static final By startPickupSKUCode = AppiumBy
			.xpath("//android.widget.TextView[@text='SKU code : 6546465161341']");
	private static final By startPickupNewFlashIcon = AppiumBy
			.xpath("(//android.view.View[@content-desc='Order Details'])[1]");
	private static final By startPickupStartPickupBtn = AppiumBy
			.xpath("//android.widget.TextView[@text='Start pickup']");
	private static final By startPickupBackArrow = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
	private static final By pickupNextProdNmHeader = AppiumBy
			.xpath("//android.widget.TextView[@text='Pickup Carrot Australia 1Kg x 2']");
	private static final By pickupNextItemAvailTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Item available in stock for pickup!']");
	private static final By pickupNextRackPositionTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Rack position']");
	private static final By pickupNextRackPosition = AppiumBy
			.xpath("//android.widget.TextView[@text='BAY03B / 047-015120 ']");
	private static final By pickupNextBarCodeNum = AppiumBy.xpath("//android.widget.TextView[@text='591261056164130']");
	private static final By pickupNextItemSKUNum = AppiumBy.xpath("//android.widget.TextView[@text='54145131251']");
	private static final By pickupNextAvailSapTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Available in SAP']");
	private static final By pickupNextAvailSap = AppiumBy.xpath("//android.widget.TextView[@text='51.545Kg']");
	private static final By pickupNextPickupQuan = AppiumBy.xpath("//android.widget.TextView[@text='Pickup quantity']");
	private static final By pickupNext1Kg = AppiumBy.xpath("//android.widget.TextView[@text='1 Kg']");
	private static final By pickupNextX = AppiumBy.xpath("//android.widget.TextView[@text='x']");
	private static final By pickupNext2 = AppiumBy.xpath("//android.widget.TextView[@text='2']");
	private static final By pickupNextRemovebtn = AppiumBy.xpath("//android.widget.TextView[@text='Remove']");
	private static final By pickupNextRemoveIcon = AppiumBy.xpath("//android.view.View[@content-desc='Start Picking']");
	private static final By pickupNextShareList = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View");
	private static final By pickupNextSubsIcon = AppiumBy.accessibilityId("Substitute");
	private static final By pickupNextSubsTxt = AppiumBy.xpath("//android.widget.TextView[@text='Substitute']");
	private static final By pickupNextBacktoOrder = AppiumBy.xpath("//android.widget.TextView[@text='Back to order']");
	private static final By pickupNextBacktoOrderId = AppiumBy
			.xpath("//android.widget.TextView[@text='MGORD-2023-2515121']");
	private static final By pickupNextPickupnextbtn = AppiumBy.xpath("//android.widget.TextView[@text='Pickup next']");
	private static final By pickupNextpickupNextprodId = AppiumBy
			.xpath("//android.widget.TextView[@text='capsicum green ( 2/5 )']");

	private static final By pickupNextSubsReason = AppiumBy
			.xpath("//android.widget.TextView[@text='Select reason for substitute!']");
	private static final By pickupNextSubsReasonNotinshelf = AppiumBy
			.xpath("//android.widget.TextView[@text='Not in shelf']");
	private static final By pickupNextSubsReasonCustomerrequest = AppiumBy
			.xpath("//android.widget.TextView[@text='Customer request']");
	private static final By pickupNextSubsReasonBadquality = AppiumBy
			.xpath("//android.widget.TextView[@text='Bad quality']");
	private static final By pickupNextSubsReasonNominimumshelflife = AppiumBy
			.xpath("//android.widget.TextView[@text='No minimum shelf life']");
	private static final By pickupNextSubReasonsPhysicallynotavailable = AppiumBy
			.xpath("//android.widget.TextView[@text='Physically not available']");
	private static final By pNSRNotInshelfRBtn = AppiumBy
			.xpath("(//android.widget.ImageView[@content-desc='Unchecked'])[1]");
	private static final By PNSrScanGun = AppiumBy.accessibilityId("Scan gun");
	private static final By PNSrScanGunTxt = AppiumBy
			.xpath("//android.widget.TextView[@text='Scan substitute']");
	private static final By PNSrProdName = AppiumBy
			.xpath("//android.widget.TextView[@text='Carrot North India ']");
	private static final By PNSrprodAmount = AppiumBy
			.xpath("//android.widget.TextView[@text='6.45 AED / kg']");
	private static final By pNSRSubsOne = AppiumBy
			.xpath("(//android.widget.ImageView[@content-desc='Start Picking'])[1]");
	private static final By LasProdWShareListBtn = AppiumBy
			.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void LoginPage() throws InterruptedException {
		Thread.sleep(2000);
		click_btn(loginbtnHome);
		element_isDisplayed(megaMartPic);
		verify_elementText(userNameTxt, "username");
		element_isDisplayed(userIcon);
		verify_elementText(pswdTxt, "password");
		element_isDisplayed(pswdLockIcon);
		element_isDisplayed(pswdHideIcon);
		verify_elementText(loginErrorMsg, "Either username / password incorrect!");
		verify_elementText(SignInTxt, "Sign in");
		verify_elementText(poweredByTxt, "Powered by T. Choithram & Sons");
		click_btn(signIn);
	}

	public static void VerifyHeaderText() throws InterruptedException {
		verify_elementText(pickerNameTxt, "Good morning, Siva!");
		element_isDisplayed(notificationIcon);
		click_btn(notificationIcon);
		verify_elementText(notificationTxt, "Notifications");
		Thread.sleep(1000);
		click_btn(backArrow);
		Thread.sleep(1000);
		element_isDisplayed(drawerMenu);
		element_isDisplayed(viewOrderIcon);
		element_isDisplayed(viewOrdersText);
		element_isDisplayed(viewOrderFwdIcon);
		element_isDisplayed(exploreAllTxt);
		verify_elementText(newOrdersNum, "25");
		element_isDisplayed(newOrdersTxt);
		element_isDisplayed(ordersOnHoldTxt);
		verify_elementText(ordersOnHoldNum, "02");
		element_isDisplayed(orderPickedTxt);
		verify_elementText(ordersPickedNum, "12");
		verify_elementText(exploreAllTxt, "Explore all");

		// driver.quit();
	}

	public static void verifyNewOrderListDashboard() {
		verify_elementText(newOrdersTxtDash, "New orders");

		verify_elementText(dashNOInstant, "Instant");
		verify_elementText(dashNOpickedOrderNum, "Pick order number #");
		verify_elementText(dashNOorderId, "MGORD-2023-2515121");
		element_isDisplayed(dashFlashIcon);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Delivery scheduled at 17:00 to 17:30\"));"));
		verify_elementText(dashSchdTime, "Delivery scheduled at 17:00 to 17:30");
		element_isDisplayed(dashSchdIcon);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Delivery scheduled at 17:00 to 22:00\"));"));
		verify_elementText(dashScrollTxt, "Delivery scheduled at 17:00 to 22:00");

	}

	public static void verifyViewOrdersbtn() {
		click_btn(viewOrdersText);
		element_isDisplayed(notificationPic);
		verify_elementText(notificationNum, "3");
		verify_elementText(orderListAllTxt, " All ");
		verifyNewOrderListDashboard();
		click_btn(orderListBackArrow);

//		newOrdersTxt
//		dashNOorderId - neworder count
//		ordersOnHoldTxt 

	}

	public static void verifyNewOrdersList() {
		click_btn(newOrdersTxt);
		element_isDisplayed(newOrdersTxt);
		verify_elementText(newOrderListNum, "3");
		element_isDisplayed(dashFlashIcon);
		verify_elementText(dashNOInstant, "Instant");
		click_btn(orderListBackArrow);
	}

	public static void verifyOrdersOnHoldbtn() {
		click_btn(ordersOnHoldTxt);
		element_isDisplayed(onHoldListAllTxt);
		verify_elementText(onHoldListAllTxt, "On hold");
		verify_elementText(onHoldListNum, "2");
		verify_elementText(onHoldtimingtxt, "01:00");
		click_btn(orderListBackArrow);

	}

	public static void verifyOrdersPickedbtn() {
		click_btn(orderPickedTxt);
		element_isDisplayed(CompletedTxt);
		verify_elementText(CompletedTxt, "Completed");
		verify_elementText(completedTimingTxt, "Delivery scheduled at 16:00 to 21:00");
		verify_elementText(CompletedTxtNum, "2");
		click_btn(orderListBackArrow);

	}

	public static void verifyExploreAllBtn() throws InterruptedException {

		click_btn(exploreAllTxt);
		element_isDisplayed(newOrdersTxt);
		element_isDisplayed(onHoldListAllTxt);
		element_isDisplayed(CompletedTxt);
		click_btn(orderListBackArrow);
		Thread.sleep(1000);
	}

	public static void verifyDrawerMenuBtn() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Good morning, Siva!\"));"));
		click_btn(drawerMenu);
		verify_elementText(pickerFullName, "Siva Thankesh");
		verify_elementText(pickerUniqueId, "PICKER6451561651");
		element_isDisplayed(updateItemLocationIcon);
		verify_elementText(updateItemLocationTxt, "Update item location");
		verify_elementText(logoutBtnTxt, "Logout");
		element_isDisplayed(logoutBtnIcon);
		click_btn(draweMenuCloseBtn);
		element_isDisplayed(exploreAllTxt);

	}

	public static void verifyUpdateItemLocation() throws InterruptedException {
		click_btn(drawerMenu);
		click_btn(updateItemLocationTxt);
		Thread.sleep(1000);
		String location = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView"))
				.getText();
		System.out.println("The location is" + location);
		Assert.assertEquals(location, "Update item location ");
		verify_elementText(updateLocationItemName, "Carrot Australia");
		verify_elementText(updateLocationBarcode, "Barcode");
		verify_elementText(updateLocationSkucode, "SKU code");
		verify_elementText(updateLocationAisle, "Aisle");
		verify_elementText(updateLocationAisleA, "Aisle A");
		verify_elementText(updateLocationAisleB, "Aisle B");
		verify_elementText(updateLocationBay, "Bay");
		element_isDisplayed(updateLocationAisleBox);
		element_isDisplayed(updateLocationBayBox);
		click_btn(updateLocationUpdateBtn);
		element_isDisplayed(exploreAllTxt);

	}

	public static void verifyLogoutBtn() {
		click_btn(drawerMenu);
		click_btn(logoutBtnTxt);
		click_btn(signIn);
	}

	public static void backbutton() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
	}

	public static void verifyStartPickupPage() {
		click_btn(startPickupBtn);
		verify_elementText(startPickupOrderId, "Pickup order MGORD-2023-2515121");
		element_isDisplayed(startPickupNotifyPic);
		element_isDisplayed(startPickupNotifyNum);
		verify_elementText(startPickupCusNameTxt, "Customer name");
		verify_elementText(startPickupCusName, "Siva Thangesh");
		verify_elementText(startPickupMobNumTxt, "Mobile number");
		verify_elementText(startPickupMobNum, "+971 4368 4026");
		verify_elementText(startPickupNoOfOrderTxt, "No of ordered items");
		verify_elementText(startPickupNoOfOrder, "05");
		verify_elementText(startPickupSubsTxt, "Substitute");
		verify_elementText(startPickupsubsYesWCon, "Yes, with confirmation");
		verify_elementText(startPickupsubsDeliSchdTxt, "Delivery scheduled");
		verify_elementText(startPickupsubsDeliTime, "27-01-2023, 13:00 to 14:00");
		verify_elementText(startPickupCustNote, "Customer note");
		verify_elementText(startPickupCusNoteDesc,
				"Please keep the orders in the delivery box. I’ll not available at the time of delivery.");
		element_isDisplayed(startPickupCusIcon);
		verify_elementText(startPickupBayNum, "BAY - A04B");
		verify_elementText(startPickupProductName, "Carrot Australia");
		verify_elementText(startPickupQuantity, "1Kg x 2");
		verify_elementText(startPickupBarCode, "Bar code : 6546465161611");
		verify_elementText(startPickupSKUCode, "SKU code : 6546465161341");
		element_isDisplayed(startPickupNewFlashIcon);
		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BAY - A05D\"));"));
		verify_elementText(startPickupStartPickupBtn, "Start pickup");
		click_btn(startPickupStartPickupBtn);
		click_btn(startPickupBackArrow);
		verify_elementText(startPickupCustNote, "Customer note");
		click_btn(startPickupStartPickupBtn);

	}

	public static void verifyPickupNextpage() {
		verify_elementText(pickupNextProdNmHeader, "Pickup Carrot Australia 1Kg x 2");
		verify_elementText(startPickupProductName, "Carrot Australia");
		verify_elementText(startPickupQuantity, "1Kg x 2");
		verify_elementText(pickupNextItemAvailTxt, "Item available in stock for pickup!");
		verify_elementText(pickupNextRackPositionTxt, "Rack position");
		verify_elementText(pickupNextRackPosition, "BAY03B / 047-015120 ");
		verify_elementText(updateLocationBarcode, "Barcode");
		verify_elementText(updateLocationSkucode, "SKU code");
		verify_elementText(pickupNextBarCodeNum, "591261056164130");
		verify_elementText(pickupNextItemSKUNum, "54145131251");
		verify_elementText(pickupNextAvailSapTxt, "Available in SAP");
		verify_elementText(pickupNextAvailSap, "51.545Kg");
		verify_elementText(pickupNextPickupQuan, "Pickup quantity");
		verify_elementText(pickupNext1Kg, "1 Kg");
		verify_elementText(pickupNext2, "2");
		verify_elementText(pickupNextX, "x");

		element_isDisplayed(pickupNextRemoveIcon);

		verify_elementText(pickupNextRemovebtn, "Remove");
		element_isDisplayed(pickupNextSubsIcon);
		
		verify_elementText(pickupNextSubsTxt, "Substitute");
		verify_elementText(pickupNextBacktoOrder, "Back to order");
//		boolean backorderId=driver.findElement(pickupNextBacktoOrderId).isDisplayed();
//		if (backorderId ==  true) {
//			verify_elementText(pickupNextBacktoOrderId, "MGORD-2023-2515121");
//		}
//		else
//		{
//			driver.findElement(pickupNextProdNmHeader).isDisplayed();
//		}
//		

	}

	public static void verifySubsReason() {
		click_btn(pickupNextSubsTxt);

		verify_elementText(pickupNextSubsReason, "Select reason for substitute!");
		verify_elementText(pickupNextSubsReasonNotinshelf, "Not in shelf");
		verify_elementText(pickupNextSubsReasonCustomerrequest, "Customer request");
		verify_elementText(pickupNextSubsReasonBadquality, "Bad quality");
		verify_elementText(pickupNextSubsReasonNominimumshelflife, "No minimum shelf life");
		verify_elementText(pickupNextSubReasonsPhysicallynotavailable, "Physically not available");
		element_isDisplayed(pNSRNotInshelfRBtn);
		click_btn(pNSRNotInshelfRBtn);
		
}
	public static void verifySubsProducts() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Carrot Australia\"));"));
		verifyPickupNextpage();
		element_isDisplayed(PNSrScanGun);
		verify_elementText(PNSrScanGunTxt, "Scan substitute");
		verify_elementText(startPickupBayNum, "BAY - A04B");
		verify_elementText(PNSrProdName, "Carrot North India ");
		verify_elementText(PNSrprodAmount, "6.45 AED / kg");
		verify_elementText(pickupNext1Kg, "1 Kg");
//		boolean nextBtn=driver.findElement(pickupNextPickupnextbtn).isEnabled();
//		if(nextBtn == true) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		
		click_btn(pNSRSubsOne);
	//	click_btn(pickupNextPickupnextbtn);
//		if(nextBtn == true) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		
		
		
	}
	
	
	public static void verifyLastProdshareList() {
		click_btn(LasProdWShareListBtn);
		verifyPickupNextpage();
		verifySubsReason();
		verifySubsProducts();
		click_btn(pickupNextShareList);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
