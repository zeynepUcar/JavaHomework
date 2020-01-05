package sel_day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task2TestNG {
    WebDriver driver;

    @BeforeClass
    public void clickWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/add_remove_elements/" );
    }
    @BeforeMethod
    public  void createButtons() {
        int numberOfButtonsToAdd= 70;

        WebElement btn = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 0; i < numberOfButtonsToAdd; i++) {
            btn.click();
        }
    }

    @Test
    public  void deleteButtonsAndValidate() {
        int number = 50;

        List<WebElement> elements = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        int sizeBeforeDeleting = elements.size();

        List<WebElement> buttonsToDelete = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        int counter = 0;
        for (WebElement webElement : buttonsToDelete) {
            counter++;
            if (counter > number) {
                break;
            }
            webElement.click();
        }

        List<WebElement> elementsAfter = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        int sizeAfterDeleting = elementsAfter.size();

                             //actual            //expected
        Assert.assertEquals(sizeAfterDeleting,(sizeBeforeDeleting - number) );

    }
    @AfterClass
    public void quit() {
        driver.quit();
    }


}
