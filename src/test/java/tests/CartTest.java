import org.testng.annotations.Test;
import tests.BaseTest;
import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class cartTest extends BaseTest{
    WebDriver driver;
@Test
public void cartPageTest() {
        cartTest = new cartTest(driver);


        List<Map<String, String>> productList = cartTest.getProducts();
        assertEquals(productList.size(), 2);

        
        cartTest.clickContinueShopping();


        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        }

        private static void clickContinueShopping() {
        }
}