import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Web Driver setup and quit

public class BaseTest {

    WebDriver driver;



    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        //A Bigger Browser Screen
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
