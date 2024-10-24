package base;

import Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepageTests  extends BaseTests {

    @Test
    public void Checktitle() {
        getWindowManager().goTo("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains("CURA Healthcare Service"));
    }

    @Test
    public void CheckSlogan() {
        getWindowManager().goTo("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains("We Care About Your Health"));
    }

    @Test
    public void CheckAddress() {
        getWindowManager().goTo("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains("We Care About Your Health"));
    }

    @Test
    public void Checkphone() {
        getWindowManager().goTo("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains(" (678) 813-1KMS"));
    }

    @Test
    public void Copyright() {
        getWindowManager().goTo("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertTrue(driver.getPageSource().contains("Copyright © CURA Healthcare Service 2024"));
    }



}