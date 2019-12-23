package sel_day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/AKMERCAN/Desktop/Selenium/Chrome Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

        //2.autocloseable button

        driver.findElement(By.id("autoclosable-btn-warning")).click();
        WebDriverWait wait = new WebDriverWait(driver, 8);


        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("alert-autocloseable-warning")));

            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }

        //3.autocloseable button


        driver.findElement(By.id("autoclosable-btn-danger")).click();



        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("alert-autocloseable-danger")));

            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }

        //4.autocloseable button

        driver.findElement(By.id("autoclosable-btn-info")).click();



        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("alert-autocloseable-info")));

            System.out.println("Success!");
        } catch(Exception e) {
            System.out.println("Failure!");
        }


    }
}
