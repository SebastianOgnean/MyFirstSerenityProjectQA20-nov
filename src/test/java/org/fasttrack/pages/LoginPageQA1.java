package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")

public class LoginPageQA1 extends PageObject {

    @FindBy(id ="username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;

    @FindBy(css ="#post-7 > div > div > ul > li")
    private WebElementFacade errorMessage;

    @FindBy(css ="#post-7 > div > div > ul > li")
    private WebElementFacade errorMessageForPass;


    public void setEmailField(String email){
        typeInto(emailField, email); }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickLogIn(){
        waitFor(loginButton);
        clickOn(loginButton);
    }

    public void verifyErrorMessage(){
        errorMessage.shouldContainOnlyText("ERROR: Invalid email address. Lost your password?");
    }

    public void verifyErrorMessageForPass(){
        errorMessageForPass.shouldContainOnlyText("ERROR: The password you entered for the email address sebastian.ognean@yahoo.com is incorrect. Lost your password?");
    }

}
