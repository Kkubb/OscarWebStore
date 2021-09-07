package com.telran.oscar.tests;


import com.telran.oscar.pages.BasketPage;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasketPageTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).selectCategory();
    }

    @Test
    public void checkTotalPriceTest() {
        new ProductPage(driver).addItemToBasket().clickOnViewBasketBtn();
        double price = new BasketPage(driver).getPrice();
        System.out.println(price);
        new BasketPage(driver).fillQuantityField("2").pause(10000);
        Assert.assertEquals(new BasketPage(driver).getPrice(),price*2);
    }

}