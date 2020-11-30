package org.fasttrack.steps;
import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPageQA1;

public class CartStepsQA1 {

    private CartPageQA1 CartPageQA1;



    @Step
    public void CartButton() {
        CartPageQA1.open();
        CartPageQA1.clickCartButton();
    }

    @Step
    public void UpdateCartButton() {
        CartPageQA1.open();
        CartPageQA1.clickCartButton();
        CartPageQA1.clickUpdateCartButton();
    }


}
