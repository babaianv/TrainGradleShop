package com.shop.fw;

import com.shop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLogOutLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }

    public void clickRegisterButton() {
        click(By.cssSelector("#register-button"));
    }

    public void fillRegisterForm(User user) {
        type(By.cssSelector("#FirstName"), user.getFirstName());
        type(By.cssSelector("#LastName"), user.getLastName());
        type(By.cssSelector("#Email"), user.getEmail());
        type(By.cssSelector("#Password"), user.getPassword());
        type(By.cssSelector("#ConfirmPassword"), user.getConfirmPassword());
    }

    public void clickRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickLogOutLink() {
        click(By.xpath("[href='/logout']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.cssSelector("#Email"), email);
        type(By.cssSelector("#Password"), password);
    }

    public void clickLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void clickLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }
}

