package com.ait.qa31;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductToTheCardTests extends TestBase{


    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUserHelper().isLoginLinkPresent()){
            app.getUserHelper().clickLogOutLink();
        }
    }

    @BeforeMethod
    public void precondition(){
        app.getUserHelper().clickLoginLink();
        app.getUserHelper().fillLoginForm("aliceSm1234!@gmail.com", "Qwerty1234!");
        app.getUserHelper().clickLoginButton();
    }

    @Test
    public void addProductToCardTest(){
        app.getCartHelper().addProduct();
        app.getCartHelper().clickCartButton();

        Assert.assertTrue(app.getCartHelper().isProductInTheCart());
    }

    @AfterMethod
    public void removeFromCart(){
        app.getCartHelper().clickRemoveProduct();
        app.getCartHelper().clickUpdateCartButton();
    }

}

