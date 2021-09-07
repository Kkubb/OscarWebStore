package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".dropdown-submenu")
    WebElement submenuBook;

    public ProductPage selectCategory() {
        submenuBook.click();
        return new ProductPage(driver);
    }

    @FindBy(id = "login_link")
    WebElement loginLink;

    public RegisterPage clickOnLoginOrRegisterButton() {
        loginLink.click();
        return new RegisterPage(driver);
    }
    @FindBy(xpath = "//i[@class='icon-user']")
    WebElement accountBtn;

    public ProfilePage clickOnAccount() {
        accountBtn.click();
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//a[@href='/en-gb/catalogue/']")
    WebElement allProductCatalogue;

    public ProductPage openProductCatalogue() {
        allProductCatalogue.click();
        return new ProductPage(driver);
    }

}

