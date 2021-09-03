package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_registration-email")
    WebElement emailField;

    @FindBy(id = "id_registration-password1")
    WebElement passewordField;

    @FindBy(id = "id_registration-password2")
    WebElement confirmPasswordField;

    @FindBy(name = "registration_submit")
    WebElement registerBtn;

    public RegisterPage fillRegisterForm(String email, String pwd, String pwd1) {
        type(emailField, email);
        type(passewordField, pwd);
        type(confirmPasswordField,pwd1);
        registerBtn.click();
        return this;
    }

    @FindBy(id = "register_form")
    WebElement registerForm;

    public boolean isRegisterFormDisplayed() {
        return registerForm.isDisplayed();
    }
}
//Working login:
//Login:	booklover1@gmail.com
//Password: 	Book12345!