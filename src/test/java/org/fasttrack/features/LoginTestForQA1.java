package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginStepsQA1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTestForQA1 {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginStepsQA1 loginStepsQA1;

    @Test
    public void verifyValidLoginTestForQA1(){
        loginStepsQA1.navigateToLoginPageQA1();
        loginStepsQA1.enterCredentials("sebastian.ognean@yahoo.com", "Parola.123456");
        loginStepsQA1.clickLoginButton();
    }

    @Test
    public void InvalidEmailLoginTestForQA1(){
        loginStepsQA1.navigateToLoginPageQA1();
        loginStepsQA1.enterCredentials("sebastian.onean@yahoo.com", "Parola.123456");
        loginStepsQA1.clickLoginButton();
        loginStepsQA1.verifyUserIsNotLoggedIn();
    }

    @Test
    public void InvalidPasswordLoginTestForQA1(){
        loginStepsQA1.navigateToLoginPageQA1();
        loginStepsQA1.enterCredentials("sebastian.ognean@yahoo.com", "arola.123456");
        loginStepsQA1.clickLoginButton();
        loginStepsQA1.verifyUserIsNotLoggedInPass();
    }





}
