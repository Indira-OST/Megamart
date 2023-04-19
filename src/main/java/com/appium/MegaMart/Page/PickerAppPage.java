package com.appium.MegaMart.Page;
import org.openqa.selenium.By;

import org.testng.Assert;


import io.appium.java_client.AppiumBy;
public class PickerAppPage extends AbstractPage {
	private static final By loginbtnHome=AppiumBy.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	private static final By megaMartPic =AppiumBy.xpath("//android.widget.ImageView[@content-desc='Contact profile picture'][2]");
	private static final By signIn= AppiumBy.accessibilityId("Sign in");
	private static final By userNameTxt=AppiumBy.xpath("//android.widget.EditText[@text='username']");
	private static final By userIcon= AppiumBy.accessibilityId("User İcon");
	private static final By pswdTxt=AppiumBy.xpath("//android.widget.EditText[@text='password']");
	private static final By pswdLockIcon= AppiumBy.accessibilityId("Password Lock İcon");
	private static final By pswdHideIcon= AppiumBy.accessibilityId("Password Visibility Icon");
	private static final By loginErrorMsg=AppiumBy.xpath("//android.widget.TextView[@text='Either username / password incorrect!']");
	private static final By SignInTxt=AppiumBy.xpath("//android.widget.TextView[@text='Sign in']");
	private static final By poweredByTxt=AppiumBy.xpath("//android.widget.TextView[@text='Powered by T. Choithram & Sons']");
	private static final By pickerNameTxt=AppiumBy.xpath("//android.widget.TextView[@text='Good morning, Siva!']");
	private static final By notificationIcon= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View");
	private static final By notificationTxt=AppiumBy.xpath("//android.widget.TextView[@text='Notifications']");
	private static final By backArrow=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View");
	private static final By drawerMenu= AppiumBy.xpath("(//android.view.View[@content-desc='Contact profile picture'])[2]");
	private static final By viewOrderIcon= AppiumBy.xpath("(//android.view.View[@content-desc='Contact profile picture'])[3]");
	private static final By viewOrdersText= AppiumBy.xpath("//android.widget.TextView[@text='View orders']");
	private static final By viewOrderFwdIcon= AppiumBy.xpath("(//android.view.View[@content-desc='Contact profile picture'])[4]");
	private static final By exploreAllTxt= AppiumBy.xpath("//android.widget.TextView[@text='Explore all']");
	private static final By newOrdersTxt= AppiumBy.xpath("//android.widget.TextView[@text='New orders']");
	private static final By ordersOnHoldTxt= AppiumBy.xpath("//android.widget.TextView[@text='Orders on hold']");
	private static final By orderPickedTxt= AppiumBy.xpath("//android.widget.TextView[@text='Orders picked']");
	private static final By newOrdersNum=AppiumBy.xpath("//android.widget.TextView[@index='3']");
	private static final By ordersPickedNum=AppiumBy.xpath("//android.widget.TextView[@index='6']");
	private static final By ordersOnHoldNum=AppiumBy.xpath("//android.widget.TextView[@text='02']");
	private static final By newOrdersTxtDash=AppiumBy.xpath("//android.widget.TextView[@text='New orders']");
	private static final By dashNOInstant= AppiumBy.xpath("//android.widget.TextView[@text='Instant']");
	private static final By dashNOpickedOrderNum= AppiumBy.xpath("//android.widget.TextView[@text='Pick order number #']");
	private static final By dashNOorderId=AppiumBy.xpath("//android.widget.TextView[@text='MGORD-2023-2515121']");
	private static final By dashFlashIcon= AppiumBy.xpath("(//android.view.View[@content-desc='Order Details'])[1]");
//	private static final By dashSchdIcon= AppiumBy.xpath("(//android.view.View[@content-desc='Keep sign in text box'])[1]");
	private static final By dashSchdIcon=AppiumBy.xpath("//android.widget.TextView[@index='4']");
	private static final By dashSchdTime=AppiumBy.xpath("//android.widget.TextView[@index='5']");
	private static final By dashScrollTxt= AppiumBy.xpath("//android.widget.TextView[@text='Delivery scheduled at 17:00 to 22:00']");
	private static final By orderListBackArrow=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]");
	private static final By orderListText= AppiumBy.xpath("//android.widget.TextView[@text='Order list']");
	private static final By notificationPic=AppiumBy.accessibilityId("Notification picture");
	private static final By notificationNum=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.TextView");
	private static final By orderListAllTxt= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView");
	private static final By onHoldListAllTxt= AppiumBy.xpath("//android.widget.TextView[@text='On hold']");
	private static final By newOrderListNum= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView[2]");
	private static final By onHoldListNum =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.TextView[2]");
	private static final By CompletedTxt= AppiumBy.xpath("//android.widget.TextView[@text='Completed']");
	private static final By CompletedTxtNum=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[5]/android.widget.TextView[2]");
	
	
	
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
	public static void VerifyHeaderText() {
		verify_elementText(pickerNameTxt, "Good morning, Siva!");
		element_isDisplayed(notificationIcon);
		click_btn(notificationIcon);
		verify_elementText(notificationTxt, "Notifications");
		click_btn(backArrow);
		element_isDisplayed(drawerMenu);
		element_isDisplayed(viewOrderIcon);
		element_isDisplayed(viewOrdersText);
		element_isDisplayed(viewOrderFwdIcon);
		element_isDisplayed(exploreAllTxt);
		verify_elementText(newOrdersNum,"25");
		element_isDisplayed(newOrdersTxt);
		element_isDisplayed(ordersOnHoldTxt);
		verify_elementText(ordersOnHoldNum, "02");
		element_isDisplayed(orderPickedTxt);
		verify_elementText(ordersPickedNum, "12");
		verify_elementText(exploreAllTxt, "Explore all");
		
		//driver.quit();
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
	public static void verifyExploreAll() {
		click_btn(exploreAllTxt);
		click_btn(orderListBackArrow);
		click_btn(exploreAllTxt);
		element_isDisplayed(notificationPic);
		verify_elementText(notificationNum, "3");
		verify_elementText(orderListAllTxt, " All ");
		verifyNewOrderListDashboard();

//		newOrdersTxt
//		dashNOorderId - neworder count
//		ordersOnHoldTxt 

	}
	public static void verifyNewOrdersList() {
		click_btn(newOrdersTxt);
		verify_elementText(newOrderListNum , "3");
		verifyNewOrderListDashboard();
		
	}
	public static void verifyOnHoldList() {
		click_btn(onHoldListAllTxt);
		verify_elementText(onHoldListAllTxt, "On hold");
		verify_elementText(onHoldListNum , "2");
		
	}
	public static void verifyCompletedList() {
		click_btn(CompletedTxt );
		verify_elementText(CompletedTxt  , "Completed");
		verify_elementText(CompletedTxtNum  , "2");
		
		
	}
}
