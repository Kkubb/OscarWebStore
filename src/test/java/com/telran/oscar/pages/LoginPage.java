package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_login-username")
    WebElement emailField;

    @FindBy(id = "id_login-password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@name='login_submit']")
    WebElement loginBtn;

    public ProfilePage fillLoginForm(String email, String pwd) {
        type(emailField, email);
        type(passwordField, pwd);
        loginBtn.click();
        return new ProfilePage(driver);
    }

    public LoginPage clickOnSubmit() {
        loginBtn.click();
        //  takeScreenshot();
        return this;
    }
}
