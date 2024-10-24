package base;

import Page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTests {

    @Test
    public void loginTest() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.login("John Doe", "ThisIsNotAPassword");
        Assert.assertTrue(driver.getPageSource().contains("Make Appointment"));



    }


}
