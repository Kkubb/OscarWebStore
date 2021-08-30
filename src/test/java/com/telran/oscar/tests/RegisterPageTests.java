package com.telran.oscar.tests;

import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).clickOnLoginOnRegisterButton();
    }

    @Test
    public void newUserRegistrationNegative() {
        new RegisterPage(driver).fillRegisterForm().clickOnSubmit();
        Assert.assertTrue(new RegisterPage(driver).isErrorMessageDisplayed());
    }

}

