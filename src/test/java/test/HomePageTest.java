package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    private static final String SITE_LOGO = "//*[@class='icon icon-logo']";
    private static final String SING_ICON = "//*[@class='icon icon-user ']";
    private static final String NAVIGATION_MENU = "//*[@class='c-main-menu main-menu js-main-menu-mobile js-menu-level o-container']";

    @Test
    public void checkThatHomePageContainsLogo() {
        Assertions.assertTrue(getHomePage().findElementByXpath(SITE_LOGO));
    }

    @Test
    public void checkThatHomePageContainsSingIcon() {
        Assertions.assertTrue(getHomePage().findElementByXpath(SING_ICON));
    }

    @Test
    public void checkThatHomePageContainsNavigationMenu() {
        Assertions.assertTrue(getHomePage().findElementByXpath(NAVIGATION_MENU));
    }
}