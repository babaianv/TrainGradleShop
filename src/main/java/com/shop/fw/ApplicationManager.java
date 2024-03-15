package com.shop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {

    static WebDriver driver;
    String browser;
    UserHelper userHelper;
    BaseHelper baseHelper;
    CartHelper cartHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        userHelper = new UserHelper(driver);
        baseHelper = new BaseHelper(driver);
        cartHelper = new CartHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public BaseHelper getBaseHelper() {
        return baseHelper;
    }

    public CartHelper getCartHelper() {
        return cartHelper;
    }
}

