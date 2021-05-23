package Pages;

import org.openqa.selenium.WebDriver;

import static Paths.locators.*;

public class SearchBoxPage extends BasePage {
    public SearchBoxPage(WebDriver driver) {
        super(driver);
    }

    public SearchBoxPage search() {
        send_keys(SEARCH_BOX,"Bilgisayar");
        click(SEARCH_BUTTON);
        logger.info("Text searched.");
        return this;
    }
    public SearchBoxPage next_page(){
        logger.info("Going To Second Page");
        click(NEXT_PAGE_BUTTON);
        assertionUrl(SECOND_PAGE);
        logger.info("second page location check done");
        return this;
    }



}
