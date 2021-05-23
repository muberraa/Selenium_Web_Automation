import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class BasePage {
   static Logger logger = LogManager.getLogger(BasePage.class);

    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("log4j.properties");

        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
    }


    WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator ,String text){
        find(locator).sendKeys(text);
    }
    public void randomProductSelect(By locator) {
        Random rand = new Random();
        findAll(locator).get(rand.nextInt(findAll(locator).size())).click();
    }
    public void assertionUrl(String text) {
        Assert.assertEquals(text, driver.getCurrentUrl());
        logger.info("Link Checked");

    }
    public void hover(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).build().perform();
    }
    public void scrollToProductCount(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", find(locator));

    }

}
