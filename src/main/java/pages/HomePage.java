package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private static final String SEARCH_INPUT = "//input[@class='input__input search-v2__input js-search-input-v2']";
    private static final String HOME_PAGE_LINK = "https://www.etos.nl/";
    private static final String CART_ICON = "//a[@class='minicart__item minicart__item--link js-minicart-link']";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProductByKeyWord(final String keyword) {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword + Keys.ENTER);
    }

    public WebElement getSearchInput() {
        return driver.findElement(By.xpath(SEARCH_INPUT));
    }

    public void findElementByXpath(String element) {
        driver.get(HOME_PAGE_LINK);
        driver.findElement(By.xpath(element)).isDisplayed();
    }

    public void findElementByClassName(String element) {
        driver.get(HOME_PAGE_LINK);
        driver.findElement(By.className(element)).isDisplayed();
    }

    public void openCartPage(){
        driver.findElement(By.xpath(CART_ICON)).click();
    }
}