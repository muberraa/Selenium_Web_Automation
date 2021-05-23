import Pages.AddToBasketPage;
import Pages.BasePage;
import Pages.LoginPage;
import Pages.SearchBoxPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;


public class TestSearch extends BaseTest{

    BasePage basepage;
    LoginPage loginpage;
    SearchBoxPage searchboxpage;
    AddToBasketPage addToBasketPage;



    public static Logger logger = LogManager.getLogger(TestSearch.class);




    @Test

    public void login_test() throws InterruptedException{

        loginpage = new LoginPage(driver);
        logger.info("The Login Test started");
        loginpage.hover_To();
        Thread.sleep(4000);
        loginpage.login();
        logger.info("Test Successful.");

    }
    @Test

    public void search_test() throws InterruptedException{
        searchboxpage = new SearchBoxPage(driver);
        logger.info("The Search Test Started");
        searchboxpage.search();
        Thread.sleep(4000);
        searchboxpage.next_page();
        logger.info("Test Successful.");
    }

    @Test

    public void basket_test() throws InterruptedException {
        addToBasketPage = new AddToBasketPage(driver);
        logger.info("The Basket Test Started");
        addToBasketPage.random_select();
        Thread.sleep(4000);
        addToBasketPage.add_to_basket();
        Thread.sleep(4000);
        addToBasketPage.increase_count();
        Thread.sleep(4000);
        addToBasketPage.clear_basket();

        logger.info("Test Successful.");
    }


}
