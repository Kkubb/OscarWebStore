package com.telran.oscar.tests;
import com.telran.oscar.pages.LoginPage;
import com.telran.oscar.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).clickOnLoginOrRegisterButton();
    }

    @Test
    public void loginNegativeTestWithoutData() {
        new LoginPage(driver).clickOnSubmit().takeScreenshot();

    }

}
