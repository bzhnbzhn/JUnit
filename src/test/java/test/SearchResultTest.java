package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchResultTest extends BaseTest {

    private static final String SEARCH_KEYWORD = "Etos Woezel & Pip Luierbroekjes";

    @Test
    public void addProductToCartAndCheckPrices() {
        getHomePage().searchProductByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().openPDP();
        String productName = getProductDetailPage().getProductName();
        getProductDetailPage().clickAddToCartButton();
        getDriver().navigate().refresh();
        getHomePage().openCartPage();
        String addedProductName = getCartPage().getAddedProductName();
        String cartSubTotal = getCartPage().getCartSubTotal();
        String cartTotal = getCartPage().getCartTotal();
        getCartPage().openCheckOut();
        getCartPage().addUserEmail("test@user.email");
        String checkOutSubTotal = getCheckOutPage().getCheckOutSubTotal();
        String tax = getCheckOutPage().getTax();

        Assertions.assertTrue(productName.equalsIgnoreCase((addedProductName)));
        Assertions.assertEquals(cartTotal, cartSubTotal);
        Assertions.assertEquals(cartTotal, checkOutSubTotal);
        Assertions.assertEquals("€ 3,99", tax);
    }
}