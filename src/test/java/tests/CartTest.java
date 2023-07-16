package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CartTest extends BaseTest {

    private Object cartPage;

    @Test
    public void returnInventoryPageFromCart() {
        loginPage.open();
        loginPage.inputLoginAndPassword("standard_user", "secret_sauce");
        inventoryPage.clickShoppingCartButton();
        cartPage.clickContinueShoppingButton();

        Assert.assertTrue(inventoryPage.titleInventoryPagesIsVisible(), "Пользователь не перешел на страницу с товарами");
    }

    @Test
    public void clickCheckoutButtonInCart() {
        loginPage.open();
        loginPage.inputLoginAndPassword("standard_user", "secret_sauce");
        inventoryPage.addItemInCartByItemName("Sauce Labs Backpack");
        inventoryPage.clickShoppingCartButton();
        cartPage.clickCheckoutButton();

        Assert.assertTrue(checkoutPage.titleOnCheckoutPageIsVisible(),
                "Пользователь не перешел на страницу Checkout");
    }


}
