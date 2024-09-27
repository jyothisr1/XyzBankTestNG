package com.automation.listerner;


import com.automation.utils.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListerner implements ITestListener {
    @Override
        public void onFinish(ITestContext context) {
            ExtentReportManager.flush();
        }

        public void onStart(ITestContext context) {
            ExtentReportManager.initExtentReporter();
        }

        public void onTestStart(ITestResult result) {
            ExtentReportManager.createTest(result.getMethod().getMethodName());
        }

        public void onTestSuccess(ITestResult result) {
            ExtentReportManager.getTest().pass("test pass");
        }

        public void onTestFailure(ITestResult result) {
            ExtentReportManager.getTest().fail("test failed \n"+result.getThrowable().getMessage());
        }

        public void onTestSkipped(ITestResult result) {
            ExtentReportManager.getTest().skip("skipped");
        }
}
