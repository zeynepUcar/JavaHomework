package sel_day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task4TestNG {

    private WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty( "webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver" );
        driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html" );
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }

    @Test
    public void test(){
        driver.findElement( By.id( "autoclosable-btn-success" ) ).click();
        WebDriverWait wait = new WebDriverWait( driver, 4 );
        try {
            wait.until( ExpectedConditions.invisibilityOfElementLocated( By.className( "alert-autocloseable-success" ) ) );
        } catch(Exception e) {
            Assert.fail( "The element did not disappear in 4 seconds", e );
        }

    }

}
