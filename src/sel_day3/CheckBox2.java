package sel_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

// https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Multiple Checkbox and check the button message
// When you check all the checkboxes, button message will change to 'Uncheck All'
// When you uncheck at least one checkbox, button message will change to 'Check All'
public class CheckBox2 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");


        List<WebElement> elements = driver.findElements(By.className("cb1-element"));

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).click();

        }
        String text = driver.findElement(By.id("check1")).getAttribute("value");


        if(text.equals("Uncheck All")) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        List<WebElement> elements1 = driver.findElements(By.className("cb1-element"));

        for (int i = 0; i < elements1.size(); i++) {
            elements1.get(i).click();

            String text2 = driver.findElement(By.id("check1")).getAttribute("value");

            if (text2.equals("Check All")) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }


    }
}
