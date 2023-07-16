package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    String URL = "https://www.saucedemo.com/";

    public BasePage(WebDriver driver) {

        this.driver = driver; // create constructor
        wait = new WebDriverWait(driver, 5);
    }

    public abstract boolean isPageOpen();

    public boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public abstract void open();

    public abstract void inputLoginAndPassword(String standardUser, String secretSauce);
}