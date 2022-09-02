package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;
import java.util.Objects;


public class BaseTest {

    private static final String ACCEPT_COOKIE_BUTTON = "//button[@class='js-cookie-accept c-button--primary button--small button--block-mobile cookie-bar__button cookie-bar__button--close cookie-bar__button--accept']";

    private WebDriver driver;

    @BeforeEach
    public void profileSetUp() {
        if (Objects.equals(System.getProperty("os.name"), "Mac OS X")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverW.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void acceptCookie() {
        driver.get("https://www.etos.nl/");
        WebElement acceptCookieButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(ACCEPT_COOKIE_BUTTON)));
        acceptCookieButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ACCEPT_COOKIE_BUTTON)));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public ProductDetailPage getProductDetailPage() {
        return new ProductDetailPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public CheckOutPage getCheckOutPage() {
        return new CheckOutPage(getDriver());
    }
}
