package com.telran.oscar.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".page-header.action")
    WebElement pageHeader;

    public boolean isItProductPage() {
        return pageHeader.isDisplayed();
    }

    @FindBy(xpath = "//li[2]//ul[1]//li[1]//a[@href='/en-gb/catalogue/category/books/fiction_3/'][contains(.,'Fiction')]")
    WebElement fictionCatalogue;

    @FindBy(xpath = "(//a[contains(text(),'Non-Fiction')])[2]")
    WebElement nonFictionCatalogue;

    public ProductPage goToFictionCatalogue() {
        fictionCatalogue.click();
        return this;
    }

    public ProductPage goToNonFictionCatalogue() {
        nonFictionCatalogue.click();
        return this;
    }

    @FindBy(xpath = "//div[@class='page-header action'][contains(.,'Fiction')]")
    WebElement fictionTitle;

    @FindBy(xpath = "//div[@class='page-header action'][contains(.,'Non-Fiction')]")
    WebElement nonFictionTitle;

    public boolean isFictionCategoryDisplayed() {
        return fictionTitle.isDisplayed();
    }

    public boolean isNonFictionCategoryDisplayed() {
        return nonFictionTitle.isDisplayed();
    }

    public String getItemNameFromList(int number) {
        return driver.findElement(By.cssSelector(".col-xs-6:nth-child(" + number + ") h3 > a"))
                .getText();
    }

    public ProductPage clickOnItemName(int num) {
        driver.findElement(By.cssSelector(".col-xs-6:nth-child(" + num + ") h3 > a")).click();
        return this;
    }

    @FindBy(css = "h1")
    WebElement productTitle;

    public String getItemName() {
        return productTitle.getText();
    }

    @FindBy(css = ".col-xs-6:nth-child(1) .btn")
    WebElement addToBasketBtn;

    public ProductPage addItemToBasket() {
        addToBasketBtn.click();
        return this;
    }

    @FindBy(xpath = "//a[.='View basket']")
    WebElement viewBasketBtn;

    public BasketPage clickOnViewBasketBtn() {
        viewBasketBtn.click();
        return new BasketPage(driver);
    }

}