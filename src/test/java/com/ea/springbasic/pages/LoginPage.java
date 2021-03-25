package com.ea.springbasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @FindBy(name = "UserName")
    public WebElement txtUserName;
    @FindBy(name = "Password")
    public WebElement txtPassword;
    @FindBy(css = ".btn-default")
    public WebElement btnLogin;

    public void login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage clickLogin() {
        btnLogin.click();
        return new HomePage();
    }

}
