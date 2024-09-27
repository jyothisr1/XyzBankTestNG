package com.automation.test;

import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithdrawVerifyTest extends BaseTest {

    @Test
    public void verifyWithdraw() {
        homePage.openWebsite();
        ExtentReportManager.getTest().pass("Open Website");
        homePage.selectCustomerLogin();
        ExtentReportManager.getTest().pass("Select customer login");
        customerPage.selectName();
        customerPage.selectLogin();
        Assert.assertTrue(customerPage.verifyLogin());
        ExtentReportManager.getTest().pass("Login");
        customerPage.selectWithdraw();
        customerPage.enterAmount();
        customerPage.clickWithdraw();
        ExtentReportManager.getTest().pass("Withdraw");
        Assert.assertTrue(customerPage.verifyMessage());
        ExtentReportManager.getTest().pass("Verify withdraw");
    }
}
