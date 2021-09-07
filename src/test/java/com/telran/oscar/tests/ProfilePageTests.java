package com.telran.oscar.tests;

import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginPage;
import com.telran.oscar.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTests extends TestBase {

    @BeforeMethod
    public void EnsurePreconditions() {
        new HomePage(driver).clickOnLoginOrRegisterButton();
        new LoginPage(driver).fillLoginForm("draft@gm.com", "Draft1234");
        new HomePage(driver).clickOnAccount();
    }

    @Test
    public void editProfileTest() {
        new ProfilePage(driver).clickOnEditBtn().editFirstNameField("Barry").clickOnSubmit();
        Assert.assertTrue(new ProfilePage(driver).isFirstNameContainsText("Barry"));
    }

}
