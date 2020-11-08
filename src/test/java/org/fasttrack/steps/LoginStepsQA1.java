package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePageQA1;
import org.fasttrack.pages.LoginPageQA1;
import org.fasttrack.pages.MyAccountPageQA1;

public class LoginStepsQA1 {
    private HomePageQA1 homePage;
    private MyAccountPageQA1 myAccountPageQA1;
    private LoginPageQA1 loginPageQA1;
    @Step
    public void navigateToLoginPageQA1() {
        homePage.open();
        homePage.clickAccountButton();
    }

    @Step
    public void enterCredentials(String email, String password){
        loginPageQA1.setEmailField(email);
        loginPageQA1.setPasswordField(password);
    }

    @Step
    public void clickLoginButton(){ loginPageQA1.clickLogIn();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
        myAccountPageQA1.verifyLoggedIn(userName);
    }

   @Step
    public void verifyUserIsNotLoggedIn(){
        loginPageQA1.verifyErrorMessage();
    }

    @Step
    public void verifyUserIsNotLoggedInPass(){
        loginPageQA1.verifyErrorMessageForPass();
    }

    //@Step
    public void logIn(String user, String pass){
        navigateToLoginPageQA1();
        enterCredentials(user,pass);
        clickLoginButton();
    }





}
