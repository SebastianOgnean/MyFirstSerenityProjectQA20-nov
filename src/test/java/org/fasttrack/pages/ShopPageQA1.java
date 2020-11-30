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

    @FindBy(css = "tr.product:nth-of-type(1) td.woocommerce-grouped-product-list-item__quantity input")
    private WebElementFacade QtyHoodieWithLogo;

    @FindBy(css = "tr.product:nth-of-type(2) td.woocommerce-grouped-product-list-item__quantity input")
    private WebElementFacade QtyTshirt;

    @FindBy(css = "tr.product:nth-of-type(3) td.woocommerce-grouped-product-list-item__quantity input")
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

    public void selectQtyHoodieWithLogo(String number) {
       typeInto(QtyHoodieWithLogo, number);
    }

    public void selectQtyTshirt(String number) {
        typeInto(QtyTshirt, number);
    }

    public void selectQtyBeanie(String number) {
        typeInto(QtyBeanie, number);
    }

    public void clickAddToCartButton() {
        waitFor(AddToCartButton);
        clickOn(AddToCartButton);
    }



}




