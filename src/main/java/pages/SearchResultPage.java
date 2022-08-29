package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

    private static final String PRODUCT_TILE = "//div[@class='product product-grid__product js-grid-tile-product']";


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void openPDP(){
        driver.findElement(By.xpath(PRODUCT_TILE)).click();
    }




}
