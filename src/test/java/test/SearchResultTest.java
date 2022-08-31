package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchResultTest extends BaseTest {

    private static final String SEARCH_KEYWORD = "Etos";

    @Test
    public void addProductToCartAndCheckPrices() {
        getHomePage().searchProductByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().openPDP();
        String productBasePrice = getProductDetailPage().getProductBasePrice();
        getProductDetailPage().clickAddToCartButton();
        getDriver().navigate().refresh();
        getHomePage().openCartPage();
        String cartTotal = getCartPage().getCartTotal();
        Assertions.assertTrue(cartTotal.contains(productBasePrice.substring(2)));
    }

    @Test
    public void addProductToCartAndCheckNames() {
        getHomePage().searchProductByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().openPDP();
        String productName = getProductDetailPage().getProductName();
        getProductDetailPage().clickAddToCartButton();
        getDriver().navigate().refresh();
        getHomePage().openCartPage();
        String addedProductName = getCartPage().getAddedProductName();
        Assertions.assertTrue(productName.equalsIgnoreCase((addedProductName)));
    }
}