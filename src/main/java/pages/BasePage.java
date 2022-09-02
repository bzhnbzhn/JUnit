package pages;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {
    static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public void implicitWait(long timeToWait) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}