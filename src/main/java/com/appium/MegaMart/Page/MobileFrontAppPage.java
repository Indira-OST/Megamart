package com.appium.MegaMart.Page;

import java.awt.Dimension;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.w3c.dom.css.ElementCSSInlineStyle;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.util.List;


public class MobileFrontAppPage extends AbstractPage {
	private static final By emailId = AppiumBy.id("com.megamart.customer:id/edtUsername");
	private static final By password = AppiumBy.id("com.megamart.customer:id/password");
	private static final By login = AppiumBy.id("com.megamart.customer:id/tvLogoLogin");
	private static final By forgotPassword = AppiumBy.id("com.megamart.customer:id/tvForgotPassword");
	private static final By continueWith = AppiumBy.id("com.megamart.customer:id/tvContinueWith");
	private static final By googleLogin = AppiumBy.id("com.megamart.customer:id/ivLoginGoogle");
	private static final By fbLogin = AppiumBy.id("com.megamart.customer:id/ivLogiFacebook");
	private static final By newToMegaMart = AppiumBy.id("com.megamart.customer:id/tvNewTo");
	private static final By signUP = AppiumBy.id("com.megamart.customer:id/ivSignup");
	private static final By hiddenPswd = AppiumBy.id("com.megamart.customer:id/text_input_end_icon");
	private static final By megaMartLogoImg=AppiumBy.id("com.megamart.customer:id/ivLogoImage");
	private static final By goodMrngTxt=AppiumBy.id("com.megamart.customer:id/tvName");
	private static final By cusLocation=AppiumBy.id("com.megamart.customer:id/tvWelcome");
	private static final By langArab=AppiumBy.id("com.megamart.customer:id/imgArab");
	private static final By searchProdTxt=AppiumBy.id("com.megamart.customer:id/etSearch");
	private static final By prodBannerImg=AppiumBy.id("com.megamart.customer:id/myimage");
	private static final By thisWeekTxt=AppiumBy.id("com.megamart.customer:id/tvHeader");
	private static final By weekExploreAll=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[1]/android.widget.TextView[2]");
	private static final By weekOfferImage=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[1]");
	private static final By weekOfferImageTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvProductName'])[1]");
	private static final By weekOfferImageWasTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/labelWas'])[1]");
	private static final By weekOfferImageWasCrossTxt=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivOldPriceCross'])[1]");
	
	private static final By weekOfferImgNewTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvNewPrice'])[1]");
	private static final By weekOfferImgQARTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvUom'])[1]");
	private static final By weekOfferImageAddTxt=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivAdd'])[1]");
	private static final By shopByCatTxt=AppiumBy.id("com.megamart.customer:id/tvShop");
	private static final By shopByCatExpAll=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.TextView[2]");
	private static final By profileTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/title_txt'])[1]");
	private static final By logoutTxt=AppiumBy.xpath("//android.widget.TextView[@text='Logout']");
	private static final By shopCatVeg=AppiumBy.xpath("//android.widget.TextView[@text='Fruits & Vegetables']");
	private static final By shopCatBanImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[1]");
	private static final By dairyEggImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[2]");
	private static final By dairyEggTxt=AppiumBy.xpath("//android.widget.TextView[@text='Dairy & Egg']");
	private static final By packFoodxt=AppiumBy.xpath("(//android.widget.TextView[@text='Packed food'])[1]");
	private static final By brandStoreTxt=AppiumBy.id("com.megamart.customer:id/tvBrand");
	private static final By brandStoreBanner=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivLogoImage'])[1]");
	private static final By brandStoreExpAll=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.TextView[2]");
	private static final By topCategoriesTxt= AppiumBy.xpath("//android.widget.TextView[@text='Top categories']");
	private static final By topCategoriesExpAll= AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[3]/android.widget.TextView[2]");
	private static final By topCatVegImg=AppiumBy.id("com.megamart.customer:id/ivVegetables");
	private static final By topCatBrocImg=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]");
	private static final By topCatPotatoTxt= AppiumBy.xpath("//android.widget.TextView[@text='Potato local from southasian countries']");
	private static final By topCatWasTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/labelWas'])[1]");
	private static final By topCatNewPriceTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvNewPrice'])[1]");
	private static final By topCatAddTxt=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivAdd'])[1]");
	private static final By topCatAddBan=AppiumBy.id("com.megamart.customer:id/myimage");
	private static final By featProdTxt=AppiumBy.id("com.megamart.customer:id/tvHeading");
	private static final By featProdExpAll=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]/android.widget.TextView[2]");
	private static final By featProdOff=AppiumBy.xpath("(//android.widget.Button[@resource-id='com.megamart.customer:id/btnOffer'])[1]");
	private static final By featProdOffName=AppiumBy.xpath("//android.widget.TextView[@text='Cake gobbles']");
	private static final By featProdAddCart=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvAddToCart'])[1]");
	private static final By lookForSomeThing=AppiumBy.xpath("//android.widget.TextView[@resource-id='com.megamart.customer:id/tvSomethingElse']");
	private static final By homeIcon= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/icon_iv'])[1]");
	private static final By profIcon= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/icon_iv'])[2]");
	private static final By centerIcon= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/icon_iv'])[3]");
	private static final By myOrderIcon= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/icon_iv'])[4]");
	private static final By cartIcon= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/icon_iv'])[5]");
	private static final By homeText= AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/title_txt'])[1]");
	private static final By profText= AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/title_txt'])[2]");
	private static final By myOrderText= AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/title_txt'])[3]");
	private static final By cartText= AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/title_txt'])[4]");
	private static final By allTitleTxt= AppiumBy.id("com.megamart.customer:id/title");
	private static final By allCatBanner=AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.megamart.customer:id/myimage']");
	private static final By dairyAndEggImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[1]");
	private static final By packedFoodImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[5]");
	private static final By frozenFoodImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[10]");
	private static final By dairyAndEggTxt=AppiumBy.xpath("//android.widget.TextView[@text='Dairy & Egg']");
	private static final By packedFoodTxt=AppiumBy.xpath("(//android.widget.TextView[@text='Packed food'])[1]");
	private static final By frozenFoodTxt=AppiumBy.xpath("(//android.widget.TextView[@text='Frozen food'])[2]");
	private static final By backArrow=AppiumBy.id("com.megamart.customer:id/img_back_arrow");
	private static final By beveragesText=AppiumBy.xpath("//android.widget.TextView[@text='Beverages']");
	private static final By brandStoreTitle=AppiumBy.id("com.megamart.customer:id/title");
	private static final By prodDescTxt=AppiumBy.id("com.megamart.customer:id/tvDescription");
	private static final By prodRevTxt=AppiumBy.id("com.megamart.customer:id/tvReviews");
	private static final By prodIngredTxt=AppiumBy.id("com.megamart.customer:id/tvIngredients");
	private static final By prodDescDetails=AppiumBy.id("com.megamart.customer:id/tvProductDesc");
	private static final By prodRelateProdTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvRelatedProduct'])[1]");
	private static final By prodRelateProdExploreAll=AppiumBy.xpath("(//android.widget.TextView[@text='Explore all'])[1]");
	private static final By prodRelateProdExploreAll2=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]");
	private static final By recentlyboughtTxt=AppiumBy.xpath("//android.widget.TextView[@text='Recently bought']");
	private static final By prodRecenBouExploreAll=AppiumBy.xpath("(//android.widget.TextView[@text='Explore all'])[2]");
	private static final By relatProdtTxt=AppiumBy.xpath("//android.widget.TextView[@text='Related products']");
	private static final By recentlyBoughtRightIMg=AppiumBy.id("com.megamart.customer:id/imgRight");
	private static final By recentBoughtTxt=AppiumBy.xpath("//android.widget.TextView[@text='Recently purchased products']");
	
	private static final By profImg= AppiumBy.id("com.megamart.customer:id/ivProfile");
    private static final By cusNameTxt= AppiumBy.id("com.megamart.customer:id/tvName");
    private static final By cusMobNumTxt= AppiumBy.id("com.megamart.customer:id/tvMobile");
    private static final By cusMailIdTxt= AppiumBy.id("com.megamart.customer:id/tvEmail");	    
    private static final By cusImgEditTxt= AppiumBy.id("com.megamart.customer:id/img_edit");
	private static final By cartOrderTxt=AppiumBy.xpath("//android.widget.TextView[@text='My Orders']");
	private static final By cartOrderNameTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvProductName'])[1]");
	private static final By cartOrderSecNameTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvProductName'])[2]");

	private static final By cartOrderFirstImg= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivBrandLogo'])[1]");
	private static final By cartOrderSecImg= AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivBrandLogo'])[2]");
	private static final By cartOrderPlusSign=AppiumBy.id("com.megamart.customer:id/ivPlus");
	private static final By cartOrderMinusSign=AppiumBy.id("com.megamart.customer:id/ivMinus");
	private static final By cartOrderQtySign=AppiumBy.id("com.megamart.customer:id/edtQty");
	
	private static final By subsText=AppiumBy.id("com.megamart.customer:id/tvLabelAskSubstitute");
	private static final By noNeedSubThumb=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivThumb'])[1]");
	private static final By askForConfThumb=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivThumb'])[3]");
	private static final By procWithoutSubThumb=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivThumb'])[2]");
	private static final By noNeedSubTxt=AppiumBy.xpath("//android.widget.TextView[@text='No need substitutes']");
	private static final By askForConfTxt=AppiumBy.xpath("//android.widget.TextView[@text='Ask me for confirmation']");
	private static final By procWithoutSubTxt=AppiumBy.xpath("//android.widget.TextView[@text='Proceed without confirmation']");
	private static final By tipText=AppiumBy.id("com.megamart.customer:id/tvLabelTip");
	private static final By tipOptText=AppiumBy.id("com.megamart.customer:id/tvLabelTipOptional");
	private static final By tipAmtBox=AppiumBy.id("com.megamart.customer:id/llTipAmount");
	private static final By tip10Amt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvAmount'])[1]");
	private static final By notesTxt=AppiumBy.xpath("//android.widget.EditText[@resource-id='com.megamart.customer:id/tvComments']");
	
	
	
	
	
	
    
    private static final By myOrdersTxt= AppiumBy.xpath("//android.widget.TextView[@text='My orders']");
    private static final By myAddressTxt= AppiumBy.xpath("//android.widget.TextView[@text='My addresses']");
    private static final By myWishListTxt= AppiumBy.xpath("//android.widget.TextView[@text='My wish list']");
    private static final By notificationTxt= AppiumBy.xpath("//android.widget.TextView[@text='Notifications']");
    private static final By creditsAndCouponsTxt= AppiumBy.xpath("//android.widget.TextView[@text='Credits & Coupons']");
    private static final By changePswdTxt= AppiumBy.xpath("//android.widget.TextView[@text='Change password']");
    private static final By contactUsTxt= AppiumBy.xpath("//android.widget.TextView[@text='Contact us']");
    private static final By termsAndPoliciesTxt= AppiumBy.xpath("//android.widget.TextView[@text='Terms & Policies']");
	
	private static final By profListImg=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[1]");
	private static final By profListImg1=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[2]");
	private static final By profListImg2=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[3]");
	private static final By profListImg3=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[4]");
	private static final By profListImg4=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[5]");
	private static final By profListImg5=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[6]");
	private static final By profListImg6=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[7]");
	private static final By profListImg7=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[8]");
	private static final By profListImg8=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivItemImage'])[9]");

	
	private static final By cartHomeLocImg=AppiumBy.id("com.megamart.customer:id/ivLocationLogo");
	private static final By cartOffAddImg=AppiumBy.id("com.megamart.customer:id/tvAddress");
	private static final By cartPromoTxt=AppiumBy.id("com.megamart.customer:id/clPromoCode");
	private static final By cartPromoApplyTxt=AppiumBy.id("com.megamart.customer:id/tvApply");
	private static final By subTotalTxt=AppiumBy.xpath("//android.widget.TextView[@text='Sub total']");
	private static final By totalAmt10Txt=AppiumBy.xpath("(//android.widget.TextView[@text='10.00'])[1]");
	private static final By taxTxt=AppiumBy.xpath("//android.widget.TextView[@text='Tax 2%']");
	private static final By discountTxt=AppiumBy.xpath("//android.widget.TextView[@text='Discount']");
	private static final By deliverTxt=AppiumBy.xpath("//android.widget.TextView[@text='Delivery (6 Kms)']");
	private static final By payOnlineRaBtn=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivSelectMode'])[1]");
	private static final By payCashRaBtn=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivSelectMode'])[2]");
	private static final By viewBillTxt=AppiumBy.xpath("//android.widget.TextView[@text='View Bill']");
	private static final By completeOrderTxt=AppiumBy.xpath("//android.widget.TextView[@text='Complete order']");
	private static final By proceedToPayTxt=AppiumBy.xpath("//android.widget.TextView[@text='Proceed to pay']");
	private static final By addressHomeIcon=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/img_address_type'])[1]");
	private static final By addressName=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvAddressName'])[1]");
	private static final By addressDetail=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvAddress'])[1]");
	private static final By locPermText=AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	private static final By locEditText=AppiumBy.id("com.megamart.customer:id/autoCompleteEditText");
	private static final By locEditTambaramText=AppiumBy.xpath("//android.widget.AutoCompleteTextView[@text='Tambaram']");
	private static final By offer10NumTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvOfferDetails'])[1]");
	private static final By offerPercentage=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvLabelOffer'])[1]");
	private static final By offerDetails =AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvWhichProduct'])[1]");
	private static final By offerValidity =AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvCouponValidity'])[1]");
	private static final By offerCode=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvOfferCode'])[1]");
	private static final By copyCodtTxt=AppiumBy.xpath("//android.widget.TextView[@resource-id='com.megamart.customer:id/tvCopyCode']");
	private static final By offerPercentWitDet=AppiumBy.id("com.megamart.customer:id/tvProducts");
	private static final By offerDetailsValid=AppiumBy.id("com.megamart.customer:id/tvValid");
	private static final By offerTermsTxt=AppiumBy.id("com.megamart.customer:id/tvTerms");

	private static final By carrotTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvProductNames'])[1]");
	private static final By myOrderNumber=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvOrderNo'])[1]");
	private static final By myOrderPagePrice =AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvPrice'])[1]");
	private static final By myOrderTimePrice =AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvOrderTime'])[1]");
	private static final By myOrderPlacedStatus =AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvOrderStatus'])[1]");
	private static final By cancelOrder=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivCancelOrder'])[1]");
	private static final By cusAddressTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvLocation'])[1]");
	private static final By cusAddressLogo=AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.megamart.customer:id/ivLocationLogo'])[1]");
	private static final By OVPOrderId=AppiumBy.id("com.megamart.customer:id/tvOrderNo");
	private static final By OVPOrderDateAntTime=AppiumBy.id("com.megamart.customer:id/tvDateTime");
	private static final By OVPOrderDateTxt=AppiumBy.id("com.megamart.customer:id/tvDate");
	private static final By OVPOrderAtTxt=AppiumBy.id("com.megamart.customer:id/tvAt");
	private static final By OVPOrderTimeTxt=AppiumBy.id("com.megamart.customer:id/tvTime");		
	private static final By OVPOrderEstimateTxt=AppiumBy.id("com.megamart.customer:id/tvEstimate");	
	private static final By OVPEstDateTxt=AppiumBy.id("com.megamart.customer:id/tvEstimateDate");
	private static final By OVPEstAtTxt=AppiumBy.id("com.megamart.customer:id/tvEstimateAt");
	private static final By OVPEstTimeTxt=AppiumBy.id("com.megamart.customer:id/tvEstimateTime");	
	private static final By OVPDowInvTxt=AppiumBy.id("com.megamart.customer:id/tvDownloadInvoice");
	private static final By OVPDelAddTxt=AppiumBy.id("com.megamart.customer:id/tvAddressValue");
	private static final By OVPDateAndTimeTxt=AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.megamart.customer:id/tvStatusDate'])[1]");
	private static final By OVPGreenColorLine=AppiumBy.xpath("(//android.view.View[@resource-id='com.megamart.customer:id/viewLineTop'])[1]");
	private static final By OVPOrderNotes=AppiumBy.id("com.megamart.customer:id/tvOrderNote");
	private static final By OVPOrderValue=AppiumBy.id("com.megamart.customer:id/tvOrderNoteValue");
	private static final By OVPPaymentMethodTxt=AppiumBy.id("com.megamart.customer:id/tvPaymentMethod");
	private static final By OVPPaymentMethodValue=AppiumBy.id("com.megamart.customer:id/tvPaymentMethodValue");
	private static final By OVPSubTotalTxt=AppiumBy.id("com.megamart.customer:id/tvSubTotal");
	private static final By OVPSubTotValue=AppiumBy.id("com.megamart.customer:id/tvSubTotalValue");
	private static final By OVPTaxTxt=AppiumBy.id("com.megamart.customer:id/tvTax");
	private static final By OVPTaxValue=AppiumBy.id("com.megamart.customer:id/tvTaxValue");		
	private static final By OVPDiscountTxt=AppiumBy.id("com.megamart.customer:id/tvDiscount");
	private static final By OVPDisValue=AppiumBy.id("com.megamart.customer:id/tvDiscountValue");
	private static final By OVPDelTxt=AppiumBy.id("com.megamart.customer:id/tvDeliveryKms");
	private static final By OVPDelValue=AppiumBy.id("com.megamart.customer:id/tvDeliveryKmsValue");
	
	private static final By OVPDelTipTxt=AppiumBy.id("com.megamart.customer:id/tvDeliveryTip");
	private static final By OVPDelTipValue=AppiumBy.id("com.megamart.customer:id/tvDeliveryTipValue");
	private static final By OVPGrandTotTxt=AppiumBy.id("com.megamart.customer:id/tvGrandTotal");
	private static final By OVPGrandTotValue=AppiumBy.id("com.megamart.customer:id/tvGrandTotalValue");
	private static final By OVPQueriesTxt=AppiumBy.id("com.megamart.customer:id/tvQuries");
	private static final By OVPCancelOrderBtn =AppiumBy.id("com.megamart.customer:id/tvCancelOrder");
	
			

	

	
	

	
	

	
    

	
	
	
	


	


	
	

	
	public static By txtPath(String Text) {
		return AppiumBy.xpath("//android.widget.TextView[@text='" + Text + "']");

	}
	
	public static By getElementText(By element,String text) {
		
		String conWith = driver.findElement(element).getText();
		Assert.assertEquals(conWith, text);
		return element;
	}

	public static void verifyLogin() {

		getElementText(emailId, "Username");
		getElementText(password, "Password");
		getElementText(login, "Login");
		getElementText(forgotPassword, "Forgot password?");
		getElementText(continueWith,"Or continue with");
		getElementText(newToMegaMart, "New to Megamart?");
		element_isDisplayed(googleLogin);
		element_isDisplayed(fbLogin);
		element_isDisplayed(hiddenPswd);
		element_isDisplayed(megaMartLogoImg);
		element_isDisplayed(signUP);

	}

	public static void validCredentials() {
		send_keys(emailId, "test");
		send_keys(password, "test");
		click_btn(login);
	}

	public static void verifyDashHearder() {
		element_isDisplayed(goodMrngTxt);
		element_isDisplayed(cusLocation);
		element_isDisplayed(langArab);
		getElementText(searchProdTxt, "Search for your favourite products..");
		//element_isDisplayed(prodBannerImg);
	}
	public static void verifyWeekMenu() {
		element_isDisplayed(thisWeekTxt);
		getElementText(thisWeekTxt, "This week offers 🔥");
		getElementText(weekExploreAll, "Explore all");
		element_isDisplayed(weekOfferImage);
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");
		getElementText(weekOfferImageWasTxt, "was");
		element_isDisplayed(weekOfferImageWasCrossTxt);
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
		element_isDisplayed(weekOfferImageAddTxt);
		click_btn(weekExploreAll);
		getElementText(allTitleTxt, "This week offers 🔥");
		element_isDisplayed(recentlyBoughtRightIMg);
		getElementText(dairyEggTxt, "Dairy & Egg");
		element_isDisplayed(dairyAndEggImg);
		getElementText(weekOfferImageWasTxt, "was");
		element_isDisplayed(weekOfferImageWasCrossTxt);
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
		element_isDisplayed(weekOfferImageAddTxt);
		click_btn(backArrow);
		
	}
	public static void verifyShopByCat() throws InterruptedException {
	
		getElementText(shopByCatTxt, "Shop by categories");
		getElementText(shopByCatExpAll, "Explore all");
		getElementText(shopCatVeg, "Fruits & Vegetables");
		driver.findElement(AppiumBy.androidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Packed food\").instance(0))"));
		element_isDisplayed(shopCatBanImg);
		
		element_isDisplayed(dairyEggImg);
		getElementText(dairyEggTxt, "Dairy & Egg");
		getElementText(packFoodxt, "Packed food");

		Thread.sleep(2000);
		System.out.println("scrolling down");

	
	}
	
	public static void verifyBrandStore() {

		getElementText(brandStoreTxt, "Brand store");
		element_isDisplayed(brandStoreBanner);
		element_isDisplayed(brandStoreExpAll);	
		
	}
	public static void verifyTopCat() {
	
	//	driver.findElement(AppiumBy.androidUIAutomator(
		//				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Featured products\").instance(0))"));
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Top categories\").instance(0))"));
	
		
		getElementText(topCategoriesTxt, "Top categories");
		getElementText(topCategoriesExpAll, "Explore all");
		element_isDisplayed(topCatVegImg);
	//	element_isDisplayed(topCatBrocImg);
		scrollToElement("Featured products");
		scrollToElement("Top categories");
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		getElementText(topCatWasTxt, "was");
		getElementText(topCatNewPriceTxt, "9.95");
		element_isDisplayed(topCatAddTxt);
		element_isDisplayed(topCatAddBan);

		
	}
	public static void verifyFeaturedProd() throws InterruptedException {
		scrollToElement("Featured products");

	//	driver.findElement(AppiumBy.androidUIAutomator(
		//		"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Featured products\").instance(0))"));
	
		getElementText(featProdTxt, "Featured products");
		getElementText(featProdExpAll, "Explore all");
		Thread.sleep(1000);
		getElementText(featProdOff, "50% OFF");
		Thread.sleep(1000);
	//	getElementText(featProdOffName, "Cake gobbles");
		//getElementText(featProdAddCart, "Add to cart");
//		driver.findElement(AppiumBy.androidUIAutomator(
	//			"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Looking for something else?\").instance(0))"));
	
//		getElementText(lookForSomeThing, "Looking for something else? 🤔");
		

		
	}
	public static void footerIcons() {
	
		element_isDisplayed(homeIcon);
		element_isDisplayed(profIcon);
		element_isDisplayed(centerIcon);
		element_isDisplayed(myOrderIcon);	
		element_isDisplayed(myOrderIcon);
		getElementText(homeText, "Home");
		getElementText(profText, "Profile");
		getElementText(myOrderText, "My Orders");
		getElementText(cartText, "Cart");
		
		
		
		
	}
	public static void scrollToElement(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"));
	
	}
	public static void verifyshopByCategories() {
	
		scrollToElement("Shop by categories");
		
		click_btn(shopByCatExpAll);
		getElementText(allTitleTxt, "All categories");
		element_isDisplayed(allCatBanner);
		element_isDisplayed(packedFoodImg);
		element_isDisplayed(frozenFoodImg);
		getElementText(dairyEggTxt, "Dairy & Egg");
		getElementText(packedFoodTxt, "Packed food");
		getElementText(frozenFoodTxt, "Frozen food");
		footerIcons();
		click_btn(backArrow);
	
	}
	
	   
		 public void horizontalScroll()
		    {
			 
			 
		    }
		
	
	public static void verifyBrandStoreDetails() throws Exception {
	
		scrollToElement("Brand store");
		
		click_btn(brandStoreExpAll);
		getElementText(brandStoreTitle, "Brand store");
		element_isDisplayed(prodBannerImg);
		getElementText(dairyEggTxt, "Dairy & Egg");
		click_btn(dairyAndEggTxt);	
	//	WebElement obj=driver.findElement(dairyEggTxt);
	
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
               
      //          + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"Packed food\"))")); 
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\"Packed food\"))")).click();

	//	getElementText(packFoodxt, "Packed food");
	//	click_btn(packedFoodTxt);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
//                + "resourceId(\"com.megamart.customer:id/tvItem\"))"
//                + ".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"Beverages\"))")); 
		
		click_btn(beveragesText);
		click_btn(backArrow);
		
		
		
	}
	
	public static void verifyAllProductScreen() throws InterruptedException {
		getElementText(shopByCatExpAll, "Explore all");
		click_btn(shopByCatExpAll);
		click_btn(dairyEggTxt);
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		scrollToElement("Packed food");
		click_btn(backArrow);
		click_btn(backArrow);
	}
	
	public static void verifyProductViewPage() {

		scrollToElement("Shop by categories");
		
		click_btn(shopByCatExpAll);
	
		getElementText(allTitleTxt, "All categories");
		click_btn(dairyEggTxt);
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		click_btn(weekOfferImgNewTxt);
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		getElementText(weekOfferImageWasTxt, "was");
		element_isDisplayed(weekOfferImageWasCrossTxt);
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
	
		getElementText(prodDescTxt, "Description");
		getElementText(prodRevTxt, "Reviews");
		getElementText(prodIngredTxt, "Ingredients");
		getElementText(prodDescDetails, "The tomato is the edible berry of the plant Solanum lycopersicum, commonly known as the tomato plant. The species originated in western South America, Mexico, and Central America. The Mexican Nahuatl word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived.");
		getElementText(prodRelateProdTxt, "Related products");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		scrollToElement("Recently bought");

		getElementText(recentlyboughtTxt, "Recently bought");
		getElementText(prodRelateProdExploreAll2, "Explore all");
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");

	}
	public static void verifyRelatedProducts() {
		
		click_btn(prodRelateProdExploreAll);
		getElementText(relatProdtTxt, "Related products");
		element_isDisplayed(recentlyBoughtRightIMg);
		getElementText(dairyEggTxt, "Dairy & Egg");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		getElementText(weekOfferImageWasTxt, "was");
		element_isDisplayed(weekOfferImageWasCrossTxt);
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
		click_btn(weekOfferImageTxt);
		getElementText(prodDescTxt, "Description");
		getElementText(prodRevTxt, "Reviews");
		getElementText(prodIngredTxt, "Ingredients");
		getElementText(prodDescDetails, "The tomato is the edible berry of the plant Solanum lycopersicum, commonly known as the tomato plant. The species originated in western South America, Mexico, and Central America. The Mexican Nahuatl word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived.");
		getElementText(prodRelateProdTxt, "Related products");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		
	}
	public static void verifyRecentlyBoughtProd() {
		
		scrollToElement("Recently bought");
		click_btn(prodRecenBouExploreAll);
		getElementText(recentBoughtTxt, "Recently purchased products");
		getElementText(dairyEggTxt, "Dairy & Egg");
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		click_btn(topCatPotatoTxt);
		getElementText(prodDescTxt, "Description");
		getElementText(prodRevTxt, "Reviews");
		getElementText(prodIngredTxt, "Ingredients");
		getElementText(prodDescDetails, "The tomato is the edible berry of the plant Solanum lycopersicum, commonly known as the tomato plant. The species originated in western South America, Mexico, and Central America. The Mexican Nahuatl word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived.");
		getElementText(prodRelateProdTxt, "Related products");
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");	
		scrollToElement("Recently bought");
		getElementText(recentlyboughtTxt, "Recently bought");
		scrollToElement("Tile");
		//getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		click_btn(backArrow);
		click_btn(backArrow);
		click_btn(backArrow);
		
	}
	
	public static void verifyProfileScreen() {
		click_btn(profileTxt);
	//	getElementText(profText, "Profile");
    
	    element_isDisplayed(profImg);
	   
		getElementText(cusMailIdTxt, "kirupakaran.s@realsports.ai");
		getElementText(cusNameTxt, "Kirupakaran");
		getElementText(cusMobNumTxt, "+8870890160");
		element_isDisplayed(cusImgEditTxt);
		getElementText(cusMobNumTxt, "+8870890160");
		scrollToElement("Logout");
		getElementText(creditsAndCouponsTxt, "Credits & Coupons");
		getElementText(myOrdersTxt, "My orders");
		getElementText(myAddressTxt, "My addresses");
		getElementText(myWishListTxt, "My wish list");
		getElementText(notificationTxt, "Notifications");
		getElementText(changePswdTxt, "Change password");
		getElementText(termsAndPoliciesTxt, "Terms & Policies");
		getElementText(contactUsTxt, "Contact us");
		getElementText(termsAndPoliciesTxt, "Terms & Policies");
		getElementText(logoutTxt, "Logout");
		element_isDisplayed(profListImg);
		element_isDisplayed(profListImg1);
		element_isDisplayed(profListImg2);
		element_isDisplayed(profListImg3);
		element_isDisplayed(profListImg4);
		element_isDisplayed(profListImg5);
		element_isDisplayed(profListImg6);
		element_isDisplayed(profListImg7);
		element_isDisplayed(profListImg8);
		click_btn(homeIcon);
		
		
		
	}
	
	public static void veriyMyCartProdDetails() {
		click_btn(cartIcon);

		getElementText(cartOrderTxt, "My Orders");
		element_isDisplayed(recentlyBoughtRightIMg);
		getElementText(cartOrderNameTxt, "Onion local from southasian countries");
		element_isDisplayed(cartOrderFirstImg);
		element_isDisplayed(cartOrderSecImg);
		getElementText(cartOrderSecNameTxt, "Potato local from southasian countries");
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
		element_isDisplayed(weekOfferImageAddTxt);
		click_btn(weekOfferImageAddTxt);
		element_isDisplayed(cartOrderMinusSign);
		getElementText(cartOrderQtySign, "1");
		element_isDisplayed(cartOrderPlusSign);
		click_btn(cartOrderPlusSign);
		click_btn(cartOrderPlusSign);
		click_btn(cartOrderMinusSign);
		getElementText(cartOrderQtySign, "2");
		

	}
	
	
	public static void verifyCartLocPromo() {

		
		element_isDisplayed(cartHomeLocImg);
		getElementText(cartOffAddImg, "Office - Bur Dhubai, Metro station");
		//send_keys(cartPromoTxt, "PromoCode@123");
		getElementText(cartPromoApplyTxt, "Apply");

		scrollToElement("No need substitutes");
		getElementText(subsText, "What to do, if any products are not available?");
		element_isDisplayed(noNeedSubThumb);
		element_isDisplayed(procWithoutSubThumb);
		element_isDisplayed(procWithoutSubThumb);
		getElementText(noNeedSubTxt, "No need substitutes");
		getElementText(procWithoutSubTxt, "Proceed without confirmation");
		getElementText(askForConfTxt, "Ask me for confirmation");
		getElementText(tipOptText, "(optional)");
		getElementText(tipText, "Tip your delivery team");
		element_isDisplayed(tipAmtBox);
		getElementText(tip10Amt, "10");
		getElementText(weekOfferImgQARTxt,"QAR");
		getElementText(notesTxt, "Add some notes if any,");
		send_keys(notesTxt, "notes are added");
		getElementText(recentlyboughtTxt, "Recently bought");
		getElementText(prodRelateProdExploreAll, "Explore all");
		getElementText(topCatPotatoTxt, "Potato local from southasian countries");
		element_isDisplayed(weekOfferImageWasCrossTxt);
		getElementText(weekOfferImgNewTxt,"4.95");
		getElementText(weekOfferImgQARTxt,"QAR");
		element_isDisplayed(weekOfferImageAddTxt);
	
	}
	
	public static void verifyPaymentDetail() {
		scrollToElement("Complete order");
		getElementText(subTotalTxt, "Sub total");
		getElementText(totalAmt10Txt, "10.00");
		getElementText(weekOfferImgQARTxt,"QAR");
		getElementText(taxTxt, "Tax 2%");
		getElementText(discountTxt, "Discount");
		getElementText(deliverTxt, "Delivery (6 Kms)");
		getElementText(completeOrderTxt, "Complete order");
		element_isDisplayed(payCashRaBtn);
		element_isDisplayed(payOnlineRaBtn);
		click_btn(payCashRaBtn);
		getElementText(viewBillTxt, "View Bill");
		getElementText(proceedToPayTxt, "Proceed to pay");
		
	}
	
	public static  void verifyMyAddressPage() throws InterruptedException {
		//click_btn(profileTxt);
		click_btn(myAddressTxt);
		getElementText(allTitleTxt, "My address");
		element_isDisplayed(recentlyBoughtRightIMg);
		element_isDisplayed(backArrow);
	
	
		element_isDisplayed(addressHomeIcon);
		getElementText(addressName, "Kirupakaran");
		getElementText(addressDetail, "2527+CSH, Green community - United Arab Emirates");
		click_btn(recentlyBoughtRightIMg);
		Thread.sleep(1000);
		click_btn(locPermText);
		getElementText(allTitleTxt, "Add new address");
		Thread.sleep(4000);
		
		//driver.findElement(locEditText).sendKeys("Tambaram ");
		driver.findElement(locEditText).sendKeys("Tambaram"+Keys.BACK_SPACE);
	//	driver.findElement(locEditText).sendKeys("Chennai"+Keys.ENTER);
		click_btn(backArrow);
		click_btn(backArrow);
	}
	
	public static void verifyCreditsAndCoupons() {
		//click_btn(profileTxt);
		click_btn(creditsAndCouponsTxt);
		getElementText(offer10NumTxt, "10");
		getElementText(offerPercentage, "% offer");
		getElementText(offerDetails, "on all nestle products");
		getElementText(offerValidity, "Offer valid until 30th April 2023");
		element_isDisplayed(cartOrderFirstImg);
		click_btn(offerDetails);

		getElementText(offerCode, "DEEPAK100");
		getElementText(copyCodtTxt, "Copy code");
		getElementText(offerPercentWitDet, "10% offer on all nestle products");
		getElementText(offerDetailsValid, "Offer valid until 30the may 2023");
		getElementText(offerTermsTxt, "Offer usage terms and conditions");
		click_btn(backArrow);
		click_btn(backArrow);

		
	}
	public static void verifyMyOrderPage() {
	
		
		click_btn(myOrderText);
		getElementText(carrotTxt, "Carrot Australia, Baby wipes, Onion India, Frozen meat, Orange Himac");
		getElementText(allTitleTxt, "My Orders");
		element_isDisplayed(recentlyBoughtRightIMg);
		getElementText(myOrderNumber, "#MGORD-2023-2515121");
		getElementText(myOrderPagePrice, "4.95");
		getElementText(myOrderTimePrice, "28-03-2023 at 16:00");
		getElementText(myOrderPlacedStatus, "Order placed");
		element_isDisplayed(cancelOrder);
		getElementText(cusAddressTxt, "Office - Bur Dhubai, Metro station");
		element_isDisplayed(cusAddressLogo);
		
	
	}
	
	public static void verifyMyOrderViewPage() {
		click_btn(myOrderNumber);
		getElementText(OVPOrderId, "Order ID: #MGORD-2023-2515121");
		getElementText(OVPOrderDateAntTime, "Order data & time:");
		getElementText(OVPOrderDateTxt, "28-03-2023");
		getElementText(OVPOrderAtTxt, "at");
		getElementText(OVPOrderTimeTxt, "16:00");
		getElementText(OVPOrderEstimateTxt, "Estimated delivery:");
		getElementText(OVPEstDateTxt, "28-03-2023");
		getElementText(OVPEstAtTxt, "at");
		getElementText(OVPEstTimeTxt, "16:00");
		getElementText(OVPDowInvTxt, "Download invoice");
		getElementText(cartOffAddImg, "Estimated delivery:");
		getElementText(OVPDelAddTxt, "Home, 257+CSH, Green Community - United Arab Emirates.");
		getElementText(myOrderPlacedStatus, "Order placed");
		getElementText(OVPDateAndTimeTxt, "28-03-2023 at 16:00");
		element_isDisplayed(OVPGreenColorLine);
		getElementText(weekOfferImageTxt, "Onion local from southasian countries");
		getElementText(weekOfferImgQARTxt,"QAR");
		scrollToElement("Cancel order");
		getElementText(OVPOrderNotes, "Order notes");
		getElementText(OVPOrderValue, "Don't ring the bell, keep the order at the delivery box.You shall call me if any queries.");
	
		
	}
	
	
	public static void verifyOrdrePageTotalValue() {

		getElementText(OVPPaymentMethodTxt, "Payment method");
		getElementText(OVPPaymentMethodValue, "Order data & time:");
		getElementText(OVPSubTotalTxt, "Sub total");
		getElementText(OVPSubTotValue, "Sub total");
		getElementText(OVPTaxTxt, "Tax 2%");
		getElementText(OVPTaxValue, "1.88 QAR");
		getElementText(OVPDiscountTxt, "Discount");
		getElementText(OVPDisValue, "5.00 QAR");
		getElementText(OVPDelTxt, "Delivery(Kms)");
		getElementText(OVPDelValue, "6 Kms");
		getElementText(OVPDelTipTxt, "Delivery tip");
		getElementText(OVPDelTipValue, "10.00 QAR");
		getElementText(OVPGrandTotTxt, "Grand total");
		getElementText(OVPGrandTotValue, "133.56 QAR");
		getElementText(OVPQueriesTxt, "Queries?");
		getElementText(OVPCancelOrderBtn, "Cancel order");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}