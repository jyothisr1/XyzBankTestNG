package com.automation.pages;


import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[text()='Customer Login']")
    WebElement customerLoginButton;


    public void openWebsite() {

        driver.get(ConfigReader.getConfigValue("website.url"));
    }

    public void isHomePageDisplayed() {
    }

    public void selectCustomerLogin() {
        customerLoginButton.click();
    }
}
