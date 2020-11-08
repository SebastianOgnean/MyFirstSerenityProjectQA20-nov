package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
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

    @Test
    public void addToCartButton(){
        shopStepsQA1.navigateToShopPage();
        shopStepsQA1.clickLogoCollection();
        shopStepsQA1.selectQtyForLogoCollection();
        shopStepsQA1.selectQtyForTshirtFromLogoCollection();
        shopStepsQA1.selectQtyForBeanieFromLogoCollection();
        shopStepsQA1.addToCartButton();
    }





}
