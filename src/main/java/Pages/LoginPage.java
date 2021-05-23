package Pages;
import org.openqa.selenium.WebDriver;

import static Paths.locators.*;


public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage hover_To(){

        hover(USER_Login_MENU);
        logger.info("login button appeared");
        return this;



    }
    public LoginPage login(){
        click(LOGIN);
        send_keys(USER_NAME,EMAIL);
        send_keys(PASSWORD,PSSWRD);
        click(LOGIN_BUTTON);
        logger.info("logged in");
        return this;


    }

}
