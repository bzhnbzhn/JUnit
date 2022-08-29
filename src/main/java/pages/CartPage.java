package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private static final String CART_TOTAL = "//p[@class='js-sub-total cart-receipt-totals__line-price u-flex-self-right u-text--bold']";
    private static final String ADDED_PRODUCT_NAME = "//div[@class='product-line-item__name']";
    private static final String OPEN_CHECK_OUT_BUTTON = "//div[@class='o-col-12 cart-totals__checkout']";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartTotal() {
        return driver.findElement(By.xpath(CART_TOTAL)).getText();
    }

    public String getAddedProductName() {
        return driver.findElement(By.xpath(ADDED_PRODUCT_NAME)).getText();
    }

    public void openCheckOutButton(){
        driver.findElement(By.xpath(OPEN_CHECK_OUT_BUTTON)).click();

    }
}
