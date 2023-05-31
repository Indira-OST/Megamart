package com.appium.MegaMart.Page;

import java.net.MalformedURLException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mongodb.client.model.geojson.Point;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class DeliveryAppPage extends AbstractPage {
	private static final By EmailId = AppiumBy.id("com.megamart.delivery:id/edtUserName");
	private static final By Password = AppiumBy.id("com.megamart.delivery:id/edtPasswordNew");
	private static final By SignIn = AppiumBy.id("com.megamart.delivery:id/tv_sign_in");
	private static final By ToastMsg = AppiumBy.id("com.megamart.delivery:id/snackbar_text");
	private static final By keepSignin = AppiumBy.id("com.megamart.delivery:id/checkBox");
	private static final By hiddenPswd = AppiumBy.id("com.megamart.delivery:id/img_hide_password");
	private static final By leftImgLines = AppiumBy.id("com.megamart.delivery:id/imgMenu");
	private static final By DelName = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
	private static final By GreetingTxt = AppiumBy.id("com.megamart.delivery:id/tvWelcome");
	private static final By LocationName = AppiumBy.id("com.megamart.delivery:id/tvAddress");
	private static final By InstantTab = AppiumBy.id("com.megamart.delivery:id/tvInstant");
	private static final By InstantTabNo = AppiumBy.id("com.megamart.delivery:id/tvInstantNo");
	//private static final By ScheduledTab = AppiumBy.id("com.megamart.delivery:id/tvScheduled");
	//private static final By ScheduledTabNo = AppiumBy.id("com.megamart.delivery:id/tvScheduledNo");
//	private static final By OrderTiming = AppiumBy.id("com.megamart.delivery:id/tvOrderDetails");
	private static final By LocationImg = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.ImageView");
	private static final By ImgTravellerId = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.RelativeLayout[3]/android.widget.ImageView");
	private static final By CusAddress = AppiumBy
			.xpath("//android.widget.TextView[@text='2527+C5H, Green Community Village, Dubai - UAE']");
	private static final By DistancebyKms = AppiumBy.xpath("//android.widget.TextView[@text='6.2 Kms']");
	private static final By FlashIcon = AppiumBy
			.xpath("(//android.widget.ImageView[@resource-id='com.megamart.delivery:id/imgOrderStatus'])[1]");
	private static final By clkInstantTab = AppiumBy.id("com.megamart.delivery:id/llInstant");
	private static final By clkSchedTab = AppiumBy.id("com.megamart.delivery:id/llScheduled");
//	private static final By sixDigit = AppiumBy.xpath(
	//		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout[2]");
	private static final By deliNameRetOrder = AppiumBy.id("com.megamart.delivery:id/tvUserName");
	private static final By delivProfPic = AppiumBy.id("com.megamart.delivery:id/ivProfile");
	private static final By leftmenuCancel = AppiumBy.id("com.megamart.delivery:id/imgClose");

	private static final By retrunOrderImg = AppiumBy
			.xpath("(//android.widget.ImageView[@resource-id='com.megamart.delivery:id/imgMenuLeft'])[1]");
	private static final By logoutImg = AppiumBy
			.xpath("(//android.widget.ImageView[@resource-id='com.megamart.delivery:id/imgMenuLeft'])[2]");
	private static final By LogoutText = AppiumBy.xpath("//android.widget.TextView[@text='Logout']");
	private static final By ReturnOrderNumber = AppiumBy.xpath("//android.widget.TextView[@text='15']");
	private static final By returnOrderBackArrow = AppiumBy.id("com.megamart.delivery:id/img_back_arrow");
	private static final By returnOrderTitle = AppiumBy.id("com.megamart.delivery:id/title");
	//private static final By returnOrderLocationImg = AppiumBy
	///		.id("//android.widget.ImageView[@resource-id='com.megamart.delivery:id/imgOrder']");
	private static final By returnOrderNum = AppiumBy.xpath("(//android.widget.TextView[@text='RETURN ORDER#'])[1]");
	private static final By returnOrderID = AppiumBy.xpath("//android.widget.TextView[@text='MGORD-2023-2515121']");
	private static final By travellerImgId = AppiumBy
			.xpath("//android.widget.ImageView[@resource-id='com.megamart.delivery:id/imgOrder']");
	private static final By ROCustomerNamePickUp = AppiumBy.id("com.megamart.delivery:id/tvCustomerName");
	private static final By ROCusNmPickup = AppiumBy.id("com.megamart.delivery:id/tvCustomerNameValue");
	private static final By ROOrderStatusPickup = AppiumBy.xpath("//android.widget.TextView[@text='Order status']");
	private static final By ROOrderStatusReqPickup = AppiumBy.id("com.megamart.delivery:id/tvOrderStatus");
	//private static final By RONoOfRetPickup = AppiumBy.xpath("//android.widget.TextView[@text='No of return items']");
	private static final By RORetCountPickup = AppiumBy.id("com.megamart.delivery:id/tvReturnCount");
	private static final By RORefCouValPickup = AppiumBy
			.xpath("//android.widget.TextView[@text='Refund coupon value']");
	private static final By RORefCopCountPickup = AppiumBy.id("com.megamart.delivery:id/tvCouponValue");
	private static final By RORefCoupImg = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.ImageView[1]");
	private static final By MegaMartImg = AppiumBy.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.ImageView[2]");
	private static final By RefcoupText = AppiumBy.id("com.megamart.delivery:id/tvLabelRefundCoupon");
	private static final By RefcoupVal = AppiumBy.id("com.megamart.delivery:id/tvAmount");
	private static final By RefcoupRup = AppiumBy.id("com.megamart.delivery:id/tvRupees");
	private static final By RefcoupValidity = AppiumBy.id("com.megamart.delivery:id/tvCouponValidity");
	private static final By CustAddress = AppiumBy.id("com.megamart.delivery:id/tvDeliverAddress");
	private static final By CustAddressDetail = AppiumBy.id("com.megamart.delivery:id/tvDeliverAddressValue");
	//private static final By CallCustomerTxt = AppiumBy.id("com.megamart.delivery:id/btnCallCustomer");
	private static final By GetDirTxt = AppiumBy.id("com.megamart.delivery:id/btnGetDirection");
	//private static final By prodImgage = AppiumBy
//			.xpath("//android.widget.ImageView[@resource-id='com.megamart.delivery:id/ivItemImage']");
//	private static final By ROProdName = AppiumBy.xpath("//android.widget.TextView[@text='Capsicum orange']");
	private static final By ROCompPickup = AppiumBy.id("com.megamart.delivery:id/tvPickupAction");
	private static final By sixDigitText = AppiumBy.id("com.megamart.delivery:id/tvTitle");
	private static final By SixDigitOrderId = AppiumBy.id("com.megamart.delivery:id/otp_view");
	private static final By sixDigitCancelBtn = AppiumBy.id("com.megamart.delivery:id/tvCancel");
	private static final By sixdigitConfirmBtn = AppiumBy.id("com.megamart.delivery:id/tvConfirm");
	private static final By NOOrderIdTitlePickup = AppiumBy.id("com.megamart.delivery:id/title");
	private static final By NoCODTitlePickUP = AppiumBy.id("com.megamart.delivery:id/tvOrderDetails");
	private static final By PaymentStatus= AppiumBy.id("com.megamart.delivery:id/tvPaymentStatus");
	private static final By totalAmount= AppiumBy.id("com.megamart.delivery:id/tvTotalPayment");
	private static final By totalAmountSymbol = AppiumBy.id("com.megamart.delivery:id/tvTotalSymbol");
	private static final By NofPackCount=AppiumBy.id("com.megamart.delivery:id/tvNoOrderItmes");
	private static final By schedTime=AppiumBy.id("com.megamart.delivery:id/tvOrderScheduleTime");
	private static final By packageIcon=AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.megamart.delivery:id/ivIcon']");
	private static final By DryPakcage = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.delivery:id/tvPkgName'])[1]");
	private static final By FrozenPakcage = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.delivery:id/tvPkgName'])[2]");
	private static final By ChillerPakcage = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.delivery:id/tvPkgName'])[3]");
	private static final By CudSignPad= AppiumBy.xpath("//android.widget.TextView[@resource-id='com.megamart.delivery:id/signaturePad']");
	private static final By CollectPaymentTxt=AppiumBy.id("com.megamart.delivery:id/tvTitle");
	private static final By CollectPayAmtTxt=AppiumBy.id("com.megamart.delivery:id/tvAmount");
	private static final By collectpayRupeesTxt=AppiumBy.id("com.megamart.delivery:id/tvRupees");
	private static final By CreditCardTxt= AppiumBy.id("com.megamart.delivery:id/tvCreditDebit");
	private static final By CreditCardSelect= AppiumBy.id("com.megamart.delivery:id/ivCardSelect");
	private static final By CashOnHandTxt= AppiumBy.id("com.megamart.delivery:id/tvCashHand");
	private static final By CashOnSelect= AppiumBy.id("com.megamart.delivery:id/ivCashselect");
	private static final By CompletePaymentTxt= AppiumBy.id("com.megamart.delivery:id/tvCompleteDelivery");
	private static final By CompletePaymentClsBtn= AppiumBy.id("com.megamart.delivery:id/ivCloseDialog");
	private static final By alertPaymentOPtion = AppiumBy.xpath("//android.widget.TextView[@text='Please your payment option']");
	
	
	
	public static String OrderIDTxt = "ORDER #";
	public static String OrderNumTxt = "MGORD-2023-2515121";
	public static String CusName = "KIRUPA KARAN";
	private static final By returnOrderText = AppiumBy.xpath("//android.widget.TextView[@text='Return orders']");

	public static By txtPath(String Text) {
		return AppiumBy.xpath("//android.widget.TextView[@text='" + Text + "']");

	}

	public static void ValidCredentials() {
		send_keys(EmailId, "test");
		send_keys(Password, "test");
		click_btn(SignIn);
	}

	public static void VerifyLoginPage() {
		String email = driver.findElement(EmailId).getText();
		Assert.assertEquals(email, "username");
		String pass = driver.findElement(Password).getText();
		Assert.assertEquals(pass, "password");
		String sign = driver.findElement(SignIn).getText();
		Assert.assertEquals(sign, "Sign in");
		String signInChkbox = driver.findElement(keepSignin).getText();
		Assert.assertEquals(signInChkbox, "Keep sign in");
		Boolean a = driver.findElement(hiddenPswd).isDisplayed();
		System.out.println(a);

	}

	public static void DelLoginNegScenarios() {

		send_keys(EmailId, "test");
		click_btn(SignIn);

		String PswdMsg = driver.findElement(ToastMsg).getText();
		Assert.assertEquals(PswdMsg, "Enter your password");

		send_keys(EmailId, "");
		send_keys(Password, "test");
		click_btn(SignIn);
		String PswdMsg1 = driver.findElement(Password).getText();
		Assert.assertEquals(PswdMsg1, "••••");
		String userMsg = driver.findElement(ToastMsg).getText();
		Assert.assertEquals(userMsg, "Enter your username");

		send_keys(EmailId, "");
		send_keys(Password, "");
		click_btn(SignIn);
		String usermsg = driver.findElement(ToastMsg).getText();
		Assert.assertEquals(usermsg, "Enter your username");
	}

	public static void ValidLogin() {
		send_keys(EmailId, "test");
		send_keys(Password, "test");
		click_btn(SignIn);
	}

	public static void VerifyKeepSignIn() throws MalformedURLException, InterruptedException {
		send_keys(EmailId, "test");
		send_keys(Password, "test");
		click_btn(hiddenPswd);
		click_btn(keepSignin);
		click_btn(SignIn);
//			driver.pressKey(new KeyEvent(AndroidKey.HOME));
//			driver.pressKey(new KeyEvent(AndroidKey.SEARCH));
//			driver.pressKey(new KeyEvent(AndroidKey.M));
//			driver.pressKey(new KeyEvent(AndroidKey.E));
//			driver.pressKey(new KeyEvent(AndroidKey.G));
//			Thread.sleep(5000);
//			driver.startActivity(new Activity("com.megamart.delivery","com.megamart.delivery.view.LoginActivity"));
//		driver.startActivity(new Activity("com.megamart.delivery","com.megamart.delivery.view.HomeActivity"));
//			//ConfigureAppium("DeliveryApp (1).apk");
//			//String welMega=driver.findElement(AppiumBy.id("com.megamart.delivery:id/tvWelcome")).getText();
//			//Assert.assertEquals(welMega, "Welcome to Megamart!");
//			click_btn(leftImgLines);
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Logout']")).click();		

	}

	public static void verifyDashboardPage() {
		String deliverName = driver.findElement(DelName).getText();
		Assert.assertEquals(deliverName, "Hi, Kirupa");
		String greTxt = driver.findElement(GreetingTxt).getText();
		Assert.assertEquals(greTxt, "Welcome to Megamart!");
		String locNm = driver.findElement(LocationName).getText();
		Assert.assertEquals(locNm, "Amwaj Lagon");
		String InstTab = driver.findElement(InstantTab).getText();
		Assert.assertEquals(InstTab, "Instant");
		Boolean tabno = driver.findElement(InstantTabNo).isDisplayed();
		System.out.println(tabno);
		Assert.assertEquals(true, true);

	}

	public static void verfiyScheduledPage() {
		boolean locImg = driver.findElement(LocationImg).isDisplayed();
		System.out.println(locImg);
		Assert.assertEquals(true, true);
		click_btn(clkInstantTab);
		// String orderTxt = driver.findElement(OrderIDTxt).getText();
		String orderTxt = driver.findElement(txtPath("MGORD-2023-2515119")).getText();
		Assert.assertEquals(orderTxt, "MGORD-2023-2515119");
		click_btn(clkSchedTab);
		// String ordernumTxt = driver.findElement(OrderNumTxt).getText();
		String ordernumTxt = driver.findElement(txtPath(OrderNumTxt)).getText();
		Assert.assertEquals(ordernumTxt, "MGORD-2023-2515121");
		// String CusNameText = driver.findElement(CusName).getText();
		String CusNameText = driver.findElement(txtPath(CusName)).getText();
		Assert.assertEquals(CusNameText, "KIRUPA KARAN");
		boolean travelId = driver.findElement(ImgTravellerId).isDisplayed();
		Assert.assertEquals(true, true);
		String CustAddress = driver.findElement(CusAddress).getText();
		Assert.assertEquals(CustAddress, "2527+C5H, Green Community Village, Dubai - UAE");
		boolean disKms = driver.findElement(DistancebyKms).isDisplayed();
		Assert.assertEquals(true, true);
		boolean flasIcon = driver.findElement(FlashIcon).isDisplayed();
		Assert.assertEquals(true, true);

	}

	public static void sixDigitOrderId() {
		click_btn(CusAddress);
		String txt = driver.findElement(sixDigitText).getText();
		Assert.assertEquals(txt, "Please enter the last 6-digits of the orderID");
		send_keys(SixDigitOrderId, "123456");
		click_btn(sixDigitCancelBtn);
		String ordernumTxt = driver.findElement(txtPath(OrderNumTxt)).getText();
		Assert.assertEquals(ordernumTxt, "MGORD-2023-2515121");
		click_btn(CusAddress);
		send_keys(SixDigitOrderId, "123456");
		click_btn(sixdigitConfirmBtn);
	

	}

	public static void verifyleftMenu() {
		click_btn(leftImgLines);
		String deliverName = driver.findElement(deliNameRetOrder).getText();
		Assert.assertEquals(deliverName, "Hi, Kirupa");
		boolean profPic = driver.findElement(delivProfPic).isDisplayed();
		Assert.assertEquals(profPic, true);
		boolean returnOrderImg = driver.findElement(retrunOrderImg).isDisplayed();
		Assert.assertEquals(returnOrderImg, true);
		String returnOrder = driver.findElement(returnOrderText).getText();
		Assert.assertEquals(returnOrder, "Return orders");
		boolean logout = driver.findElement(logoutImg).isDisplayed();
		Assert.assertEquals(logout, true);
		String logouttxt = driver.findElement(LogoutText).getText();
		Assert.assertEquals(logouttxt, "Logout");

		String returnOrdernum = driver.findElement(ReturnOrderNumber).getText();
		Assert.assertEquals(returnOrdernum, "15");
		click_btn(leftmenuCancel);

	}

	public static void verifyReturnOrderlist() throws InterruptedException {
		//click_btn(returnOrderBackArrow);
		Thread.sleep(2000);
		
		click_btn(leftImgLines);
		click_btn(returnOrderText);
		String retOrdTit = driver.findElement(returnOrderTitle).getText();
		Assert.assertEquals(retOrdTit, "Return order list");
		String retOrderNum = driver.findElement(returnOrderNum).getText();
		Assert.assertEquals(retOrderNum, "RETURN ORDER#");
//		boolean displayed = driver.findElement(returnOrderLocationImg).isDisplayed();
//		Assert.assertEquals(displayed, true);
		String num = driver.findElement(returnOrderID).getText();
		Assert.assertEquals(num, "MGORD-2023-2515121");
		String CustomerName = driver.findElement(txtPath(CusName)).getText();
		Assert.assertEquals(CustomerName, "KIRUPA KARAN");
		boolean travImg = driver.findElement(travellerImgId).isDisplayed();
		Assert.assertEquals(travImg, true);
		String CustAdd = driver.findElement(CusAddress).getText();
		Assert.assertEquals(CustAdd, "2527+C5H, Green Community Village, Dubai - UAE");
		boolean disKms = driver.findElement(DistancebyKms).isDisplayed();
		Assert.assertEquals(true, true);
		boolean flasIcon = driver.findElement(FlashIcon).isDisplayed();
		Assert.assertEquals(true, true);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"MGORD-2023-2515127\"));"));
		System.out.println("Scroll down");
		click_btn(returnOrderBackArrow);
		click_btn(returnOrderText);

	}

	public static void verifyReturnOrderPickUpScreen() {
		click_btn(returnOrderNum);
		String num = driver.findElement(returnOrderID).getText();
		Assert.assertEquals(num, "MGORD-2023-2515121");
		String retCusNm = driver.findElement(ROCustomerNamePickUp).getText();
		Assert.assertEquals(retCusNm, "Customer name");
		String retCusname = driver.findElement(ROCusNmPickup).getText();
		Assert.assertEquals(retCusname, "Kirupa Karan");
		String retOrdStat = driver.findElement(ROOrderStatusPickup).getText();
		Assert.assertEquals(retOrdStat, "Order status");
		String retOrderReq = driver.findElement(ROOrderStatusReqPickup).getText();
		Assert.assertEquals(retOrderReq, "Return requested");
		// String retNoofret=driver.findElement(RONoOfRetPickup).getText();
		String retNoofret = driver.findElement(txtPath("No of return items")).getText();
		System.out.println("The return items" + retNoofret);
		Assert.assertEquals(retNoofret, "No of return items");
		String retNoOfCount = driver.findElement(RORetCountPickup).getText();
		Assert.assertEquals(retNoOfCount, "03");
		String retCoup = driver.findElement(RORefCouValPickup).getText();
		Assert.assertEquals(retCoup, "Refund coupon value");
		String retCopCount = driver.findElement(RORefCopCountPickup).getText();
		Assert.assertEquals(retCopCount, "126.5 AED");

	}

	public static void VerifyRefundCouponImg() {
		boolean refCouImg = driver.findElement(RORefCoupImg).isDisplayed();
		Assert.assertEquals(refCouImg, true);
		boolean megaMartImg = driver.findElement(MegaMartImg).isDisplayed();
		Assert.assertEquals(megaMartImg, true);
		String refCoupText = driver.findElement(RefcoupText).getText();
		Assert.assertEquals(refCoupText, "Refund coupon");
		String refCoupval = driver.findElement(RefcoupVal).getText();
		Assert.assertEquals(refCoupval, "126.5");
		String refCouprup = driver.findElement(RefcoupRup).getText();
		Assert.assertEquals(refCouprup, "AED");
		String refCoupvalid = driver.findElement(RefcoupValidity).getText();
		Assert.assertEquals(refCoupvalid, "Coupon valid till 10th June 2023");

	}

	public static void VerifyROCompletePickup() throws InterruptedException {
		driver.findElement(GetDirTxt).click();
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Pampers baby wipes\"));"));
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pampers baby wipes\").instance(0))"));

		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		//Thread.sleep(1000);
		click_btn(ROCompPickup);
	}

	public static void VerifyNewOrderPickUP() throws InterruptedException {
	//	click_btn(returnOrderBackArrow);
		String orderTitle = driver.findElement(NOOrderIdTitlePickup).getText();
		Assert.assertEquals(orderTitle, "Order number MGORD-2023-2515121");
		String codTit = driver.findElement(NoCODTitlePickUP).getText();
		if (codTit.contains("Collect 126.5 AED")) {
		Assert.assertEquals(codTit, "Collect 126.5 AED from the customer at the time of delivery!");
		}else
		{
			Assert.assertEquals(codTit, "Pickup completed from the store!");
			driver.findElement(AppiumBy.androidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Customer name\").instance(0))"));
			
		}
		//Thread.sleep(2000);
		String retCusNm = driver.findElement(ROCustomerNamePickUp).getText();
		Assert.assertEquals(retCusNm, "Customer name");
		String retCusname = driver.findElement(ROCusNmPickup).getText();
		Assert.assertEquals(retCusname, "Kirupa Karan");
		String retOrdStat = driver.findElement(ROOrderStatusPickup).getText();
		Assert.assertEquals(retOrdStat, "Order status");
		String retOrderReq = driver.findElement(ROOrderStatusReqPickup).getText();
		Assert.assertEquals(retOrderReq, "Confirmed");
		String payStatus=driver.findElement(txtPath("Payment status")).getText();
		Assert.assertEquals(payStatus, "Payment status");
		String paymentStatus = driver.findElement(PaymentStatus).getText();
		Assert.assertEquals(paymentStatus , "To be paid");
		String totPay=driver.findElement(txtPath("Total payment")).getText();
		Assert.assertEquals(totPay, "Total payment");
		String totAmt=driver.findElement(totalAmount).getText();
		Assert.assertEquals(totAmt, "126.5");
		String totSym=driver.findElement(totalAmountSymbol).getText();
		Assert.assertEquals(totSym," AED");
		String noOfPack=driver.findElement(txtPath("No of packages")).getText();
		Assert.assertEquals(noOfPack, "No of packages");
		
		String noOfPac=driver.findElement(NofPackCount).getText();
		Assert.assertEquals(noOfPac, "15");
		String orSchTime=driver.findElement(txtPath("Ordered scheduled time")).getText();
		Assert.assertEquals(orSchTime, "Ordered scheduled time");
		String scTime=driver.findElement(schedTime).getText();
		Assert.assertEquals(scTime, "14:00 - 15:00");
		String address=driver.findElement(CustAddress).getText();
		Assert.assertEquals(address, "Delivery address");
		String addressDetail=driver.findElement(CustAddressDetail).getText();
		Assert.assertEquals(addressDetail, "2527+C5H, Green Community Village,Green community west,Dubai- United Arab Emirates");
	//	Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chiller\").instance(0))"));
		
		boolean packIcon=driver.findElement(packageIcon).isDisplayed();
		Assert.assertEquals(packIcon, true);
		String dry=driver.findElement(DryPakcage).getText();
		Assert.assertEquals(dry, "Dry ");
		String froz=driver.findElement(FrozenPakcage).getText();
		Assert.assertEquals(froz, "Frozen ");
		String chill=driver.findElement(ChillerPakcage).getText();
		Assert.assertEquals(chill, "Chiller ");
		click_btn(returnOrderBackArrow);
		click_btn(CusAddress);
		send_keys(SixDigitOrderId, "123456");
		click_btn(sixdigitConfirmBtn);
		
	
	}
	public static void VerifyNOCompletePickup() throws InterruptedException {
		
		
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chiller\").instance(0))"));
		
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Pickup'])[1]")).click();
		Thread.sleep(1000);
		click_btn(ROCompPickup);
	}

	@SuppressWarnings("deprecation")
	public static void VerifyDeliverCompleteBtn() throws InterruptedException {
		VerifyNewOrderPickUP();
		VerifyNOCompletePickup();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chiller\").instance(0))"));
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Deliver'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Deliver'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Deliver'])[1]")).click();
		driver.findElement(By.xpath("//android.view.View[@resource-id='com.megamart.delivery:id/signaturePad']")).click();
	//	Point SP = CudSignPad.getCenter();
//		WebElement loction=driver.findElement(By.xpath("//android.view.View[@resource-id='com.megamart.delivery:id/signaturePad']"));
//	    int leftX = loction.getLocation().getX();
//	    System.out.println("The left x is"+leftX);
//	    int rightX = loction.getSize().getWidth();
//	    System.out.println("The right x is"+rightX);
//	    int middleX = rightX + (leftX / 10);
//	    System.out.println("The middleX x is"+middleX);
//	    int upperY = loction.getLocation().getY();
//	    System.out.println("The upperY is"+upperY);
//	    int lowerY = loction.getSize().getHeight();
//	    System.out.println("The upperY x is"+lowerY);
//	    int middleY = upperY + (lowerY / 10);
//	    System.out.println("The middleY x is"+middleY);
//		int newx = (middleX - 1000) / 2;
//		int newy = (middleY + 100000) / 2;
//		@SuppressWarnings("rawtypes")
//		TouchAction builder = new TouchAction(driver);
//	//	builder.press(PointOption.point(middleX, middleY)).moveTo(PointOption.point(newx, newy)).perform().release();
//		builder.press(PointOption.point(newx,newy)).perform().release();
//		Thread.sleep(1000);
		String collPay=driver.findElement(ROCompPickup).getText();
		Assert.assertEquals(collPay, "Collect payment 126.5 AED");

		click_btn(ROCompPickup);
	}
	public static void verifyPaymentOption() {
		verify_elementText(CollectPaymentTxt, "Collect payment");
		verify_elementText(CollectPayAmtTxt, "126.5");
		verify_elementText(collectpayRupeesTxt, "AED");
		verify_elementText(CreditCardTxt, "Credit/Debit card");
		verify_elementText(CashOnHandTxt, "Cash on hand");
		element_isDisplayed(CreditCardSelect);
		element_isDisplayed(CashOnSelect);
		click_btn(CreditCardSelect);
		click_btn(CompletePaymentClsBtn);
		click_btn(ROCompPickup);
		verify_elementText(CompletePaymentTxt, "Collect payment");
		click_btn(CompletePaymentTxt);
	//	verify_elementText(alertPaymentOPtion, "Please your payment option");
		click_btn(CashOnSelect);
		click_btn(CompletePaymentTxt);
		
	}public static void verifyPaymentOptionduplicate() {
		verify_elementText(CollectPaymentTxt, "Collect payment");
		verify_elementText(CollectPayAmtTxt, "126.5");
		verify_elementText(collectpayRupeesTxt, "AED");
		verify_elementText(CreditCardTxt, "Credit/Debit card");
		verify_elementText(CashOnHandTxt, "Cash on hand");
		element_isDisplayed(CreditCardSelect);
		element_isDisplayed(CashOnSelect);
		click_btn(CreditCardSelect);
		click_btn(CompletePaymentClsBtn);
		click_btn(ROCompPickup);
		verify_elementText(CompletePaymentTxt, "Collect payment");
		click_btn(CompletePaymentTxt);
	//	verify_elementText(alertPaymentOPtion, "Please your payment option");
		click_btn(CashOnSelect);
		click_btn(CompletePaymentTxt);
		
	}
	
}