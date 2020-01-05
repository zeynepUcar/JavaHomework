package sel_day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class Task1TestNG {
    // http://the-internet.herokuapp.com/add_remove_elements/
    // write a function that takes a number, and clicks the "Add Element" button
    // given number of times, and then validate that given number of
    // "Delete" buttons is displayed

    WebDriver driver;


    @BeforeClass
    public void clickWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }


    @AfterClass
    public void quit() {
        driver.quit();
    }

    @Test
    public void clickAndValidateButtons(){
        int num= 100;
        WebElement btn = driver.findElement( By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < num; i++) {
            btn.click();
        }
        List<WebElement> list = driver.findElements(By.className("added-manually"));
        Assert.assertEquals(list.size(),num);
    }





}
