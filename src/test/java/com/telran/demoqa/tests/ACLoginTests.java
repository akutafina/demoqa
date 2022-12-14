package com.telran.demoqa.tests;

import com.telran.demoqa.pages.ACLoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ACLoginTests extends BaseTests{


    @BeforeMethod
    public void ensurePreconditions(){
        new ACLoginPage(driver).goWithURL();
    }

    @Test
    public void loginWithKeyboardTestNegative(){
        new ACLoginPage(driver)
                .loginWithKeyboard("test_login", "test_pwd");
    }

    @Parameters({"login", "password"})
    @Test
    public void loginWithParamsNegative(String login, String pwd){
        new ACLoginPage(driver)
                .loginWithKeyboard(login, pwd);
    }

    @Test
    public void loginWithKeyboardCopyPasteTestNegative(){
        new ACLoginPage(driver)
                .loginWithKeyboardCopyPaste("test_login");
    }

    @Test
    public void loginPositive(){
        new ACLoginPage(driver);
    }

}
