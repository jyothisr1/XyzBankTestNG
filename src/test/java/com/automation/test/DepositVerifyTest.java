package com.automation.test;

import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepositVerifyTest extends BaseTest {
    @Test
    public void verifyDeposit() {
        homePage.openWebsite();
        ExtentReportManager.getTest().pass("Open Website");
        homePage.selectCustomerLogin();
        ExtentReportManager.getTest().pass("Select customer login");
        customerPage.selectName();
        customerPage.selectLogin();
        Assert.assertTrue(customerPage.verifyLogin());
        ExtentReportManager.getTest().pass("Login");
        customerPage.selectDeposit();
        customerPage.enterAmount();
        customerPage.clickDeposit();
        ExtentReportManager.getTest().pass("Deposit");
        Assert.assertTrue(customerPage.depositVerifyMessage());
        ExtentReportManager.getTest().pass("Verify deposit");
    }
}
