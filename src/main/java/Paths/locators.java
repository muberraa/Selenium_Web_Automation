package Paths;

import org.openqa.selenium.By;

public class locators {
    public static String EMAIL = "muberra****************com";
    public static String PSSWRD = "*****************";
    public static String SECOND_PAGE = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static final By USER_Login_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By LOGIN = By.cssSelector("[data-cy='header-login-button']");
    public static final By USER_NAME = By.id("L-UserNameField");
    public static final By PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_BUTTON = By.id("gg-login-enter");
    public static final By SEARCH_BOX = By.cssSelector("[data-cy='header-search-input']");
    public static final By SEARCH_BUTTON = By.cssSelector("[data-cy='search-find-button']");
    public static final By NEXT_PAGE_BUTTON = By.className("next-link");
    public static final By PRODUCT_LIST = By.className("product-hslider-container");
    public static final By INCREASE_PRODUCT = By.xpath("//a[@aria-label='Adeti Artır']");
    public static final By ADD_to_BASKET = By.id("add-to-basket");
    public static final By GO_to_BASKET = By.xpath("//span[text()='Sepetim']");
    public static final By HOME_PRICE = By.xpath("//div[@class='total-price']");
    public static final By BASKET_PRICE = By.xpath("(//p)[14]");
    public static final By PRODUCT_COUNT = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By CLEAR_BASKET = By.className("gg-icon-bin-medium");
}
