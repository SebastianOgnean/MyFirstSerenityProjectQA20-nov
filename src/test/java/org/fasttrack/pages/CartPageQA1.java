package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")

public class CartPageQA1 extends PageObject {

    @FindBy(css = "#menu-item-59 > a")
    private WebElementFacade CartButton;

    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr:nth-child(4) > td > button")
    private WebElementFacade UpdateCartButton;



    public void clickCartButton() {
        waitFor(CartButton);
        clickOn(CartButton);
    }

    public void clickUpdateCartButton() {
        waitFor(UpdateCartButton);
        clickOn(UpdateCartButton);
    }


}
