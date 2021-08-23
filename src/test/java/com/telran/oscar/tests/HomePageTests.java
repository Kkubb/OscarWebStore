package com.telran.oscar.tests;

import com.telran.oscar.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{
    HomePage homePage;

    @BeforeMethod
    public void pageInit() {
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void userCanSelectItemMenuTest() {
        homePage.selectCategory();

    }
}
