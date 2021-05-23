package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Paths.locators.*;

public class AddToBasketPage extends BasePage {

    public AddToBasketPage(WebDriver driver) {

        super(driver);
    }

    public AddToBasketPage random_select(){
        randomProductSelect(PRODUCT_LIST);
        logger.info("The Product Selected");
        return this;

    }
    public AddToBasketPage add_to_basket(){
        click(ADD_to_BASKET);
        logger.info("The Product Added To Basket");
        click(GO_to_BASKET);
        logger.info("You are in Basket");
        Assert.assertEquals(findElement(HOME_PRICE),findElement(BASKET_PRICE));
        logger.info("The Prices are equal");
        return this;

    }
    public AddToBasketPage increase_count(){
        scrollToProductCount(INCREASE_PRODUCT);
        click(INCREASE_PRODUCT);
        Assert.assertEquals(findElement(PRODUCT_COUNT).getText(), "There are 2 Products in Basket");
        logger.info(("The Products Count are 2"));
        return this;
    }
    public  AddToBasketPage clear_basket(){
        click(CLEAR_BASKET);
        logger.info("The Basket is now Empty.");
        return this;

    }
}
