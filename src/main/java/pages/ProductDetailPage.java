package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage extends BasePage{

    private static final String PRODUCT_NAME = "//h1[@property='name']";
    private static final String PRODUCT_BASE_PRICE = "//span[@class='price__base']";
    private static final String ADD_TO_CART_BUTTON = "//div[@class='product-hero__quantity-selector']//button[@class='js-quantity-selector-button-add js-quantity-selector-button-add-to-cart c-button--primary button--icon quantity-selector__add-to-cart-button c-button transformed']";

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return driver.findElement(By.xpath(PRODUCT_NAME)).getText();
    }

    public String getProductBasePrice(){
        WebElement productBasePrice = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(PRODUCT_BASE_PRICE)));
        return productBasePrice.getText();
    }

    public void clickAddToCartButton(){
        driver.findElement(By.xpath(ADD_TO_CART_BUTTON)).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until((ExpectedConditions.invisibilityOfElementLocated(By.xpath(ADD_TO_CART_BUTTON))));
    }
}
