package sel_day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HWfromDay7 {
    // https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html
    // click on the "Autocloseable success message" button
    // then validate that "I'm an autocloseable success  message. I will hide in 5 seconds."
    // disappears, wait at least 10 seconds for it to disappear

    // repeat Task 4 for all the buttons. Success, warning, danger and info buttons.
    private WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html" );
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }

    @Test(dataProvider = "buttonProvider")
    public void clickButton(String button){
        driver.findElement( By.id( "normal-btn-" + button ) ).click();
        String text = driver.findElement( By.className( "alert-normal-" + button ) ).getText();
        String buttonText = driver.findElement( By.cssSelector( ".alert-normal-" + button +" > button" ) ).getText();
        String textWithoutButton = text.replaceAll( buttonText, "" );
        String textWithoutButtonAndExtraSpace = textWithoutButton.trim();
        Assert.assertEquals( textWithoutButtonAndExtraSpace, "I'm a normal "+button+" message. To close use the appropriate button." );

        driver.findElement( By.cssSelector( ".alert-normal-"+button+" > button" ) ).click();
        WebElement message = driver.findElement( By.className( "alert-normal-"+ button ) );

        Assert.assertFalse( message.isDisplayed() );

    }

    @DataProvider
    public Object[][] buttonProvider(){
        return new Object[][]{
                {"success"},
                {"info"},
                {"warning"},
                {"danger"},
        };
    }
}
