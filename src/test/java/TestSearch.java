import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;


public class TestSearch extends BaseTest{


    BasePage BasePage;
    LoginPage LoginPage;
    SearchBoxPage SearchBoxPage;
    AddToBasketPage AddToBasketPage;

    static Logger logger = LogManager.getLogger(TestSearch.class);
    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("log4j.properties");

        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
    }



    @Test
    public void login_test() throws InterruptedException{
        logger.info("The Login Test started");
        LoginPage.hover_To().login();

        logger.info("Test Successful.");

    }
    @Test
    public void search_test() throws InterruptedException{
        logger.info("The Search Test Started");
        SearchBoxPage.search();
        SearchBoxPage.next_page();
        logger.info("Test Successful.");
    }

    @Test
    public void basket_test() throws InterruptedException{
        logger.info("The Basket Test Started");
        AddToBasketPage.random_select();
        AddToBasketPage.add_to_basket();
        AddToBasketPage.increase_count();
        AddToBasketPage.clear_basket();
        logger.info("Test Successful.");
    }


}
