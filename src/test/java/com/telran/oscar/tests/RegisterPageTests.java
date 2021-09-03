package com.telran.oscar.tests;

import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.RegisterPage;
import com.telran.oscar.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).clickOnLoginOrRegisterButton();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "registerNegativeEmailUsingFile")   //при создании файла дата провайдерс
    // нудно создавать лист данных для него. создать в экселе CSV файл, затем перенести этот файл  в проэкт - тест - ресурсы
    public void newUserRegistrationNegative(String email) {
        new RegisterPage(driver).fillRegisterForm("", "Book12345!", "Book12345!");
        Assert.assertTrue(new RegisterPage(driver).isRegisterFormDisplayed());
    }

 //   @Test
 //   public void newUserRegistrationForExistingUser() {
  //      new RegisterPage(driver).fillRegisterForm("booklover1@gmail.com", "Book12345!", "Book12345!");
 //           new RegisterPage(driver).isErrorMessageDisplayed();
 //   }
//    @Test
 //   public void newUserRegistrationPositiveTest() {
  //      new RegisterPage(driver).fillRegisterForm("booklover2@gmail.com", "Book12345!", "Book12345!");
 //       new RegisterPage(driver).isWelcomeMessageDisplayed();
 //   }

//    @Test
 //   public void deleteRegisteredUser() {
 //       new RegisterPage(driver).fillRegisterForm("booklover1@gmail.com", "Book12345!", "Book12345!").goToUserAccount();
 //       Assert.assertTrue(new ProfilePage(driver).isProfilePageDisplayed());
 //       new ProfilePage(driver).deleteProvile().confirmUserDeleted();
 //   }



}

