package com.ea.springbasic.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

    @FindBy(linkText = "Login")
    public WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(linkText = "Employee Details")
    WebElement lnkEmployeeDetails;

    public LoginPage clickLogin() {
        lnkLogin.click();
        return new LoginPage();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

    public boolean isEmployeeDetailsExist() {
        return lnkEmployeeDetails.isDisplayed();
    }

}
