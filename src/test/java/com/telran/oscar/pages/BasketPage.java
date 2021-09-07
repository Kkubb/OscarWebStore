package com.telran.oscar.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends PageBase {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_form-0-quantity")
    WebElement quantity;

    @FindBy(css = ".input-group-btn .btn")
    WebElement updateQuantity;

    @FindBy(css = ".col-sm-2 .price_color")
    WebElement price;

    public double getPrice() {
        double num = Double.parseDouble(price.getText().replace("£",""));
        return num;
    }

    public BasketPage fillQuantityField(String n) {
        type(quantity,n);
        updateQuantity.click();
        return this;
    }
}