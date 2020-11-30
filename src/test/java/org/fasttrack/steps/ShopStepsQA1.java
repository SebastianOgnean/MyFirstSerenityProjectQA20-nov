package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
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
    public void selectQtyForLogoCollection(String QtyHoodieWithLogo) {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyHoodieWithLogo(QtyHoodieWithLogo);
    }

    @Step
    public void selectQtyForTshirtFromLogoCollection(String QtyTshirt) {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyTshirt(QtyTshirt);
    }

    @Step
    public void selectQtyForBeanieFromLogoCollection(String QtyBeanie) {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyBeanie(QtyBeanie);

    }

    @Step
    public void addToCartButton(String QtyHoodieWithLogo, String QtyTshirt, String QtyBeanie) {
        ShopPageQA1.open();
        ShopPageQA1.clickShopButton();
        ShopPageQA1.clickLogoCollectionProduct();
        ShopPageQA1.selectQtyHoodieWithLogo(QtyHoodieWithLogo);
        ShopPageQA1.selectQtyTshirt(QtyTshirt);
        ShopPageQA1.selectQtyBeanie(QtyBeanie);
        ShopPageQA1.clickAddToCartButton();

    }




}
