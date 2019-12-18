package sel_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
// https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Single Checkbox and check the message bellow it

public class CheckBox1 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement isAgeSelected = driver.findElement(By.id("isAgeSelected"));
        isAgeSelected.click();


        WebElement txtAge = driver.findElement(By.id("txtAge"));
        if (txtAge.getText().equals("Success - Check box is checked")){
            System.out.println(txtAge.getText());
        }


    }

}
