package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
   public static Logger logger = LogManager.getLogger(BasePage.class);




    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public WebElement findElement(By locator){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElements(locator);
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        findElement(locator).click();
    }
    public void send_keys(By locator ,String text){

        findElement(locator).sendKeys(text);
    }
    public void randomProductSelect(By locator) {
        Random rand = new Random();
        findElements(locator).get(rand.nextInt(findElements(locator).size())).click();
    }
    public void assertionUrl(String text) {
        Assert.assertEquals(text, driver.getCurrentUrl());
        logger.info("Link Checked");

    }
    public void hover(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(locator)).build().perform();

    }
    public void scrollToProductCount(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(locator));

    }

}
