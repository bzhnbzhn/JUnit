package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    private static final String SITE_LOGO = "//*[@class='icon icon-logo']";
    private static final String SING_ICON = "//*[@class='icon icon-user ']";
    private static final String NAVIGATION_MENU = "//*[@class='c-main-menu main-menu js-main-menu-mobile js-menu-level o-container']";

    @Tag("smoke")
    @Test
    public void checkThatHomePageContainsLogo() {
        getHomePage().findElementByXpath(SITE_LOGO);
    }

    @Tag("smoke")
    @Test
    @Disabled
    public void checkThatHomePageContainsSingIcon() {
        getHomePage().findElementByClassName(SING_ICON);
    }

    @Tag("smoke")
    @Test
    public void checkThatHomePageContainsNavigationMenu() {
        getHomePage().findElementByXpath(NAVIGATION_MENU);
    }
}
