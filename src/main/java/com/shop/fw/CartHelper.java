package com.shop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartHelper extends BaseHelper{

    public CartHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInTheCart() {
        return isElementPresent(By.cssSelector("[href='/141-inch-laptop']"));
    }

    public void clickCartButton() {
        click(By.cssSelector("[href='/cart']"));
    }

    public void addProduct() {
        click(By.cssSelector(".item-box:nth-child(3) .button-2.product-box-add-to-cart-button"));
    }

    public void clickUpdateCartButton() {
        click(By.name("updatecart"));
    }

    public void clickRemoveProduct() {
        click(By.name("removefromcart"));
    }
}

