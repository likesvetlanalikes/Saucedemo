package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;




public class CartPage extends BasePage {
    private By products = By.cssSelector(".cart_item");
    private By checkoutButton = By.cssSelector(".checkout_button");
    private By continueShoppingButton = By.cssSelector(".btn_secondary");

    public CartPage(WebDriver driver) {
        super(driver);
    }
        @Override
        public boolean isPageOpen() {
            return isExist(products);
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


