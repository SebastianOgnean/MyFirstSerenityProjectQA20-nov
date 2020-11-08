package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")

public class ShopPageQA1 extends PageObject {

    @FindBy(css = "#menu-item-60 > a")
    private WebElementFacade ShopButton;

    @FindBy(css = "#main > ul > li.post-31.product.type-product.status-publish.has-post-thumbnail.product_cat-clothing.clearfix.instock.sale.shipping-taxable.product-type-grouped > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
    private WebElementFacade LogoCollection;

    @FindBy(css = "#quantity_5fa66999b9236")
    private WebElementFacade QtyHoodieWithLogo;

    @FindBy(css = "#quantity_5fa67a2368518")
    private WebElementFacade QtyTshirt;

    @FindBy(css = "#quantity_5fa67a2369b7c")
    private WebElementFacade QtyBeanie;

    @FindBy(css = "#product-31 > div.summary.entry-summary > form > button")
    private WebElementFacade AddToCartButton;



    public void clickShopButton() {
        waitFor(ShopButton);
        clickOn(ShopButton);
    }

    public void clickLogoCollectionProduct() {
        waitFor(LogoCollection);
        clickOn(LogoCollection);
    }

    public void selectQtyHoodieWithLogo() {
        waitFor(QtyHoodieWithLogo);
        clickOn(QtyHoodieWithLogo);
    }

    public void selectQtyTshirt() {
        waitFor(QtyTshirt);
        clickOn(QtyTshirt);
    }

    public void selectQtyBeanie() {
        waitFor(QtyBeanie);
        clickOn(QtyBeanie);
    }

    public void clickAddToCartButon() {
        waitFor(AddToCartButton);
        clickOn(AddToCartButton);
    }





}
