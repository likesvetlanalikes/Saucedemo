package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class CartPage extends BasePage {
    private WebDriver driver;
    private By products = By.cssSelector(".cart_item");
    private By checkoutButton = By.cssSelector(".checkout_button");
    private By continueShoppingButton = By.cssSelector(".btn_secondary");

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    public List<Map<String, String>> getProducts() {
        List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
        List<WebElement> itemElements = driver.findElements(products);
        for (WebElement item : itemElements) {
            Map<String, String> product = new HashMap<String, String>();
            product.put("name", item.findElement(By.cssSelector(".inventory_item_name")).getText());
            product.put("description", item.findElement(By.cssSelector(".inventory_item_desc")).getText());
            product.put("price", item.findElement(By.cssSelector(".inventory_item_price")).getText());
            productList.add(product);
        }
        return productList;
    }
}


