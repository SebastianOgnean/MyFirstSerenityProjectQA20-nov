package org.fasttrack.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")

public class HomePageQA1 extends PageObject {

    @FindBy(css = "#menu-item-58 > a")
    private WebElementFacade accountButton;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > h2")
    private WebElementFacade registerLink;


    public void clickAccountButton() {
        waitFor(accountButton);
        clickOn(accountButton);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }




}
