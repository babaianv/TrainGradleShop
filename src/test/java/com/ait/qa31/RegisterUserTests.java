package com.ait.qa31;

import com.shop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTests extends TestBase{

//    @BeforeMethod
//    public void precondition(){
//        if (!app.getUserHelper().isLogOutLinkPresent()){
//            app.getUserHelper().clickLogOutLink();
//        }
//    }

    @Test
    public void createNewUserTest(){
        app.getUserHelper().clickRegisterLink();
        app.getUserHelper().fillRegisterForm(new User()
                .setFirstName("Si")
                .setLastName("Smith")
                .setEmail("simm123467!@gmail.com")
                .setPassword("Qwerty1234!")
                .setConfirmPassword("Qwerty1234!"));

        app.getUserHelper().clickRegisterButton();

        Assert.assertTrue(app.getUserHelper().isLogOutLinkPresent());

    }


}

