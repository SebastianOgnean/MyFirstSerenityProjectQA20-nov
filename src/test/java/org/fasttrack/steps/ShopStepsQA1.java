package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePageQA1;
import org.fasttrack.pages.ShopPageQA1;

public class ShopStepsQA1 {

    private ShopPageQA1 ShopPageQA1;

    @Step
    public void navigateToShopPage() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
    }

    @Step
    public void clickLogoCollection() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
    }

    @Step
    public void selectQtyForLogoCollection() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyHoodieWithLogo();
    }

    @Step
    public void selectQtyForTshirtFromLogoCollection() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyTshirt();
    }

    @Step
    public void selectQtyForBeanieFromLogoCollection() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyBeanie();
    }

    @Step
    public void addToCartButton() {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyHoodieWithLogo();
        ShopPageQA1.selectQtyTshirt();
        ShopPageQA1.selectQtyBeanie();
        ShopPageQA1.clickAddToCartButon();

    }







}
