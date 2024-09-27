package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage extends BasePage{

    @FindBy(xpath = "//div[@class='form-group']/child::select")
    WebElement selectName;

    @FindBy(css = "button[type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//strong[text()=' Welcome ']")
    WebElement welcomeMessage;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement selectWithdraw;

    @FindBy(xpath = "//input[@type='number']")
    WebElement enterAmount;

    @FindBy(css = "button[type='submit']")
    WebElement withdrawButton;

    @FindBy(xpath = "//div[@class='ng-scope']/child::span")
    WebElement withdrawSuccessMessage;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement selectDeposit;

    @FindBy(css = "button[type='submit']")
    WebElement depositButton;

    public void selectName() {
        Select name=new Select(selectName);
        name.selectByIndex(1);
    }

    public void selectLogin() {
        loginButton.click();
    }

    public boolean verifyLogin() {
       return welcomeMessage.isDisplayed();
    }

    public void selectWithdraw() {
        selectWithdraw.click();
    }

    public void enterAmount() {
        enterAmount.sendKeys("1001");
    }

    public void clickWithdraw() {
        withdrawButton.click();
    }

    public boolean verifyMessage() {
       return withdrawSuccessMessage.getText().contains("Transaction successful");
    }

    public void selectDeposit() {
        selectDeposit.click();
    }

    public void clickDeposit() {
        depositButton.click();
    }

    public boolean depositVerifyMessage() {
        return withdrawSuccessMessage.getText().contains("Deposit Successful");
    }
}
