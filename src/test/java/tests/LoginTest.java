package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {



    @DataProvider(name = "loginData")
    public Object[][] InputForITechTask(){
        return new Object[][]{
                {"", "secret_sauce", "Epic sadface: Username is required" },
                {"", "Art"},
                {15,}
        }
    }
    @Test
    public void loginUserNameWithValidData(priority = 1){


        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        assertTrue(inventoryPage.titleIsVisible);

    }
    @Test
    public void loginUserNameShouldBeRequaired(){
        loginPage.open();
        loginPage.login("","secret_sauce");
        String s = "Epic sadface: Username is required";
        assertEquals((loginPage.getClass() ("Epic sadface: Username is required")));
    }
    @Test
    public void loginBlockUser(){
        loginPage.open();
        loginPage.login("locked_out_user","secret_sauce");
        assertEquals(loginPage.getErrorMessage("Epic sadface: Sorry, this user has been locked out."));

    }
}
