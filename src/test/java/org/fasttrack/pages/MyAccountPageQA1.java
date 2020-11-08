package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")

public class MyAccountPageQA1 extends PageObject {

    @FindBy(id ="reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;


    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessage;


    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickRegister(){ clickOn(registerButton);
    }


    public void verifyUserIsRegistered(String userName){
        welcomeMessage.shouldContainText("Hello, "+userName+"!");
    }

    public void verifyLoggedIn(String userName){
        welcomeMessage.shouldContainText("Hello, "+userName+"!");
    }




}
