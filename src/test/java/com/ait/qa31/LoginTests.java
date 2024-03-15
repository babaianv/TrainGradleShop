package com.ait.qa31;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        if (!app.getUserHelper().isLoginLinkPresent()){
            app.getUserHelper().clickLogOutLink();
        }
    }

    @Test
    public void loginFormTest(){
        app.getUserHelper().clickLoginLink();
        app.getUserHelper().fillLoginForm("aliceSm1234!@gmail.com", "Qwerty1234!");
        app.getUserHelper().clickLoginButton();

        Assert.assertTrue(app.getUserHelper().isLogOutLinkPresent());
    }

}

