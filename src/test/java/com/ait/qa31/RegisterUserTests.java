package com.ait.qa31;

import com.shop.fw.DataProviders;
import com.shop.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegisterUserTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        if (!app.getUserHelper().isLoginLinkPresent()) {
            app.getUserHelper().clickLogOutLink();
        }
    }




    @Test
    public void createNewUserTest(){
        app.getUserHelper().clickRegisterLink();
        app.getUserHelper().fillRegisterForm(new User()
                .setFirstName("Janna")
                .setLastName("Smith")
                .setEmail("janna12346@gmail.com")
                .setPassword("Qwerty1234!")
                .setConfirmPassword("Qwerty1234!"));

        app.getUserHelper().clickRegisterButton();

        Assert.assertTrue(app.getUserHelper().isLogOutLinkPresent());

    }




//    @Test(dataProvider = "registerUsersFromCSV_File", dataProviderClass =  DataProvider.class)
//    public void addUsersFromCSVFilePositiveTest(User user){
//        app.getUserHelper().clickRegisterLink();
//        app.getUserHelper().fillRegisterForm(user);
//
//        app.getUserHelper().clickRegisterButton();
//
//        Assert.assertTrue(app.getUserHelper().isLogOutLinkPresent());
//
//    }


//    @Test(dataProvider = "registerUsersWithCSV", dataProviderClass =  DataProviders.class)
//    public void createNewAccountPositiveTestFromDataProviderWithFile(User user) {
//
//        app.getUserHelper().clickRegisterLink();
//        app.getUserHelper().fillRegisterForm(user);
//        app.getUserHelper().clickRegisterButton();
//        Assert.assertTrue(app.getUserHelper().isLogOutLinkPresent());
//        app.getUserHelper().clickLogOutLink();
//    }


}

