package com.telran.oscar.pages;

import com.telran.oscar.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "delete_profile")
    WebElement deleteAccountBtn;

    public ProfilePage clickOnDeleteAccount() {
        deleteAccountBtn.click();
        return this;
    }

    @FindBy(id = "id_password")
    WebElement deletePwdField;

    @FindBy(css = ".btn.btn-lg.btn-danger")
    WebElement deleteBtn;

    public HomePage deleteAccount(String text) {
        type(deletePwdField, text);
        deleteBtn.click();
        return new HomePage(driver);
    }

    @FindBy(xpath = "//*[.='Edit profile']")
    WebElement editBtn;

    public ProfilePage clickOnEditBtn() {
        editBtn.click();
        return this;
    }

    @FindBy(id = "id_first_name")
    WebElement firstNameField;

    public ProfilePage editFirstNameField(String fName) {
        type(firstNameField, fName);
        return this;
    }

    @FindBy(css = ".btn.btn-lg.btn-primary")
    WebElement submitBtn;

    public ProfilePage clickOnSubmit() {
        submitBtn.click();
        return this;
    }

    @FindBy(css = "tr:nth-child(1) > td")
    WebElement firstNameCell;

    public boolean isFirstNameContainsText(String text) {
        return firstNameCell.getText().contains(text);
    }
}
