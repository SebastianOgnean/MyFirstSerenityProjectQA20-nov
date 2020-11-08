package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePageQA1;
import org.fasttrack.pages.MyAccountPageQA1;

public class RegisterStepsQA1 {

    private HomePageQA1 homePage;
    private MyAccountPageQA1 myAccountPageQA1;

    @Step
    public void navigateToMyAccount() {
        homePage.open();
        homePage.clickAccountButton();
        homePage.clickRegisterLink();
    }
    @Step
    public void enterCredentials(String email, String password){
        myAccountPageQA1.setEmailField(email);
        myAccountPageQA1.setPasswordField(password);
    }

    @Step
    public void clickRegister(){ myAccountPageQA1.clickRegister();
    }

    @Step
    public void verifyIfUserIsRegistered(String userName){ myAccountPageQA1.verifyUserIsRegistered(userName);
    }




}
