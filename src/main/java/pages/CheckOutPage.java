package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage extends BasePage {

    private static final String CHECK_OUT_SUB_TOTAL = "//strong[@class='js-sub-total u-flex-self-right']";
    private static final String TAX = "//span[@class='js-shipping-cost-total total-summary__shipping-label u-flex-self-right']";

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public String getCheckOutSubTotal() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHECK_OUT_SUB_TOTAL)));
        return driver.findElement(By.xpath(CHECK_OUT_SUB_TOTAL)).getAttribute("innerText");
    }

    public String getTax() {
        return driver.findElement(By.xpath(TAX)).getAttribute("innerText");
    }
}
