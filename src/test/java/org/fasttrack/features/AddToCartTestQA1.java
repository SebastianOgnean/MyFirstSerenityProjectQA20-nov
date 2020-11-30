package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.CartStepsQA1;
import org.fasttrack.steps.ShopStepsQA1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToCartTestQA1 {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private ShopStepsQA1 shopStepsQA1;

    @Steps
    private CartStepsQA1 cartStepsQA1;

    @Test
    public void addToCartButton() {
        shopStepsQA1.addToCartButton("1","2","3");
    }

    @Test
    public void updateCartButton() {
        shopStepsQA1.addToCartButton("5","6","7");
        cartStepsQA1.CartButton();
    }




}