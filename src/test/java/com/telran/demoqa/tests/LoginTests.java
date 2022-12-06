package com.telran.demoqa.tests;

import com.telran.demoqa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void loginTestPositive() {
        String currentUserName = "user1568";
        String currentPwd = "enEwC9!_";

        Assert.assertEquals(
                new LoginPage(driver)
                        .login(currentUserName, currentPwd)
                        .getUserName(),
                currentUserName, "UserName expected is: " + currentUserName);
    }
}
