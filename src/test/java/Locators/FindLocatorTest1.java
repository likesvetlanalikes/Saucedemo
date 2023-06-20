package Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class FindLocatorTest1 extends BaseTest {

    @Test
    public void findLocatorTest() {
        driver.get(B_URL);
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();

        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//button")).click();
        driver.findElement(By.xpath("//div[@class='header_secondary_container']//span[@class='title']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        driver.findElement(By.xpath("//input[@class='form-control']")).click();
        driver.findElement(By.xpath("//div[@class='inventory_list']")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//div[@class='inventory_item_name']")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//div[@class='inventory_item_name']")).click();

        driver.findElement(By.cssSelector(".inventory_item:nth-child(1) button.btn_primary")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(2) button.btn_primary")).click();
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        driver.findElement(By.cssSelector(".product_sort_container")).click();
        driver.findElement(By.cssSelector("input.form-control")).click();
        driver.findElement(By.cssSelector(".inventory_list")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_name")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .inventory_item_name")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_price")).click();
        driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .inventory_item_price")).click();
    }
}

