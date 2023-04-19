package com.appium.MegaMart.Page;
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


public class ExtentReport {
	ExtentHtmlReporter htmlReporter;

    ExtentReports extent;
    //helps to generate the logs in the test report.
    ExtentTest test;
@BeforeTest
public void startReport() {
    // initialize the HtmlReporter
    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

    //initialize ExtentReports and attach the HtmlReporter
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);


    //configuration items to change the look and feel
    //add content, manage tests etc
    htmlReporter.config().setChartVisibilityOnOpen(true);
    htmlReporter.config().setDocumentTitle("Simple Automation Report");
    htmlReporter.config().setReportName("Test Report");
    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
    htmlReporter.config().setTheme(Theme.STANDARD);
    
    //htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
}
@AfterTest
public void getResult(ITestResult result) {
    if(result.getStatus() == ITestResult.FAILURE) {
        test.log(Status.FAIL,result.getThrowable());
    }
    else if(result.getStatus() == ITestResult.SUCCESS) {
        test.log(Status.PASS, result.getTestName());
    }
    else {
        test.log(Status.SKIP, result.getTestName());
    }
}


}
