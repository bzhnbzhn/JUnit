package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {

    private static final String CART_TOTAL = "//p[@class='js-sub-total cart-receipt-totals__line-price u-flex-self-right u-text--bold']";
    private static final String CART_SUB_TOTAL = "//span[@class='cart-receipt-totals__line-price u-flex-self-right u-text--bold js-subtotal-value']";
    private static final String ADDED_PRODUCT_NAME = "//div[@class='product-line-item__name']";
    private static final String OPEN_CHECK_OUT_BUTTON = "//div[@class='o-col-12 cart-totals__checkout']";
    private static final String OPEN_CHECK_OUT_BUTTON_IN_POP_UP = "//a[@class='c-button button--small modal__checkout-button js-cart-checkout-button']";
    private static final String EMAIL_INPUT = "//input[@id='email']";
    private static final String CHECK_OUT_SUB_TOTAL = "//strong[@class='js-sub-total u-flex-self-right']";
    private static final String TAX = "//span[@class='js-shipping-cost-total total-summary__shipping-label u-flex-self-right']";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartTotal() {
        return driver.findElement(By.xpath(CART_TOTAL)).getText();
    }

    public String getCartSubTotal() {
        return driver.findElement(By.xpath(CART_SUB_TOTAL)).getText();
    }

    public String getAddedProductName() {
        return driver.findElement(By.xpath(ADDED_PRODUCT_NAME)).getText();
    }

    public void clickCheckOutButton() {
        driver.findElement(By.xpath(OPEN_CHECK_OUT_BUTTON)).click();
    }

    public void clickCheckOutButtonInPopUp() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(OPEN_CHECK_OUT_BUTTON_IN_POP_UP))).click();
    }

    public void openCheckOut() {
        driver.get("https://www.etos.nl/afrekenen/#/");
    }

    public void addUserEmail(String userEmail) {
        new Actions(driver).moveToElement(driver.findElement(By.xpath(EMAIL_INPUT))).click().perform();
        driver.findElement(By.xpath(EMAIL_INPUT)).sendKeys(userEmail);
    }
}
