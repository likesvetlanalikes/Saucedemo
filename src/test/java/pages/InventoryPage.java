package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class  InventoryPage extends BasePage {

    public static final By INVENTORY_TITLE = By.xpath("//span[@class = 'title' and text() = 'Products']");
    public boolean titleIsVisible;
    String addButtonByItemName = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item']//button";

    public InventoryPage(WebDriver driver){
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return isExist(INVENTORY_TITLE);
    }

    public void addItemInCartByItemName(String itemName){
        driver.findElement(By.xpath(String.format(addButtonByItemName,itemName))).click();
    }
    public boolean titleIsVisible(){
        return driver.findElement(INVENTORY_TITLE).isDisplayed();
    }

}
