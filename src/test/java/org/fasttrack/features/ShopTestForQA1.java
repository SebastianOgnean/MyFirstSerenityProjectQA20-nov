package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.ShopStepsQA1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ShopTestForQA1 {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private ShopStepsQA1 shopStepsQA1;

    @Test
    public void GoToShopPage(){
       shopStepsQA1.navigateToShopPage();
    }

    @Test
    public void SelectProductLogoCollection(){
        shopStepsQA1.clickLogoCollection();
    }

    @Test
    public void selectQtyForHoodieLogoCollection(){
        shopStepsQA1.selectQtyForLogoCollection("3");
    }

    @Test
    public void selectQtyForTshirtFromLogoCollection(){
        shopStepsQA1.selectQtyForTshirtFromLogoCollection("2");
    }

   @Test
    public void selectQtyForBeanieFromLogoCollection(){
        shopStepsQA1.selectQtyForBeanieFromLogoCollection("3");
    }



}
