package com.ea.springbasic.pages;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

    public void performLogin() {

        webDriver.get("http://eaapp.somee.com");
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.clickLogin();
    }
}
