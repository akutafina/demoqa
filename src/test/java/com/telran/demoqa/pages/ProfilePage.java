package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(id = "userName-value")
    WebElement userNameText;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return userNameText.getText();
    }
}
